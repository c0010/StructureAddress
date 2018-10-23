package com.thp.structureaddress.model.gettransfomerinfo;

/**
 * 
 * @author dingjinyang
 * 频繁停电信息
 */
public class TransformerFrequencyCutInfo {

	//变压器ID
	private String transformerId;
	//一个月内停电次数
	private String oneMonthfaultTime;
	//三月内停电次数
	private String threeMonthFaultTime;
	//半年停电次数
	private String halfYearFaultTime;
	//一年停电次数
	private String oneYearFaultTime;
	//三年停电次数
	private String threeYearFaultTime;
	public String getTransformerId() {
		return transformerId;
	}
	public void setTransformerId(String transformerId) {
		this.transformerId = transformerId;
	}
	public String getOneMonthfaultTime() {
		return oneMonthfaultTime;
	}
	public void setOneMonthfaultTime(String oneMonthfaultTime) {
		this.oneMonthfaultTime = oneMonthfaultTime;
	}
	public String getThreeMonthFaultTime() {
		return threeMonthFaultTime;
	}
	public void setThreeMonthFaultTime(String threeMonthFaultTime) {
		this.threeMonthFaultTime = threeMonthFaultTime;
	}
	public String getHalfYearFaultTime() {
		return halfYearFaultTime;
	}
	public void setHalfYearFaultTime(String halfYearFaultTime) {
		this.halfYearFaultTime = halfYearFaultTime;
	}
	public String getOneYearFaultTime() {
		return oneYearFaultTime;
	}
	public void setOneYearFaultTime(String oneYearFaultTime) {
		this.oneYearFaultTime = oneYearFaultTime;
	}
	public String getThreeYearFaultTime() {
		return threeYearFaultTime;
	}
	public void setThreeYearFaultTime(String threeYearFaultTime) {
		this.threeYearFaultTime = threeYearFaultTime;
	}
	
	
	/**
	 * 测试用
	 * @return
	 */
	public static TransformerFrequencyCutInfo getInstance() {
		TransformerFrequencyCutInfo cutInfo=new TransformerFrequencyCutInfo();
		cutInfo.setTransformerId("00000000001");
		cutInfo.setHalfYearFaultTime("10");
		return cutInfo;
	}
	
}
