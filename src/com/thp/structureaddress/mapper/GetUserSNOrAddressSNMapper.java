package com.thp.structureaddress.mapper;

import org.apache.ibatis.annotations.Param;

import com.thp.structureaddress.model.getuserandaddressrelation.AddressAndUserRelation;

public interface GetUserSNOrAddressSNMapper {

	/**根据地址序号获得用户号*/
	public AddressAndUserRelation getUserSN(@Param("number")String number)throws Exception;
	/**根据用户号获得地址编号*/
	public AddressAndUserRelation getAddressSN(@Param("number")String number)throws Exception;
	/**根据地址id获得信息*/
	public AddressAndUserRelation getAddressSNAndUserSN(@Param("number")String serialNumber)throws Exception;
	
}
