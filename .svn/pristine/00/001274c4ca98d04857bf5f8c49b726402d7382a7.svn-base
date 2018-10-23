package com.thp.structureaddress.service.getusersnoraddresssn.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thp.structureaddress.mapper.GetUserSNOrAddressSNMapper;
import com.thp.structureaddress.model.getuserandaddressrelation.AddressAndUserRelation;
import com.thp.structureaddress.service.getusersnoraddresssn.GetUsersnOrAddresssnService;

@Service
public class GetUsersnOrAddresssnServiceImpl implements GetUsersnOrAddresssnService {

	private Logger logger=LoggerFactory.getLogger(GetUsersnOrAddresssnServiceImpl.class);
	@Autowired
	private GetUserSNOrAddressSNMapper usersnOrAddresssnMapper;
	
	@Override
	public AddressAndUserRelation getUserSN(String serialNumber) {
		AddressAndUserRelation relation=new AddressAndUserRelation();
		try {
			relation=usersnOrAddresssnMapper.getUserSN(serialNumber);
		} catch (Exception e) {
			logger.error("获取用户编号失败",e);
			e.printStackTrace();
		}
		return relation;
	}

	@Override
	public AddressAndUserRelation getAddressSN(String serialNumber) {
		AddressAndUserRelation relation=new AddressAndUserRelation();
		try {
			relation=usersnOrAddresssnMapper.getAddressSN(serialNumber);
		} catch (Exception e) {
			logger.error("获取地址序号失败",e);
			e.printStackTrace();
		}
		return relation;
	}

	@Override
	public AddressAndUserRelation getUsersnAndAddresssn(String serialNumber) {
		AddressAndUserRelation relation=new AddressAndUserRelation();
		try {
			relation=usersnOrAddresssnMapper.getAddressSNAndUserSN(serialNumber);
		} catch (Exception e) {
			logger.error("获取地址序号和用户编号失败",e);
			e.printStackTrace();
		}
		return relation;
	}


}
