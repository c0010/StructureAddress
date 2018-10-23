package com.thp.structureaddress.webservice.custroubleworkerorder.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import com.thp.structureaddress.util.XMLInfoUtil;

/**
 * 
 * @author dingjinyang
 * 任务单数据
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class Root {

	//任务单id
	@XmlElement(name="taskId",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String taskId;
	//任务描述
	@XmlElement(name="taskStatusDescribe",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String taskStatusDescribe;
	//抢修单信息
	@XmlElement(name="repairBill",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private RepairBill repairBill;
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
	public String getTaskStatusDescribe() {
		return taskStatusDescribe;
	}
	public void setTaskStatusDescribe(String taskStatusDescribe) {
		this.taskStatusDescribe = taskStatusDescribe;
	}
	public RepairBill getRepairBill() {
		return repairBill;
	}
	public void setRepairBill(RepairBill repairBill) {
		this.repairBill = repairBill;
	}
	
	@Override
	public String toString() {
		XMLInfoUtil xmlinfoUtil=new XMLInfoUtil();
		String xmlinfoString="";
		try {
			xmlinfoString = xmlinfoUtil.getXMLInfo(this);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "<Root>"+xmlinfoString+"</Root>";
	}
}


