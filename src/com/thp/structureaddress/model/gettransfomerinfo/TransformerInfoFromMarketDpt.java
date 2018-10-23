package com.thp.structureaddress.model.gettransfomerinfo;
/**
 * 
 * @author dingjinyang
 * 营销系统台区工程信息
 */
public class TransformerInfoFromMarketDpt {

	//客服报障工单号
	private String orderId;
	//所属台区
	private String transformerId;
	//GISID
	private String gisID;
	//工单处理进度
	private String dealProcess;
	//对应基建项目编号
	private String projectSN;
	//进展
	private String projectProcess;
	//是否受阻
	private String isSuffocate;
	//受阻原因
	private String suffocateReason;
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getTransformerId() {
		return transformerId;
	}
	public void setTransformerId(String transformerId) {
		this.transformerId = transformerId;
	}
	public String getGisID() {
		return gisID;
	}
	public void setGisID(String gisID) {
		this.gisID = gisID;
	}
	public String getDealProcess() {
		return dealProcess;
	}
	public void setDealProcess(String dealProcess) {
		this.dealProcess = dealProcess;
	}
	public String getProjectSN() {
		return projectSN;
	}
	public void setProjectSN(String projectSN) {
		this.projectSN = projectSN;
	}
	public String getProjectProcess() {
		return projectProcess;
	}
	public void setProjectProcess(String projectProcess) {
		this.projectProcess = projectProcess;
	}
	public String getIsSuffocate() {
		return isSuffocate;
	}
	public void setIsSuffocate(String isSuffocate) {
		this.isSuffocate = isSuffocate;
	}
	public String getSuffocateReason() {
		return suffocateReason;
	}
	public void setSuffocateReason(String suffocateReason) {
		this.suffocateReason = suffocateReason;
	}
	
	
	/**
	 * 测试用
	 * @return
	 */
	public static TransformerInfoFromMarketDpt getInstance() {
		TransformerInfoFromMarketDpt marketDpt=new TransformerInfoFromMarketDpt();
		marketDpt.setOrderId("008877663636355");
		marketDpt.setGisID("92977777");
		return marketDpt;
	}
	
	
}
