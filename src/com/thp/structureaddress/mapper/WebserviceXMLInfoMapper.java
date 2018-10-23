package com.thp.structureaddress.mapper;

import org.apache.ibatis.annotations.Param;

import com.thp.structureaddress.model.webservicexmlinfo.WebserviceXMLInfo;

public interface WebserviceXMLInfoMapper {

	boolean add(@Param("webserviceXMLInfo")WebserviceXMLInfo webserviceXMLInfo);

}
