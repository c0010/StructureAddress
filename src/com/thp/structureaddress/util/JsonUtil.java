package com.thp.structureaddress.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

/**
 * 
 * @author dingjinyang
 * JSON串和java对象的转换
 */
public class JsonUtil {
	private static Logger logger=LoggerFactory.getLogger(JsonUtil.class);
	/**
	 * json转单个对象
	 * @param <T> 声明该方法是泛型方法，持有一个类型T
	 * @param json字符串
	 * @param clazz
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getObject(String json,Class<T> clazz){
    	T t=null;
		try {
			t=clazz.newInstance();
			//{"name":"张三","age":"23"}
			JSONObject object=JSONObject.fromObject(json);
			t = (T) JSONObject.toBean(object,clazz);
		} catch (Exception e) {
			logger.error("json转对象失败",e);
			e.printStackTrace();
		}
		return t;
	}
    
    
    /**
     * json串转为对象数组
     * @param json字符串
     * @param clazz
     * @return
     */
	@SuppressWarnings("unchecked")
	public static <T> T[] getObjectArray(String json,Class<T> clazz){
    	T[] ts=null;
		try {
			ts=clazz.getEnumConstants();
			//[{"name":"张三","age":"23"},{"name":"李四","age":"26"}]
			JSONArray jsonArray=JSONArray.fromObject(json);
			ts = (T[]) JSONArray.toArray(jsonArray, clazz);
		} catch (Exception e) {
			logger.error("json转对象数组失败",e);
			e.printStackTrace();
		}
		
    	return ts;
    }
    
}
