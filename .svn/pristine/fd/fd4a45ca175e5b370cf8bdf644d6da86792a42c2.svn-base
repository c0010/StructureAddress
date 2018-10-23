package com.thp.structureaddress.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.xml.XMLSerializer;

/**
 * 
 * @author dingjinyang
 * xml转json
 */
public class XMLUtil {

	private static Logger logger=LoggerFactory.getLogger(XMLUtil.class);
	public static String xmlToJson(String xml){
		String json="";
		XMLSerializer serializer=new XMLSerializer();
		try {
			json=serializer.read(xml).toString();
		} catch (Exception e) {
			logger.error("xml转json失败",e);
			e.printStackTrace();
		}
		return json;
	}
	
	
//	public static void main(String[] args) {
//		String xml="<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soa=\"http://soa.csg.cn\">"
//				+"<soapenv:Header/>"
//				+"<soapenv:Body>"
//				+"<soa:getStrucAddressRequest>"
//				+"<soa:STRUCADDR_IN>"    
//				+"<soa:CXBZ>333</soa:CXBZ>"         
//				+"<soa:CXNR>天河南二路</soa:CXNR>"         
//				+"<soa:AK>1</soa:AK>"         
//				+"<soa:BM></soa:BM>"         
//				+"<soa:XCTS>20</soa:XCTS>"         
//				+"</soa:STRUCADDR_IN>"     
//				+"</soa:getStrucAddressRequest>"
//				+"</soapenv:Body>"
//				+"</soapenv:Envelope>";
//		String json=XMLUtil.xmlToJson(xml);
//		JSONObject object=JSONObject.parseObject(json);
//		System.out.println(json);
//		System.out.println(object.get("soapenv:Body"));
//	}
}
