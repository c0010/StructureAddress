package com.thp.structureaddress.service.webservicexmlinfo.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thp.structureaddress.mapper.WebserviceXMLInfoMapper;
import com.thp.structureaddress.model.webservicexmlinfo.WebserviceXMLInfo;
import com.thp.structureaddress.service.webservicexmlinfo.WebserviceXMLInfoService;

@Service
public class WebserviceXMLInfoServiceImpl implements WebserviceXMLInfoService{

	@Autowired
	private WebserviceXMLInfoMapper webserviceXMLInfoMapper;
	
	@Override
	public boolean addXMLInfo(WebserviceXMLInfo webserviceXMLInfo) {
		boolean status = false;
		if(webserviceXMLInfo == null){
			return status;
		}
		status = webserviceXMLInfoMapper.add(webserviceXMLInfo);
		return status;
	}

	
}
