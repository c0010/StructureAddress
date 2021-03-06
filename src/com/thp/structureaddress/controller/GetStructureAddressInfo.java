package com.thp.structureaddress.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.thp.structureaddress.util.HttpClientCallSoapUtil;

/**
 * 
 * @author dingjinyang
 * 调用结构化地址接口
 */
@Controller
@RequestMapping("GetStructureAddressInfo")
public class GetStructureAddressInfo {

	private Logger logger=LoggerFactory.getLogger(GetStructureAddressInfo.class);
	@Value("${ForwardAddressServerURL}")
	private String url_Forward;
	@Value("${ReverseAddressServerURL}")
	private String url_Reverse;
	
	public String getUrl_Forward() {
		return url_Forward;
	}
	public void setUrl_Forward(String url_Forward) {
		this.url_Forward = url_Forward;
	}
	public String getUrl_Reverse() {
		return url_Reverse;
	}
	public void setUrl_Reverse(String url_Reverse) {
		this.url_Reverse = url_Reverse;
	}





	/**
	 * 调用结构化地址
	 * @param request
	 * @param resp
	 */
	@RequestMapping("/getStructureAddressInfo")
	public@ResponseBody void getStructureAddressInfo(HttpServletRequest request, HttpServletResponse resp) {
		JSONObject json=new JSONObject();
		PrintWriter out = null;
		String method = request.getParameter("method");
		String soapXml = request.getParameter("soapXml");
		String postUrl = "";
		String retStr = "";
		logger.info("接收字符串报文：" + soapXml);
		try {
			resp.setCharacterEncoding("utf-8");
			resp.setContentType("text/html;charset=UTF-8");
			resp.setHeader("Cache-Control", "no-cache");
			out = resp.getWriter();
		} catch (IOException e1) {
			logger.error("err:",e1);
		}
		if ("Forward".equals(method)) {
			postUrl=url_Forward;
			
		} else if ("Reverse".equals(method)) {
			postUrl =url_Reverse;
		} else {
			json.put("replyCode", "0");
			json.put("message","该方法未实现");
			json.put("data","");
			logger.info("该方法未实现。。。。。。");
			out.print(json.toString());
			return ;
		}
		logger.info("加载url:" + postUrl);
		
		retStr=HttpClientCallSoapUtil.doPostSoap1_1(postUrl, soapXml);
		logger.info("返回数据:"+retStr);
		if(StringUtils.isNotEmpty(retStr)){
			json.put("replyCode", "1");
			json.put("message","成功");
			json.put("data",retStr);
		}
		else
		{
			json.put("replyCode", "0");
			json.put("message","失败");
			json.put("data",null);
		}
		
		out.print(json);

		out.flush();
		out.close();
	}
	

}
