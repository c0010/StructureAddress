package com.thp.structureaddress.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.thp.structureaddress.model.usernumberassociatedcoodinate.CoodinateInfo;
import com.thp.structureaddress.service.usernumberassociatedcoodinate.UserNumberCoodinateService;
/**
 * 
 * @author dingjinyang
 * 用户号关联坐标接口
 * 用户号关联经纬度坐标以及详细地址信息
 */
@Controller
@RequestMapping("UserNumberAssociatedCoodinate")
public class UserNumberAssociatedCoodinate {

	private Logger logger=LoggerFactory.getLogger(UserNumberAssociatedCoodinate.class);
	@Autowired
	private UserNumberCoodinateService userNumberCoodinateService;
	
	@RequestMapping("/getCoodinateInfoByUserNumber")
	public@ResponseBody JSONObject getCoodinateInfoByUserNumber(String userNumber){
		logger.info("调用查询坐标信息接口--------------------");
		JSONObject jsonObject=new JSONObject();
		CoodinateInfo coodinate=null;
		if(userNumber==null){
			jsonObject.put("code", 1);
			jsonObject.put("message", "未接收到用户号");
			return jsonObject;
		}
		
		
		try {
			coodinate=userNumberCoodinateService.getCoodinateInfoByUserNumber(userNumber);	
			if(null!=coodinate){
				JSONObject jsonPart=new JSONObject();
				jsonPart.put("x", coodinate.getLatitude());
				jsonPart.put("y", coodinate.getLongitude());
				jsonPart.put("addressMessage", coodinate.getAddressMessage());
				jsonObject.put("code", 0);
				jsonObject.put("message", "接收信息成功");
				jsonObject.put("data", jsonPart);
			}else{
				jsonObject.put("code", 1);
				jsonObject.put("message", "接收信息失败");
				jsonObject.put("data", "");
			}
		} catch (Exception e) {
			logger.error("error",e);
			e.printStackTrace();
		}

		return jsonObject;
		
	}

	
	
}
