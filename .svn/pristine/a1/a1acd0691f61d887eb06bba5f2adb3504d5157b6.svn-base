package com.thp.structureaddress.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.xml.bind.annotation.XmlElement;

import org.apache.log4j.Logger;

/**
 * 
 * @author dingjinyang
 * 拼接报文工具类
 */
public class XMLInfoUtil {

	private Logger logger=Logger.getLogger(XMLInfoUtil.class);
	
	/**
	 * 拼接报文
	 * @param obj
	 * @return
	 * @throws Exception
	 */
	public String getXMLInfo(Object obj)throws Exception {
		if(obj==null){
			logger.error("传入对象不能为null");
			throw new Exception("对象不能为null");
		}
		
		
		StringBuffer sb=new StringBuffer();
		Annotation annotation=null;
		XmlElement xmlelement=null;
		Object value=null;
		Field[] fields=obj.getClass().getDeclaredFields();
		if(fields==null||fields.length==0){
			logger.info("该对象为null或者没有任何属性");
			return sb.toString();
		}
		
		for(Field f : fields){
			if(f==null)continue;
			//获得属性上指定类型注解
			annotation=f.getAnnotation(XmlElement.class);
			if(null!=annotation){
				f.setAccessible(true);
				value=f.get(obj);
				xmlelement=(XmlElement)annotation;
				if(value!=null){
					sb.append("<"+xmlelement.name()+">");
					sb.append(value);
					sb.append("</"+xmlelement.name()+">");
				}
				
			}
			
		}
		return sb.toString();
	}

	
	/**
	 * 測試
	 * @param args
	 */
//	public static void main(String[] args) {
//		XMLInfoUtil util=new XMLInfoUtil();
//		try {
//			CommonDataRequest dataRequest=new CommonDataRequest();
//			Root root=new Root();
//			root.setRepairBill(new RepairBill());
//			dataRequest.setRoot(root);
//			dataRequest.setAccount("11");
//			dataRequest.setPassword("123");
//			String str=util.getXMLInfo(dataRequest);
//			System.out.println(str);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
}
