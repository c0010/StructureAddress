package com.thp.structureaddress.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.thp.structureaddress.util.URLUtil;
/**
 * 
 * @author dingjinyang
 * 台区频繁停电接口
 * 1.调用高斌接口获得变压器标识
 * 2.根据变压器标识调用营销接口返回营销信息
 */
@Controller
@RequestMapping("GetFrequencyCutInfo")
public class FrequentOutageDisplayPlatformArea{

	private Logger logger=LoggerFactory.getLogger(FrequentOutageDisplayPlatformArea.class);

	@Value("${BasicInfoURL}")
	private String requestURL;
	@Value("${TaiquServerURL}")
	private String serverURL;

	public String getRequestURL() {
		return requestURL;
	}
	public void setRequestURL(String requestURL) {
		this.requestURL = requestURL;
	}
	public String getServerURL() {
		return serverURL;
	}
	public void setServerURL(String serverURL) {
		this.serverURL = serverURL;
	}
	
	
	@RequestMapping("/getFrequencyCutInfo")
	public@ResponseBody JSONObject getResponseData(String longitude,String latitude) {
		logger.info("调用台区频繁停电接口------");
		System.out.println(this.requestURL);
		JSONObject jsonObject=new JSONObject();
		if(longitude==null||latitude==null){
			jsonObject.put("code", 1);
			jsonObject.put("message", "接收经纬度坐标信息失败");
			return jsonObject;
		}
		//调用高斌接口获取变压器标识
		String transMark=getTransFormerMark(longitude,latitude);
		//根据变压器标识调用营销接口
//		JaxWsProxyFactoryBean factory=new JaxWsProxyFactoryBean();
//	    factory.setAddress(this.serverURL);
//	    factory.setServiceClass(yingxiaoService.class);
//	    factory.getInInterceptors().add(new LoggingInInterceptor());
//	    yingxiaoService service = (yingxiaoService)factory.create();
//	    PublsihCusTroubleTicketInfoGZResponse sresponse = service.publishCusTroubleTicketInfoGZ(inputVO);

		
		
		
		jsonObject.put("code", 0);
	    jsonObject.put("message", "成功接收信息");
//	    jsonObject.put("data", sresponse);
		return jsonObject;
	}
	
	/**
	 * 获取变压器标识
	 * @param longitude
	 * @param latitude
	 * @return
	 */
	private String getTransFormerMark(String longitude,String latitude){
		StringBuffer bf=new StringBuffer();
		bf.append(this.requestURL);
		bf.append("?");
		bf.append("longitude="+longitude);
		bf.append("&latitude="+latitude);
		String transFormerId=URLUtil.urlRequest(bf.toString(), "GET");
		return transFormerId;
		
	}
	
	
}
