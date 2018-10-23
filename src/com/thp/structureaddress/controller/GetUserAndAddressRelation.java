package com.thp.structureaddress.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.thp.structureaddress.model.getuserandaddressrelation.AddressAndUserRelation;
import com.thp.structureaddress.model.getuserandaddressrelation.SNTypes;
import com.thp.structureaddress.service.getusersnoraddresssn.GetUsersnOrAddresssnService;

/**
 * 
 * @author dingjinyang
 * 2.1.3功能描述：根据结构化地址序号来获取用户编号，或者通过用户编号获取结构化地址序号和Id。
 */
@Controller
@RequestMapping("GetUserAndAddressRelation")
public class GetUserAndAddressRelation {

	private Logger logger=LoggerFactory.getLogger(GetUserAndAddressRelation.class);
	@Autowired
	private GetUsersnOrAddresssnService usersnOrAddresssnService;
	
	@RequestMapping("/getUserAndAddressRelation")
	public@ResponseBody JSONObject getUserSNOrAddressSN(String serialNumber,String SNType){
		logger.info("调用查询地址序号或用户编号接口------------------");
		
		AddressAndUserRelation relationInfo=null;
		JSONObject json=new JSONObject();
		if(serialNumber==null||SNType==null){
			json.put("code", 1);
			json.put("message", "接收序号及类型失败");
			json.put("relation", "");
			return json;
		}
		
		try {
			if(SNType.equals(SNTypes.ADDRESS_SN)){
				//查询用户号
				relationInfo=usersnOrAddresssnService.getUserSN(serialNumber);
			}else if(SNType.equals(SNTypes.USER_SN)){
				//查询地址序号
				relationInfo=usersnOrAddresssnService.getAddressSN(serialNumber);
			}else if(SNType.equals(SNTypes.ADDRESS_ID)){
				relationInfo=usersnOrAddresssnService.getUsersnAndAddresssn(serialNumber);
			}
		} catch (Exception e) {
			logger.error("查询用户号或者地址序号失败",e);
			e.printStackTrace();
		}
		
		if(relationInfo!=null){
			json.put("code", 0);
			json.put("message", "成功");
			json.put("relation", relationInfo);
		}else{
			json.put("code", 1);
			json.put("message", "未查询到信息");
			json.put("relation", "");
		}
		return json;  
		
	}
	
	
	
}
