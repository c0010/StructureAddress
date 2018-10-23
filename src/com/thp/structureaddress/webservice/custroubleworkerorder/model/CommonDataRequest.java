package com.thp.structureaddress.webservice.custroubleworkerorder.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.thp.structureaddress.util.XMLInfoUtil;

/**
 * 
 * @author dingjinyang
 * 保障工单获取抢修信息入参
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CommonDataRequest {

	@XmlElement(name="account",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String account;
	@XmlElement(name="password",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String password;
	@XmlElement(name="format",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String format;
	//数据
	@XmlElement(name="content",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private Root root;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFormat() {
		return format;
	}
	public void setFormat(String format) {
		this.format = format;
	}
	public Root getRoot() {
		return root;
	}
	public void setRoot(Root root) {
		this.root = root;
	}
	
	
	@Override
	public String toString() {
		StringBuffer sbf=new StringBuffer();
		sbf.append("<commonDataRequest>");
		XMLInfoUtil xmlinfoUtil=new XMLInfoUtil();
		String xmlinfoString="";
		try {
			xmlinfoString = xmlinfoUtil.getXMLInfo(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		sbf.append(xmlinfoString);
		sbf.append("</commonDataRequest>");
		return sbf.toString();
	}
}
