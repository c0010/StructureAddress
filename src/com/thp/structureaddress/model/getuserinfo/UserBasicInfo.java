package com.thp.structureaddress.model.getuserinfo;

public class UserBasicInfo {

	//用户编号
	private String userSN;
	//用户名称
	private String userName;
	//用户类型
	private String userType;
	//用户级别
	private String userLevel;
	//联系电话
	private String userTel;
	//所属变压台区
	private String transformer;
	public String getUserSN() {
		return userSN;
	}
	public void setUserSN(String userSN) {
		this.userSN = userSN;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getUserLevel() {
		return userLevel;
	}
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getTransformer() {
		return transformer;
	}
	public void setTransformer(String transformer) {
		this.transformer = transformer;
	}
	
	
	/**
	 * 测试用
	 * @return
	 */
	public static UserBasicInfo getInstance() {
		UserBasicInfo basicInfo=new UserBasicInfo();
		basicInfo.setTransformer("");
		basicInfo.setUserName("张三");
		basicInfo.setUserSN("001");
		basicInfo.setUserTel("17700156782");
		basicInfo.setUserLevel("一级");
		return basicInfo;
	}
	
	
}
