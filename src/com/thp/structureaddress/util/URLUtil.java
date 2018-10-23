package com.thp.structureaddress.util;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Rest请求工具类
 * @author zhugb
 */
public class URLUtil {
    /**
     * URL请求方法
     * @param requestUrl
     * @param requestMethod
     * @return
     */
    public static String urlRequest(String requestUrl,String requestMethod){
        //处理http请求  requestUrl为请求地址  requestMethod请求方式，值为"GET"或"POST"
        StringBuffer buffer= new StringBuffer();
        try{
            URL url=new URL(requestUrl);
            HttpURLConnection conn=(HttpURLConnection)url.openConnection();
            conn.setDoOutput(true);
            conn.setDoInput(true);
            conn.setRequestMethod(requestMethod);
            conn.setUseCaches(false);
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.connect();

            // 将返回的输入流转换成字符串
            if(conn.getResponseCode() == HttpURLConnection.HTTP_OK) {
                InputStream inputStream = conn.getInputStream();
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "utf-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

                String str = null;
                while ((str = bufferedReader.readLine()) != null) {
                    buffer.append(str);
                }
                bufferedReader.close();
                inputStreamReader.close();
                // 释放资源
                inputStream.close();
                inputStream = null;
            }
            conn.disconnect();

        }catch(Exception e){
            e.printStackTrace();
        }
        return buffer.toString();
    }


}
