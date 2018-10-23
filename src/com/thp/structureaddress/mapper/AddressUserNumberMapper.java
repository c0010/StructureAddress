package com.thp.structureaddress.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface AddressUserNumberMapper {

	/**根据地址查询用户号集合*/
	public List<String> getUserNumberByAddress(@Param("addresses")List<String> address)throws Exception;
}
