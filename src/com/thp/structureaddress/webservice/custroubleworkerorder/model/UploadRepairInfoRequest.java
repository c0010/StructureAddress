package com.thp.structureaddress.webservice.custroubleworkerorder.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author dingjinyang
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class UploadRepairInfoRequest {

	@XmlElement(name="commonDataRequest",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private CommonDataRequest commonDataRequest;
	
	public void setCommonDataRequest(CommonDataRequest commonDataRequest) {
		this.commonDataRequest = commonDataRequest;
	}
	
	public CommonDataRequest getCommonDataRequest() {
		return commonDataRequest;
	}
	
	
	public String getXMLInfo(){
		StringBuilder sb = new StringBuilder();
		sb.append("<?xml version=\"1.0\" encoding=\"utf-8\"?><soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\"  xmlns:tns=\"http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com/\"><soapenv:Header></soapenv:Header><soapenv:Body><tns:uploadRepairInfoRequest>");
		sb.append(this.getCommonDataRequest().toString());
		sb.append("</tns:uploadRepairInfoRequest></soapenv:Body></soapenv:Envelope>");
		return sb.toString();
	}

}
