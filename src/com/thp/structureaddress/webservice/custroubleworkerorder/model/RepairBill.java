package com.thp.structureaddress.webservice.custroubleworkerorder.model;

import java.lang.reflect.Field;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

import org.apache.commons.lang3.StringUtils;

import com.thp.structureaddress.util.XMLInfoUtil;

/**
 * 
 * @author dingjinyang
 * 抢修单数据(日期类型字段必须要用字符串替代)
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class RepairBill{
	
	@XmlElement(name="oid",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String oid;
	@XmlElement(name="place",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String place;
	@XmlElement(name="content",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String content;
	@XmlElement(name="dealDetail",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String dealDetail;
	@XmlElement(name="whetherCity",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String whetherCity;
	@XmlElement(name="leaveTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String leaveTime;
	@XmlElement(name="arriveTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String arriveTime;
	@XmlElement(name="resumeTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String resumeTime;
	@XmlElement(name="forecastTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String forecastTime;
	@XmlElement(name="presider",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String presider;
	@XmlElement(name="zoneId",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String zoneId;
	@XmlElement(name="departmentId",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String departmentId;
	@XmlElement(name="createId",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String createId;
	@XmlElement(name="createName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String createName;
	@XmlElement(name="createTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String createTime;
	@XmlElement(name="updateId",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String updateId;
	@XmlElement(name="updateName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String updateName;
	@XmlElement(name="updateTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String updateTime;
	@XmlElement(name="dataState",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int dataState;
	@XmlElement(name="overtimeCausal",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String overtimeCausal;
	@XmlElement(name="toExplainUser",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String toExplainUser;
	@XmlElement(name="isOvertime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String isOvertime;
	@XmlElement(name="userNumber",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int userNumber;
	@XmlElement(name="businessState",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String businessState;
	@XmlElement(name="voltageLevel",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String voltageLevel;
	@XmlElement(name="troubleArea",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String troubleArea;
	@XmlElement(name="isLateArrive",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int isLateArrive;
	@XmlElement(name="locateTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String locateTime;
	@XmlElement(name="resumeTimeOfUnTrouble",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String resumeTimeOfUnTrouble;
	@XmlElement(name="hasTurnSupply",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int hasTurnSupply;
	@XmlElement(name="doTurnSupply",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int doTurnSupply;
	@XmlElement(name="materialSendTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String materialSendTime;
	@XmlElement(name="materialArriveTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String materialArriveTime;
	@XmlElement(name="groupName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String groupName;
	@XmlElement(name="repairBillType",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String repairBillType;
	@XmlElement(name="troubleEquipment",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String troubleEquipment;
	@XmlElement(name="troubleCause",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String troubleCause;
	@XmlElement(name="isPdaUpload",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int isPdaUpload;
	@XmlElement(name="pdaUploadTime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pdaUploadTime;
	@XmlElement(name="pdaUploadPerson",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pdaUploadPerson;
	@XmlElement(name="sendPlaceId",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String sendPlaceId;
	@XmlElement(name="zoneIdTmp",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String zoneIdTmp;
	@XmlElement(name="unormalreason",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String unormalreason;
	@XmlElement(name="repairBillTypeName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String repairBillTypeName;
	@XmlElement(name="toubleEquipName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String toubleEquipName;
	@XmlElement(name="toubleEquipId",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String toubleEquipId;
	@XmlElement(name="pdaState",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int pdaState;
	@XmlElement(name="unturnSupplyReason",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String unturnSupplyReason;
	@XmlElement(name="isRepleadEqm",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String isRepleadEqm;
	@XmlElement(name="cyqxUsernames",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String cyqxUsernames;
	@XmlElement(name="eventSttime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String eventSttime;
	@XmlElement(name="effectDepts",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String effectDepts;
	@XmlElement(name="effectDeptnames",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String effectDeptnames;
	@XmlElement(name="parentOid",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String parentOid;
	@XmlElement(name="eventType",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int eventType;
	@XmlElement(name="eqmType",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int eqmType;
	@XmlElement(name="needMatrerial",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String needMatrerial;
	@XmlElement(name="isNeedassignunit",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int isNeedassignunit;
	@XmlElement(name="assignunitNeedtime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String assignunitNeedtime;
	@XmlElement(name="assignunitArrivetime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String assignunitArrivetime;
	@XmlElement(name="isPeopleGather",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int isPeopleGather;
	@XmlElement(name="isHasMedia",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int isHasMedia;
	@XmlElement(name="isPeopleTrapped",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int isPeopleTrapped;
	@XmlElement(name="repairMemo",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String repairMemo;
	@XmlElement(name="powerofNature",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String powerofNature;
	@XmlElement(name="responseReason",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String responseReason;
	@XmlElement(name="maingridUnit",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String maingridUnit;
	@XmlElement(name="technologyReason",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String technologyReason;
	@XmlElement(name="specialAnaly",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String specialAnaly;
	@XmlElement(name="relateReportcode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String relateReportcode;
	@XmlElement(name="singStatus",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int singStatus;
	@XmlElement(name="troubleDesc",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String troubleDesc;
	@XmlElement(name="pwRepairDetail",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwRepairDetail;
	@XmlElement(name="turnswitchRecord",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String turnswitchRecord;
	@XmlElement(name="repairStarttime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String repairStarttime;
	@XmlElement(name="repairEndtime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String repairEndtime;
	@XmlElement(name="unturnSupplyMemo",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String unturnSupplyMemo;
	@XmlElement(name="pwToubletypeid",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwToubletypeid;
	@XmlElement(name="pwToubletypename",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwToubletypename;
	@XmlElement(name="pwToubleeqmid",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwToubleeqmid;
	@XmlElement(name="",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwToubleeqmname;
	@XmlElement(name="pwDiqi",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwDiqi;
	@XmlElement(name="pwActiondesc",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwActiondesc;
	@XmlElement(name="pwResontype",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwResontype;
	@XmlElement(name="pwTianqi",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwTianqi;
	@XmlElement(name="pwJbdate",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwJbdate;
	@XmlElement(name="pwLastmodifyuserid",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwLastmodifyuserid;
	@XmlElement(name="pwLastmodifyusername",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwLastmodifyusername;
	@XmlElement(name="pwResonmemo",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwResonmemo;
	@XmlElement(name="pwRecdept",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwRecdept;
	@XmlElement(name="pwPwmemo",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String pwPwmemo;
	@XmlElement(name="troubleEquipment_id",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String troubleEquipment_id;
	@XmlElement(name="unturnSupplyReasoncode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String unturnSupplyReasoncode;
	@XmlElement(name="powerofNaturecode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String powerofNaturecode;
	@XmlElement(name="responseReasoncode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String responseReasoncode;
	@XmlElement(name="maingridUnitcode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String maingridUnitcode;
	@XmlElement(name="technologyReasoncode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String technologyReasoncode;
	@XmlElement(name="specialAnalycode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String specialAnalycode;
	@XmlElement(name="forecastTimeReason",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String forecastTimeReason;
	@XmlElement(name="courts",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String courts;
	@XmlElement(name="lossload",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String lossload;
	@XmlElement(name="losskwh",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String losskwh;
	@XmlElement(name="losstime",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String losstime;
	@XmlElement(name="insiteMaterial",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String insiteMaterial;
	@XmlElement(name="longitude",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private double longitude;
	@XmlElement(name="latitude",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private double latitude;
	@XmlElement(name="faultno4a",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String faultno4a;
	@XmlElement(name="csworkorderno4a",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String csworkorderno4a;
	@XmlElement(name="participantId",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String participantId;
	@XmlElement(name="participantName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String participantName;
	@XmlElement(name="g3eFid",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String g3eFid;
	@XmlElement(name="lineElectricRoom",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String lineElectricRoom;
	@XmlElement(name="transformerSubstationName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String transformerSubstationName;
	@XmlElement(name="feederLineName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String feederLineName;
	@XmlElement(name="electricalRoomName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String electricalRoomName;
	@XmlElement(name="troubleReasonTypeCode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String troubleReasonTypeCode;
	@XmlElement(name="troubleReasonTypeName",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String troubleReasonTypeName;
	@XmlElement(name="unappcause",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String unappcause;
	@XmlElement(name="isTransfer",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int isTransfer;
	@XmlElement(name="iscc",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private int iscc;
	@XmlElement(name="reportLongitude",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private double reportLongitude;
	@XmlElement(name="reportLatitude",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private double reportLatitude;
	@XmlElement(name="ammeterCode",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String ammeterCode;
	@XmlElement(name="ammeterId",namespace="http://repairBillInfoReceive.server.webservice.ksfd.gzkit.com")
	private String ammeterId;

	
	public String getOid() {
		return oid;
	}

	public void setOid(String oid) {
		this.oid = oid;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDealDetail() {
		return dealDetail;
	}

	public void setDealDetail(String dealDetail) {
		this.dealDetail = dealDetail;
	}

	public String getWhetherCity() {
		return whetherCity;
	}

	public void setWhetherCity(String whetherCity) {
		this.whetherCity = whetherCity;
	}

	public String getLeaveTime() {
		return leaveTime;
	}

	public void setLeaveTime(String leaveTime) {
		this.leaveTime = leaveTime;
	}

	public String getArriveTime() {
		return arriveTime;
	}

	public void setArriveTime(String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public String getResumeTime() {
		return resumeTime;
	}

	public void setResumeTime(String resumeTime) {
		this.resumeTime = resumeTime;
	}

	public String getForecastTime() {
		return forecastTime;
	}

	public void setForecastTime(String forecastTime) {
		this.forecastTime = forecastTime;
	}

	public String getPresider() {
		return presider;
	}

	public void setPresider(String presider) {
		this.presider = presider;
	}

	public String getZoneId() {
		return zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getCreateId() {
		return createId;
	}

	public void setCreateId(String createId) {
		this.createId = createId;
	}

	public String getCreateName() {
		return createName;
	}

	public void setCreateName(String createName) {
		this.createName = createName;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}

	public String getUpdateName() {
		return updateName;
	}

	public void setUpdateName(String updateName) {
		this.updateName = updateName;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public int getDataState() {
		return dataState;
	}

	public void setDataState(int dataState) {
		this.dataState = dataState;
	}

	public String getOvertimeCausal() {
		return overtimeCausal;
	}

	public void setOvertimeCausal(String overtimeCausal) {
		this.overtimeCausal = overtimeCausal;
	}

	public String getToExplainUser() {
		return toExplainUser;
	}

	public void setToExplainUser(String toExplainUser) {
		this.toExplainUser = toExplainUser;
	}

	public String getIsOvertime() {
		return isOvertime;
	}

	public void setIsOvertime(String isOvertime) {
		this.isOvertime = isOvertime;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public String getBusinessState() {
		return businessState;
	}

	public void setBusinessState(String businessState) {
		this.businessState = businessState;
	}

	public String getVoltageLevel() {
		return voltageLevel;
	}

	public void setVoltageLevel(String voltageLevel) {
		this.voltageLevel = voltageLevel;
	}

	public String getTroubleArea() {
		return troubleArea;
	}

	public void setTroubleArea(String troubleArea) {
		this.troubleArea = troubleArea;
	}

	public int getIsLateArrive() {
		return isLateArrive;
	}

	public void setIsLateArrive(int isLateArrive) {
		this.isLateArrive = isLateArrive;
	}

	public String getLocateTime() {
		return locateTime;
	}

	public void setLocateTime(String locateTime) {
		this.locateTime = locateTime;
	}

	public String getResumeTimeOfUnTrouble() {
		return resumeTimeOfUnTrouble;
	}

	public void setResumeTimeOfUnTrouble(String resumeTimeOfUnTrouble) {
		this.resumeTimeOfUnTrouble = resumeTimeOfUnTrouble;
	}

	public int getHasTurnSupply() {
		return hasTurnSupply;
	}

	public void setHasTurnSupply(int hasTurnSupply) {
		this.hasTurnSupply = hasTurnSupply;
	}

	public int getDoTurnSupply() {
		return doTurnSupply;
	}

	public void setDoTurnSupply(int doTurnSupply) {
		this.doTurnSupply = doTurnSupply;
	}

	public String getMaterialSendTime() {
		return materialSendTime;
	}

	public void setMaterialSendTime(String materialSendTime) {
		this.materialSendTime = materialSendTime;
	}

	public String getMaterialArriveTime() {
		return materialArriveTime;
	}

	public void setMaterialArriveTime(String materialArriveTime) {
		this.materialArriveTime = materialArriveTime;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getRepairBillType() {
		return repairBillType;
	}

	public void setRepairBillType(String repairBillType) {
		this.repairBillType = repairBillType;
	}

	public String getTroubleEquipment() {
		return troubleEquipment;
	}

	public void setTroubleEquipment(String troubleEquipment) {
		this.troubleEquipment = troubleEquipment;
	}

	public String getTroubleCause() {
		return troubleCause;
	}

	public void setTroubleCause(String troubleCause) {
		this.troubleCause = troubleCause;
	}

	public int getIsPdaUpload() {
		return isPdaUpload;
	}

	public void setIsPdaUpload(int isPdaUpload) {
		this.isPdaUpload = isPdaUpload;
	}

	public String getPdaUploadTime() {
		return pdaUploadTime;
	}

	public void setPdaUploadTime(String pdaUploadTime) {
		this.pdaUploadTime = pdaUploadTime;
	}

	public String getPdaUploadPerson() {
		return pdaUploadPerson;
	}

	public void setPdaUploadPerson(String pdaUploadPerson) {
		this.pdaUploadPerson = pdaUploadPerson;
	}

	public String getSendPlaceId() {
		return sendPlaceId;
	}

	public void setSendPlaceId(String sendPlaceId) {
		this.sendPlaceId = sendPlaceId;
	}

	public String getZoneIdTmp() {
		return zoneIdTmp;
	}

	public void setZoneIdTmp(String zoneIdTmp) {
		this.zoneIdTmp = zoneIdTmp;
	}

	public String getUnormalreason() {
		return unormalreason;
	}

	public void setUnormalreason(String unormalreason) {
		this.unormalreason = unormalreason;
	}

	public String getRepairBillTypeName() {
		return repairBillTypeName;
	}

	public void setRepairBillTypeName(String repairBillTypeName) {
		this.repairBillTypeName = repairBillTypeName;
	}

	public String getToubleEquipName() {
		return toubleEquipName;
	}

	public void setToubleEquipName(String toubleEquipName) {
		this.toubleEquipName = toubleEquipName;
	}

	public String getToubleEquipId() {
		return toubleEquipId;
	}

	public void setToubleEquipId(String toubleEquipId) {
		this.toubleEquipId = toubleEquipId;
	}

	public int getPdaState() {
		return pdaState;
	}

	public void setPdaState(int pdaState) {
		this.pdaState = pdaState;
	}

	public String getUnturnSupplyReason() {
		return unturnSupplyReason;
	}

	public void setUnturnSupplyReason(String unturnSupplyReason) {
		this.unturnSupplyReason = unturnSupplyReason;
	}

	public String getIsRepleadEqm() {
		return isRepleadEqm;
	}

	public void setIsRepleadEqm(String isRepleadEqm) {
		this.isRepleadEqm = isRepleadEqm;
	}

	public String getCyqxUsernames() {
		return cyqxUsernames;
	}

	public void setCyqxUsernames(String cyqxUsernames) {
		this.cyqxUsernames = cyqxUsernames;
	}

	public String getEventSttime() {
		return eventSttime;
	}

	public void setEventSttime(String eventSttime) {
		this.eventSttime = eventSttime;
	}

	public String getEffectDepts() {
		return effectDepts;
	}

	public void setEffectDepts(String effectDepts) {
		this.effectDepts = effectDepts;
	}

	public String getEffectDeptnames() {
		return effectDeptnames;
	}

	public void setEffectDeptnames(String effectDeptnames) {
		this.effectDeptnames = effectDeptnames;
	}

	public String getParentOid() {
		return parentOid;
	}

	public void setParentOid(String parentOid) {
		this.parentOid = parentOid;
	}

	public int getEventType() {
		return eventType;
	}

	public void setEventType(int eventType) {
		this.eventType = eventType;
	}

	public int getEqmType() {
		return eqmType;
	}

	public void setEqmType(int eqmType) {
		this.eqmType = eqmType;
	}

	public String getNeedMatrerial() {
		return needMatrerial;
	}

	public void setNeedMatrerial(String needMatrerial) {
		this.needMatrerial = needMatrerial;
	}

	public int getIsNeedassignunit() {
		return isNeedassignunit;
	}

	public void setIsNeedassignunit(int isNeedassignunit) {
		this.isNeedassignunit = isNeedassignunit;
	}

	public String getAssignunitNeedtime() {
		return assignunitNeedtime;
	}

	public void setAssignunitNeedtime(String assignunitNeedtime) {
		this.assignunitNeedtime = assignunitNeedtime;
	}

	public String getAssignunitArrivetime() {
		return assignunitArrivetime;
	}

	public void setAssignunitArrivetime(String assignunitArrivetime) {
		this.assignunitArrivetime = assignunitArrivetime;
	}

	public int getIsPeopleGather() {
		return isPeopleGather;
	}

	public void setIsPeopleGather(int isPeopleGather) {
		this.isPeopleGather = isPeopleGather;
	}

	public int getIsHasMedia() {
		return isHasMedia;
	}

	public void setIsHasMedia(int isHasMedia) {
		this.isHasMedia = isHasMedia;
	}

	public int getIsPeopleTrapped() {
		return isPeopleTrapped;
	}

	public void setIsPeopleTrapped(int isPeopleTrapped) {
		this.isPeopleTrapped = isPeopleTrapped;
	}

	public String getRepairMemo() {
		return repairMemo;
	}

	public void setRepairMemo(String repairMemo) {
		this.repairMemo = repairMemo;
	}

	public String getPowerofNature() {
		return powerofNature;
	}

	public void setPowerofNature(String powerofNature) {
		this.powerofNature = powerofNature;
	}

	public String getResponseReason() {
		return responseReason;
	}

	public void setResponseReason(String responseReason) {
		this.responseReason = responseReason;
	}

	public String getMaingridUnit() {
		return maingridUnit;
	}

	public void setMaingridUnit(String maingridUnit) {
		this.maingridUnit = maingridUnit;
	}

	public String getTechnologyReason() {
		return technologyReason;
	}

	public void setTechnologyReason(String technologyReason) {
		this.technologyReason = technologyReason;
	}

	public String getSpecialAnaly() {
		return specialAnaly;
	}

	public void setSpecialAnaly(String specialAnaly) {
		this.specialAnaly = specialAnaly;
	}

	public String getRelateReportcode() {
		return relateReportcode;
	}

	public void setRelateReportcode(String relateReportcode) {
		this.relateReportcode = relateReportcode;
	}

	public int getSingStatus() {
		return singStatus;
	}

	public void setSingStatus(int singStatus) {
		this.singStatus = singStatus;
	}

	public String getTroubleDesc() {
		return troubleDesc;
	}

	public void setTroubleDesc(String troubleDesc) {
		this.troubleDesc = troubleDesc;
	}

	public String getPwRepairDetail() {
		return pwRepairDetail;
	}

	public void setPwRepairDetail(String pwRepairDetail) {
		this.pwRepairDetail = pwRepairDetail;
	}

	public String getTurnswitchRecord() {
		return turnswitchRecord;
	}

	public void setTurnswitchRecord(String turnswitchRecord) {
		this.turnswitchRecord = turnswitchRecord;
	}

	public String getRepairStarttime() {
		return repairStarttime;
	}

	public void setRepairStarttime(String repairStarttime) {
		this.repairStarttime = repairStarttime;
	}

	public String getRepairEndtime() {
		return repairEndtime;
	}

	public void setRepairEndtime(String repairEndtime) {
		this.repairEndtime = repairEndtime;
	}

	public String getUnturnSupplyMemo() {
		return unturnSupplyMemo;
	}

	public void setUnturnSupplyMemo(String unturnSupplyMemo) {
		this.unturnSupplyMemo = unturnSupplyMemo;
	}

	public String getPwToubletypeid() {
		return pwToubletypeid;
	}

	public void setPwToubletypeid(String pwToubletypeid) {
		this.pwToubletypeid = pwToubletypeid;
	}

	public String getPwToubletypename() {
		return pwToubletypename;
	}

	public void setPwToubletypename(String pwToubletypename) {
		this.pwToubletypename = pwToubletypename;
	}

	public String getPwToubleeqmid() {
		return pwToubleeqmid;
	}

	public void setPwToubleeqmid(String pwToubleeqmid) {
		this.pwToubleeqmid = pwToubleeqmid;
	}

	public String getPwToubleeqmname() {
		return pwToubleeqmname;
	}

	public void setPwToubleeqmname(String pwToubleeqmname) {
		this.pwToubleeqmname = pwToubleeqmname;
	}

	public String getPwDiqi() {
		return pwDiqi;
	}

	public void setPwDiqi(String pwDiqi) {
		this.pwDiqi = pwDiqi;
	}

	public String getPwActiondesc() {
		return pwActiondesc;
	}

	public void setPwActiondesc(String pwActiondesc) {
		this.pwActiondesc = pwActiondesc;
	}

	public String getPwResontype() {
		return pwResontype;
	}

	public void setPwResontype(String pwResontype) {
		this.pwResontype = pwResontype;
	}

	public String getPwTianqi() {
		return pwTianqi;
	}

	public void setPwTianqi(String pwTianqi) {
		this.pwTianqi = pwTianqi;
	}

	public String getPwJbdate() {
		return pwJbdate;
	}

	public void setPwJbdate(String pwJbdate) {
		this.pwJbdate = pwJbdate;
	}

	public String getPwLastmodifyuserid() {
		return pwLastmodifyuserid;
	}

	public void setPwLastmodifyuserid(String pwLastmodifyuserid) {
		this.pwLastmodifyuserid = pwLastmodifyuserid;
	}

	public String getPwLastmodifyusername() {
		return pwLastmodifyusername;
	}

	public void setPwLastmodifyusername(String pwLastmodifyusername) {
		this.pwLastmodifyusername = pwLastmodifyusername;
	}

	public String getPwResonmemo() {
		return pwResonmemo;
	}

	public void setPwResonmemo(String pwResonmemo) {
		this.pwResonmemo = pwResonmemo;
	}

	public String getPwRecdept() {
		return pwRecdept;
	}

	public void setPwRecdept(String pwRecdept) {
		this.pwRecdept = pwRecdept;
	}

	public String getPwPwmemo() {
		return pwPwmemo;
	}

	public void setPwPwmemo(String pwPwmemo) {
		this.pwPwmemo = pwPwmemo;
	}

	public String getTroubleEquipment_id() {
		return troubleEquipment_id;
	}

	public void setTroubleEquipment_id(String troubleEquipment_id) {
		this.troubleEquipment_id = troubleEquipment_id;
	}

	public String getUnturnSupplyReasoncode() {
		return unturnSupplyReasoncode;
	}

	public void setUnturnSupplyReasoncode(String unturnSupplyReasoncode) {
		this.unturnSupplyReasoncode = unturnSupplyReasoncode;
	}

	public String getPowerofNaturecode() {
		return powerofNaturecode;
	}

	public void setPowerofNaturecode(String powerofNaturecode) {
		this.powerofNaturecode = powerofNaturecode;
	}

	public String getResponseReasoncode() {
		return responseReasoncode;
	}

	public void setResponseReasoncode(String responseReasoncode) {
		this.responseReasoncode = responseReasoncode;
	}

	public String getMaingridUnitcode() {
		return maingridUnitcode;
	}

	public void setMaingridUnitcode(String maingridUnitcode) {
		this.maingridUnitcode = maingridUnitcode;
	}

	public String getTechnologyReasoncode() {
		return technologyReasoncode;
	}

	public void setTechnologyReasoncode(String technologyReasoncode) {
		this.technologyReasoncode = technologyReasoncode;
	}

	public String getSpecialAnalycode() {
		return specialAnalycode;
	}

	public void setSpecialAnalycode(String specialAnalycode) {
		this.specialAnalycode = specialAnalycode;
	}

	public String getForecastTimeReason() {
		return forecastTimeReason;
	}

	public void setForecastTimeReason(String forecastTimeReason) {
		this.forecastTimeReason = forecastTimeReason;
	}

	public String getCourts() {
		return courts;
	}

	public void setCourts(String courts) {
		this.courts = courts;
	}

	public String getLossload() {
		return lossload;
	}

	public void setLossload(String lossload) {
		this.lossload = lossload;
	}

	public String getLosskwh() {
		return losskwh;
	}

	public void setLosskwh(String losskwh) {
		this.losskwh = losskwh;
	}

	public String getLosstime() {
		return losstime;
	}

	public void setLosstime(String losstime) {
		this.losstime = losstime;
	}

	public String getInsiteMaterial() {
		return insiteMaterial;
	}

	public void setInsiteMaterial(String insiteMaterial) {
		this.insiteMaterial = insiteMaterial;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public String getFaultno4a() {
		return faultno4a;
	}

	public void setFaultno4a(String faultno4a) {
		this.faultno4a = faultno4a;
	}

	public String getCsworkorderno4a() {
		return csworkorderno4a;
	}

	public void setCsworkorderno4a(String csworkorderno4a) {
		this.csworkorderno4a = csworkorderno4a;
	}

	public String getParticipantId() {
		return participantId;
	}

	public void setParticipantId(String participantId) {
		this.participantId = participantId;
	}

	public String getParticipantName() {
		return participantName;
	}

	public void setParticipantName(String participantName) {
		this.participantName = participantName;
	}

	public String getG3eFid() {
		return g3eFid;
	}

	public void setG3eFid(String g3eFid) {
		this.g3eFid = g3eFid;
	}

	public String getLineElectricRoom() {
		return lineElectricRoom;
	}

	public void setLineElectricRoom(String lineElectricRoom) {
		this.lineElectricRoom = lineElectricRoom;
	}

	public String getTransformerSubstationName() {
		return transformerSubstationName;
	}

	public void setTransformerSubstationName(String transformerSubstationName) {
		this.transformerSubstationName = transformerSubstationName;
	}

	public String getFeederLineName() {
		return feederLineName;
	}

	public void setFeederLineName(String feederLineName) {
		this.feederLineName = feederLineName;
	}

	public String getElectricalRoomName() {
		return electricalRoomName;
	}

	public void setElectricalRoomName(String electricalRoomName) {
		this.electricalRoomName = electricalRoomName;
	}

	public String getTroubleReasonTypeCode() {
		return troubleReasonTypeCode;
	}

	public void setTroubleReasonTypeCode(String troubleReasonTypeCode) {
		this.troubleReasonTypeCode = troubleReasonTypeCode;
	}

	public String getTroubleReasonTypeName() {
		return troubleReasonTypeName;
	}

	public void setTroubleReasonTypeName(String troubleReasonTypeName) {
		this.troubleReasonTypeName = troubleReasonTypeName;
	}

	public String getUnappcause() {
		return unappcause;
	}

	public void setUnappcause(String unappcause) {
		this.unappcause = unappcause;
	}

	public int getIsTransfer() {
		return isTransfer;
	}

	public void setIsTransfer(int isTransfer) {
		this.isTransfer = isTransfer;
	}

	public int getIscc() {
		return iscc;
	}

	public void setIscc(int iscc) {
		this.iscc = iscc;
	}

	public double getReportLongitude() {
		return reportLongitude;
	}

	public void setReportLongitude(double reportLongitude) {
		this.reportLongitude = reportLongitude;
	}

	public double getReportLatitude() {
		return reportLatitude;
	}

	public void setReportLatitude(double reportLatitude) {
		this.reportLatitude = reportLatitude;
	}

	public String getAmmeterCode() {
		return ammeterCode;
	}

	public void setAmmeterCode(String ammeterCode) {
		this.ammeterCode = ammeterCode;
	}

	public String getAmmeterId() {
		return ammeterId;
	}

	public void setAmmeterId(String ammeterId) {
		this.ammeterId = ammeterId;
	}

	public Object getValue(String name) {
		String fieldName="";
		Object fieldValue=null;
		if(StringUtils.isEmpty(name))
			return null;
		Field[] fields=this.getClass().getDeclaredFields();
		if(fields!=null&&fields.length>0){
			for(Field f : fields){
				if(f==null)continue;
				f.setAccessible(true);
				fieldName=f.getName();
				if(name.equals(fieldName)){
					try {
						fieldValue=f.get(this);
						return fieldValue;
					} catch (Exception e) {
						e.printStackTrace();
					} 
				}
			}
		}
		return fieldValue;
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
		return xmlinfoString;
	}
	
}
