package com.thp.structureaddress.webservice.custroubleworkerorder.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import javax.jws.WebService;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import com.thp.structureaddress.model.custroubleworkerorder.CusTroubleWorkOrderInfo;
import com.thp.structureaddress.model.webservicexmlinfo.WebserviceXMLInfo;
import com.thp.structureaddress.service.custroubleworkerorder.GetCustomerTroubleWorkOrderInfoService;
import com.thp.structureaddress.service.webservicexmlinfo.WebserviceXMLInfoService;
import com.thp.structureaddress.util.HttpClientCallSoapUtil;
import com.thp.structureaddress.webservice.custroubleworkerorder.GetCustomerTroubleWorkOrderInfoWebService;
import com.thp.structureaddress.webservice.custroubleworkerorder.model.CommonDataResponse;
import com.thp.structureaddress.webservice.custroubleworkerorder.model.Root;
import com.thp.structureaddress.webservice.custroubleworkerorder.model.UploadRepairInfoRequest;

/**
 * 
 * @author dingjinyang
 * 保障工单获取抢修信息服务
 */
@WebService(serviceName="GetCustomerTroubleWorkOrderInfoService",targetNamespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
@Controller
public class GetCustomerTroubleWorkOrderInfoWebServiceImpl implements GetCustomerTroubleWorkOrderInfoWebService {

	private Logger logger=Logger.getLogger(GetCustomerTroubleWorkOrderInfoWebServiceImpl.class);
	@Autowired
	private WebserviceXMLInfoService webserviceXMLInfoService;
	@Autowired
	private GetCustomerTroubleWorkOrderInfoService customerTroubleWorkOrderInfoService;
	@Value("${orderRelatedTransURL}")
	private String requestURL;
	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}
	public String getRequestURL() {
		return requestURL;
	}
	
	
	

	@Override
	public CommonDataResponse getCustomerTroubleWorkOrderInfo(UploadRepairInfoRequest repairInfoRequest) {
		logger.info("调用保障工单获取抢修信息接口-----------------");
		CommonDataResponse commonDataResponse=new CommonDataResponse();
		boolean status=false;
		if(repairInfoRequest==null||repairInfoRequest.getCommonDataRequest()==null||
				repairInfoRequest.getCommonDataRequest().getRoot()==null){
			commonDataResponse.setReployCode("FAIL");
			commonDataResponse.setReplyDesc("接收客服工单抢修信息失败，请重新发送");
			return commonDataResponse;
		}
		
		
		WebserviceXMLInfo webserviceXMLInfo=new WebserviceXMLInfo();
		webserviceXMLInfo.setId(UUID.randomUUID().toString());
		webserviceXMLInfo.setXmlInfo(repairInfoRequest.getXMLInfo());
		webserviceXMLInfo.setXmlInfoType("保障工单获取抢修信息");
		webserviceXMLInfo.setXmlReceiveTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		boolean xmlinfoFalg=webserviceXMLInfoService.addXMLInfo(webserviceXMLInfo);
		if(xmlinfoFalg){
			CusTroubleWorkOrderInfo workerOrderInfo=transRootToCusTroubleWorkOrderInfo(repairInfoRequest.getCommonDataRequest().getRoot());
			status=customerTroubleWorkOrderInfoService.add(workerOrderInfo);
			//调用保障工单关联变压器接口
//			orderRelatedTrans(workerOrderInfo.getOid(),workerOrderInfo.getResumeTime());
		}
		
		

		if(status){
			commonDataResponse.setReployCode("OK");
			commonDataResponse.setReplyDesc("保存客服工单抢修信息数据成功");
		}else{
			commonDataResponse.setReployCode("FAIL");
			commonDataResponse.setReplyDesc("保存客服工单抢修信息数据失败");
		}
		
		return commonDataResponse;
	}

	

	/**
	 * 对象转换
	 * @param root
	 * @return
	 */
	private CusTroubleWorkOrderInfo transRootToCusTroubleWorkOrderInfo(Root root){
		CusTroubleWorkOrderInfo workOrderInfo=new CusTroubleWorkOrderInfo();
		if(StringUtils.isNotEmpty(root.getTaskId())){
			workOrderInfo.setTaskId(root.getTaskId());
		}
		workOrderInfo.setTaskStatusDescribe(root.getTaskStatusDescribe());
		if(root.getRepairBill()==null)
			return workOrderInfo;
		
		
		workOrderInfo.setRepairBill(root.getRepairBill());
		return workOrderInfo;
	}
	
	/**
	 * 调用报障工单关联变压器id接口
	 * @param taskId
	 * @param resumeTime
	 */
	private void orderRelatedTrans(String taskId, String resumeTime) {
		StringBuffer sbf=new StringBuffer();
		sbf.append(this.requestURL);
		sbf.append("?orderId="+taskId);
		sbf.append("&resumeTime="+resumeTime);
		HttpClientCallSoapUtil.doGet(sbf.toString());
		
	}
}
