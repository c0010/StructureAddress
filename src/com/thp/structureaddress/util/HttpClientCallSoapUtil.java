package com.thp.structureaddress.util;

import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.http.HttpEntity;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * 
 * @author dingjinyang
 * HttpClient调用webservice接口通用类
 */
public class HttpClientCallSoapUtil {

	private static Logger logger=LoggerFactory.getLogger(HttpClientCallSoapUtil.class);
	private static int connectTimeout=30000;
	private static int socketTimeout=30000;
	
	/**
	 * post请求
	 * @param postUrl
	 * @param soapXml
	 * @param soapAction
	 * @return
	 */
	public static String doPostSoap1_1(String postUrl, String soapXml) {
		logger.info("HttpClientCallSoapUtil Post--------------");
		String returnStr="";
		HttpClientBuilder httpClientBuilder=HttpClientBuilder.create();
		CloseableHttpClient  httpClient=httpClientBuilder.build();
		HttpPost post=new HttpPost(postUrl);
		RequestConfig config=RequestConfig.custom().setSocketTimeout(socketTimeout).
				setConnectionRequestTimeout(connectTimeout).build();
		post.setConfig(config);
		post.setHeader("Content-Type", "text/xml;charset=UTF-8");
		StringEntity requestXML = new StringEntity(soapXml, Charset.forName("UTF-8"));
		post.setEntity(requestXML);
		
		CloseableHttpResponse response=null;
		HttpEntity entity=null;
		try {
			response=httpClient.execute(post);
			entity=response.getEntity();
			if(entity!=null){
				returnStr = EntityUtils.toString(entity, "UTF-8");
				logger.info("response:" + returnStr);
			}
		} catch (Exception e) {
			logger.error("Exception doPostSoap1_1",e);
			e.printStackTrace();
		}finally{
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return returnStr;
	}
	
	
	/**
	 * get请求
	 * @param url
	 * @param param
	 * @return
	 */
	public static String doGet(String url){
		logger.info("HttpClientCallSoapUtil get------------------");
		String returnStr="";
		HttpClientBuilder clientBuilder=HttpClientBuilder.create();
		CloseableHttpClient httpClient=clientBuilder.build();
		HttpGet httpGet=new HttpGet(url);
		httpGet.setHeader("Content-Type", "application/json;charset=utf-8");
		
		CloseableHttpResponse response=null;
		HttpEntity entity=null;
		try {
			response=httpClient.execute(httpGet);
			entity=response.getEntity();
			if(entity!=null){
				returnStr=EntityUtils.toString(entity, "utf-8");
				logger.info("response:" + returnStr);
			}
		} catch (Exception e) {
			logger.error("Exception doGet",e);
			e.printStackTrace();
		}finally{
			try {
				httpClient.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return returnStr;
	}
	
	
	
	public static void main(String[] args) {
		
//		String url="http://10.150.157.38:9734/F0C0013B-9A64-470A-9393-1E41BA528EFA";
//		StringBuffer sb=new StringBuffer();
//		sb.append("<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:soa='http://soa.csg.cn'>");
//		sb.append("<soapenv:Header/>");
//		sb.append("<soapenv:Body>");
//		sb.append("<soa:getStrucAddressRequest>");
//		sb.append("<soa:STRUCADDR_IN>");
//		sb.append("<soa:CXBZ>333</soa:CXBZ>");
//		sb.append("<soa:CXNR>天河南二路</soa:CXNR>");
//		sb.append("<soa:AK>1</soa:AK>");
//		sb.append("<soa:BM></soa:BM>");
//		sb.append("<soa:XCTS>20</soa:XCTS>");
//		sb.append("</soa:STRUCADDR_IN>");
//		sb.append("</soa:getStrucAddressRequest>");
//		sb.append("</soapenv:Body>");
//		sb.append("</soapenv:Envelope>");
//		String str=doPostSoap1_1(url,sb.toString());
//		JSONObject jsonObject=new JSONObject();
//		jsonObject.put("data", str);
//		System.out.println(jsonObject);
		/**
		 * retStr={"data":"<?xml version=\"1.0\" encoding=\"UTF-8\"?><SOAP-ENV:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:SOAP-ENC=\"http://schemas.xmlsoap.org/soap/encoding/\" xmlns:SOAP-ENV=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:soa=\"http://soa.csg.cn\"><SOAP-ENV:Body><soa:getStrucAddressResponse><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>D688FDD5-71E0-4DFA-BF28-7F2C575428E0</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>天河南二路小区</soa:DZQC><soa:BM>天河南二路小区</soa:BM><soa:ZXJD>113.32335869</soa:ZXJD><soa:ZXWD>23.13465618</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>E81E6929-6520-41D0-9CAD-ABBE68CE661D</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>秦哥哥肉夹馍(天河南二路店)</soa:DZQC><soa:BM>秦哥哥肉夹馍(天河南二路店)</soa:BM><soa:ZXJD>113.32669602</soa:ZXJD><soa:ZXWD>23.13413899</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>35365DD7-336E-43E3-84AA-C8952DCCB34B</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>鼎湖山泉(天河南二路店)</soa:DZQC><soa:BM>鼎湖山泉(天河南二路店)</soa:BM><soa:ZXJD>113.32600509</soa:ZXJD><soa:ZXWD>23.13395889</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>8BDCF794-1612-4D6A-980B-D679DF9D312C</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>六运七街/天河南二路(路口)</soa:DZQC><soa:BM>六运七街/天河南二路(路口)</soa:BM><soa:ZXJD>113.32545079</soa:ZXJD><soa:ZXWD>23.13422521</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>C5752081-936C-4CAF-80C9-DD966ED32158</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>华辉拉肠(天河南二路店)</soa:DZQC><soa:BM>华辉拉肠(天河南二路店)</soa:BM><soa:ZXJD>113.32697622</soa:ZXJD><soa:ZXWD>23.13406257</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>5D8EF1FF-FC80-4C56-8383-1BC3365C683A</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>粤顺粤德(天河南二路分店)</soa:DZQC><soa:BM>粤顺粤德(天河南二路分店)</soa:BM><soa:ZXJD>113.32645671</soa:ZXJD><soa:ZXWD>23.13443453</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>0BB8DEC9-A12A-4D84-B089-C8CA5F277FEB</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>西贝莜面村(天河南二路店)</soa:DZQC><soa:BM>西贝莜面村(天河南二路店)</soa:BM><soa:ZXJD>113.32668905</soa:ZXJD><soa:ZXWD>23.13405297</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>9F5A722A-3D5A-4427-8174-556D27751843</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>金潮香(天河南二路店)</soa:DZQC><soa:BM>金潮香(天河南二路店)</soa:BM><soa:ZXJD>113.32709388</soa:ZXJD><soa:ZXWD>23.13403921</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>53D18910-0EF0-4D75-936F-2DC10D5EE830</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>爱乐艺术培训中心(天河南二路)</soa:DZQC><soa:BM>爱乐艺术培训中心(天河南二路)</soa:BM><soa:ZXJD>113.32511088</soa:ZXJD><soa:ZXWD>23.13401291</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>2066F1AB-A005-4003-BCA7-DC65EA54AC32</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>广州体育中心公寓(天河南二路分店)</soa:DZQC><soa:BM>广州体育中心公寓(天河南二路分店)</soa:BM><soa:ZXJD>113.32681069</soa:ZXJD><soa:ZXWD>23.13408665</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>DB84F52A-9BB5-486F-902D-DE76E8703057</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>中国农业银行(天河南二路支行)</soa:DZQC><soa:BM>中国农业银行(天河南二路支行)</soa:BM><soa:ZXJD>113.32624237</soa:ZXJD><soa:ZXWD>23.13407133</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>B2ADE605-CA5A-48A2-870D-F2C2EE60A304</soa:GUID><soa:SJQHDM></soa:SJQHDM><soa:SJQHMC></soa:SJQHMC><soa:QXDM></soa:QXDM><soa:QXMC></soa:QXMC><soa:XZDM></soa:XZDM><soa:XZMC></soa:XZMC><soa:ZRCQHDM></soa:ZRCQHDM><soa:ZRCQHMC></soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC></soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>中国农业银行自助银行(天河南二路)</soa:DZQC><soa:BM>中国农业银行自助银行(天河南二路)</soa:BM><soa:ZXJD>113.32752367</soa:ZXJD><soa:ZXWD>23.13401744</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1></soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>6C806A1E-C183-46F0-832C-E43FA1AA9CCC</soa:GUID><soa:SJQHDM>440100</soa:SJQHDM><soa:SJQHMC>广州市</soa:SJQHMC><soa:QXDM>440106</soa:QXDM><soa:QXMC>天河区</soa:QXMC><soa:XZDM>440106008</soa:XZDM><soa:XZMC>天河南街道</soa:XZMC><soa:ZRCQHDM>440106008020</soa:ZRCQHDM><soa:ZRCQHMC>体育东社区</soa:ZRCQHMC><soa:JLXDM>4401040004553</soa:JLXDM><soa:JLXMC>天河南二路</soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>广州市天河区天河南街道体育东社区天河南二路</soa:DZQC><soa:BM></soa:BM><soa:ZXJD>113.32755288</soa:ZXJD><soa:ZXWD>23.13473004</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-18 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-18 16:00:07</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1>1248976</soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>9E48E57A-1925-47C2-9DEC-A680EA46A7D4</soa:GUID><soa:SJQHDM>440100</soa:SJQHDM><soa:SJQHMC>广州市</soa:SJQHMC><soa:QXDM>440106</soa:QXDM><soa:QXMC>天河区</soa:QXMC><soa:XZDM>440106008</soa:XZDM><soa:XZMC>天河南街道</soa:XZMC><soa:ZRCQHDM>440106008020</soa:ZRCQHDM><soa:ZRCQHMC>体育东社区</soa:ZRCQHMC><soa:JLXDM>4401040004553</soa:JLXDM><soa:JLXMC>天河南二路</soa:JLXMC><soa:MPDM></soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>广州市天河区天河南街道体育东社区天河南二路</soa:DZQC><soa:BM></soa:BM><soa:ZXJD>113.32755288</soa:ZXJD><soa:ZXWD>23.13473004</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-18 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-18 16:00:07</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1>1259517</soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>095B7F85-A9C9-49A7-8DCF-E8A997671D95</soa:GUID><soa:SJQHDM>440100</soa:SJQHDM><soa:SJQHMC>广州市</soa:SJQHMC><soa:QXDM>440106</soa:QXDM><soa:QXMC>天河区</soa:QXMC><soa:XZDM>440106008</soa:XZDM><soa:XZMC>天河南街道</soa:XZMC><soa:ZRCQHDM>440106008020</soa:ZRCQHDM><soa:ZRCQHMC>体育东社区</soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC>天河南二路</soa:JLXMC><soa:MPDM>40号</soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>广州市天河区天河南街道体育东社区天河南二路40号</soa:DZQC><soa:BM>康平大厦-写字楼</soa:BM><soa:ZXJD>113.32755</soa:ZXJD><soa:ZXWD>23.13386</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1>1613089</soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>740D9897-C4F2-4E28-9970-234CA925F96C</soa:GUID><soa:SJQHDM>440100</soa:SJQHDM><soa:SJQHMC>广州市</soa:SJQHMC><soa:QXDM>440106</soa:QXDM><soa:QXMC>天河区</soa:QXMC><soa:XZDM>440106008</soa:XZDM><soa:XZMC>天河南街道</soa:XZMC><soa:ZRCQHDM>440106008020</soa:ZRCQHDM><soa:ZRCQHMC>体育东社区</soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC>天河南二路</soa:JLXMC><soa:MPDM>18号</soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>广州市天河区天河南街道体育东社区天河南二路18号</soa:DZQC><soa:BM></soa:BM><soa:ZXJD>113.3252</soa:ZXJD><soa:ZXWD>23.13402</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1>5383854</soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>6CF5BB8C-AD1C-4B0B-A311-71D594F1C8BB</soa:GUID><soa:SJQHDM>440100</soa:SJQHDM><soa:SJQHMC>广州市</soa:SJQHMC><soa:QXDM>440106</soa:QXDM><soa:QXMC>天河区</soa:QXMC><soa:XZDM>440106008</soa:XZDM><soa:XZMC>天河南街道</soa:XZMC><soa:ZRCQHDM>440106008020</soa:ZRCQHDM><soa:ZRCQHMC>体育东社区</soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC>天河南二路</soa:JLXMC><soa:MPDM>30号</soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>广州市天河区天河南街道体育东社区天河南二路30号</soa:DZQC><soa:BM></soa:BM><soa:ZXJD>113.32646</soa:ZXJD><soa:ZXWD>23.13396</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1>1565138</soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>6667A5DC-7062-420F-84CA-0D19D2EE4C4F</soa:GUID><soa:SJQHDM>440100</soa:SJQHDM><soa:SJQHMC>广州市</soa:SJQHMC><soa:QXDM>440106</soa:QXDM><soa:QXMC>天河区</soa:QXMC><soa:XZDM>440106008</soa:XZDM><soa:XZMC>天河南街道</soa:XZMC><soa:ZRCQHDM>440106008020</soa:ZRCQHDM><soa:ZRCQHMC>体育东社区</soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC>天河南二路</soa:JLXMC><soa:MPDM>29号</soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>广州市天河区天河南街道体育东社区天河南二路29号</soa:DZQC><soa:BM></soa:BM><soa:ZXJD>113.32755288</soa:ZXJD><soa:ZXWD>23.13473004</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1>5193385</soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>720D5B6B-D11C-4EBB-B0B0-B8B0DE2FB76C</soa:GUID><soa:SJQHDM>440100</soa:SJQHDM><soa:SJQHMC>广州市</soa:SJQHMC><soa:QXDM>440106</soa:QXDM><soa:QXMC>天河区</soa:QXMC><soa:XZDM>440106008</soa:XZDM><soa:XZMC>天河南街道</soa:XZMC><soa:ZRCQHDM>440106008020</soa:ZRCQHDM><soa:ZRCQHMC>体育东社区</soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC>天河南二路</soa:JLXMC><soa:MPDM>31号</soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>广州市天河区天河南街道体育东社区天河南二路31号</soa:DZQC><soa:BM></soa:BM><soa:ZXJD>113.32785204</soa:ZXJD><soa:ZXWD>23.13459</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1>4719263</soa:BYZD1></soa:STRUCADDR_OUT><soa:STRUCADDR_OUT><soa:CXBZ>333</soa:CXBZ><soa:GUID>237A7886-DF63-4F26-B59C-C5E6622125D5</soa:GUID><soa:SJQHDM>440100</soa:SJQHDM><soa:SJQHMC>广州市</soa:SJQHMC><soa:QXDM>440106</soa:QXDM><soa:QXMC>天河区</soa:QXMC><soa:XZDM>440106008</soa:XZDM><soa:XZMC>天河南街道</soa:XZMC><soa:ZRCQHDM>440106008020</soa:ZRCQHDM><soa:ZRCQHMC>体育东社区</soa:ZRCQHMC><soa:JLXDM></soa:JLXDM><soa:JLXMC>天河南二路</soa:JLXMC><soa:MPDM>30号</soa:MPDM><soa:JZWDM></soa:JZWDM><soa:JZWMC></soa:JZWMC><soa:DYDM></soa:DYDM><soa:DYMC></soa:DYMC><soa:LCH></soa:LCH><soa:FJDM></soa:FJDM><soa:FJMC></soa:FJMC><soa:DZQC>广州市天河区天河南街道体育东社区天河南二路30号</soa:DZQC><soa:BM></soa:BM><soa:ZXJD>113.32646</soa:ZXJD><soa:ZXWD>23.13396</soa:ZXWD><soa:SYZTDM>1</soa:SYZTDM><soa:QYSJ>2018-07-22 00:00:00</soa:QYSJ><soa:TYSJ></soa:TYSJ><soa:GXSJ>2018-07-23 10:46:29</soa:GXSJ><soa:PPD>1.0</soa:PPD><soa:BYZD1>1565137</soa:BYZD1></soa:STRUCADDR_OUT><soa:replyCode>ok</soa:replyCode></soa:getStrucAddressResponse></SOAP-ENV:Body></SOAP-ENV:Envelope>"}
		 */
		
		String url="http://10.150.157.24:8080/PowerIncident/powerPoint/selectByCoodinate?longitude=113.0233&latitude=23.023";
		String data=HttpClientCallSoapUtil.doGet(url);
		System.out.println(data);
		//retStr={"objectId":-1,"dev_id":-1,"gadget_id":-1,"x":0.0,"y":0.0,"distance":0.0}
	}
	
	
	
	
}
