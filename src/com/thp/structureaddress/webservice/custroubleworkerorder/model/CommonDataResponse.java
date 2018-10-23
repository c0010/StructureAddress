package com.thp.structureaddress.webservice.custroubleworkerorder.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * 
 * @author dingjinyang
 * 报障工单获取抢修信息出参
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CommonDataResponse {

	//OK成功，FAIL失败
	@XmlElement(name="reployCode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String reployCode;
	@XmlElement(name="replyDesc",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String replyDesc;
	public String getReployCode() {
		return reployCode;
	}
	public void setReployCode(String reployCode) {
		this.reployCode = reployCode;
	}
	public String getReplyDesc() {
		return replyDesc;
	}
	public void setReplyDesc(String replyDesc) {
		this.replyDesc = replyDesc;
	}
	
}
