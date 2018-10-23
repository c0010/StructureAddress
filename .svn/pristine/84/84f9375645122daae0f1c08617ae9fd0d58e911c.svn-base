package com.thp.structureaddress.service.usernumberassociatedcoodinate.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thp.structureaddress.mapper.UserNumberCoodinateMapper;
import com.thp.structureaddress.model.usernumberassociatedcoodinate.CoodinateInfo;
import com.thp.structureaddress.service.usernumberassociatedcoodinate.UserNumberCoodinateService;

@Service
public class UserNumberCoodinateServiceImpl implements UserNumberCoodinateService{

	private Logger logger=LoggerFactory.getLogger(UserNumberCoodinateServiceImpl.class);
	@Autowired
	private UserNumberCoodinateMapper userNumberCoodinateMapper;
	@Override
	public CoodinateInfo getCoodinateInfoByUserNumber(String userNumber) {
		CoodinateInfo coodinate=new CoodinateInfo();
		if(userNumber==null)
			return coodinate;
		try {
			coodinate=userNumberCoodinateMapper.getCoodinateInfoByUserNumber(userNumber);
		} catch (Exception e) {
			logger.error(e.toString());
			e.printStackTrace();
		}
		return coodinate;
	}

}
