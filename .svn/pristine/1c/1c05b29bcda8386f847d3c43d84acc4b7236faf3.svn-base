package com.thp.structureaddress.service.custroubleworkerorder.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thp.structureaddress.mapper.GetCustomerTroubleWorkOrderInfoMapper;
import com.thp.structureaddress.model.custroubleworkerorder.CusTroubleWorkOrderInfo;
import com.thp.structureaddress.service.custroubleworkerorder.GetCustomerTroubleWorkOrderInfoService;

@Service
public class GetCustomerTroubleWorkOrderInfoServiceImpl implements GetCustomerTroubleWorkOrderInfoService{

	@Autowired
	private GetCustomerTroubleWorkOrderInfoMapper workOrderInfoMapper;
	/**
	 * 保存客服保障抢修信息
	 */
	@Override
	public boolean add(CusTroubleWorkOrderInfo workerOrderInfo) {
		boolean flag=false;
		if(workerOrderInfo==null)
			return flag;
		flag=workOrderInfoMapper.add(workerOrderInfo);
		return flag;
	}

	
}
