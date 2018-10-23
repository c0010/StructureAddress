package com.thp.structureaddress.service.addressassociatedusernumber.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thp.structureaddress.mapper.AddressUserNumberMapper;
import com.thp.structureaddress.service.addressassociatedusernumber.GetUserNumberService;
@Service
public class GetUserNumberServiceImpl implements GetUserNumberService {

	private Logger logger=LoggerFactory.getLogger(GetUserNumberServiceImpl.class);
	
	@Autowired
	private AddressUserNumberMapper addressUserNumberMapper;
	
	@Override
	public List<String> getUserNumber(List<String> numsList) {
		List<String> numbers=new ArrayList<String>();
		if(numsList!=null&&numsList.size()>0){
			try {
				numbers=addressUserNumberMapper.getUserNumberByAddress(numsList);
			} catch (Exception e) {
				logger.error(e.toString());
				e.printStackTrace();
			}
		}
		return numbers;
	}

}
