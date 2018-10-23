package com.thp.structureaddress.webservice.custroubleworkerorder;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.thp.structureaddress.webservice.custroubleworkerorder.model.CommonDataResponse;
import com.thp.structureaddress.webservice.custroubleworkerorder.model.UploadRepairInfoRequest;

@WebService(targetNamespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
@SOAPBinding(parameterStyle=SOAPBinding.ParameterStyle.BARE)
public interface GetCustomerTroubleWorkOrderInfoWebService {

	@WebMethod
	@WebResult(name="CommonDataResponse",targetNamespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com",partName = "uploadRepairInfoRequest")
	public CommonDataResponse getCustomerTroubleWorkOrderInfo(
			@WebParam(name="uploadRepairInfoRequest",targetNamespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")UploadRepairInfoRequest request);
	
}
