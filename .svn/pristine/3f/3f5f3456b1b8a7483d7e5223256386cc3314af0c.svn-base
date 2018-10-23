<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>测试页面</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
    <script type="text/javascript" src="js/jquery/jQuery-2.2.0.min.js"></script>
    <script type="text/javascript" src="js/jquery/jquery.pagination.js"></script>
	<link href="css/pagination.css" rel="stylesheet" type="text/css"/>
	<script type="text/javascript">
	var xhr = new XMLHttpRequest();
	//正向
	function getStrucAddress(){
		//AJAX请求webservice接口
		var requestSoapData = "<?xml version='1.0' encoding='utf-8'?>";
		requestSoapData += "<soapenv:Envelope xmlns:soapenv='http://schemas.xmlsoap.org/soap/envelope/' xmlns:soa='http://soa.soa.csg.cn'>"
	     + "<soapenv:Header/>" 
	     + "<soapenv:Body>" 
	       +"<soa:getGetStrucAddressRequest>"
	        +"<soa:STRUCADDR_IN>" 
	         + "<soa:CXBZ>" +'dd '+ "</soa:CXBZ>"
	         + "<soa:CXNR>" + 'fgg ' + " </soa:CXNR>"
	         + "<soa:AK>" + ' hhh' + "</soa:AK>"
	         + "<soa:BM>" + ' ' + " </soa:BM>" 
	         + "<soa:XCTS>" + '1' + "</soa:XCTS>"
	        +"</soa:STRUCADDR_IN>"
	       +"</soa:getGetStrucAddressRequest>" 
	     +"</soapenv:Body>"
	     +"</soapenv:Envelope>"; 
  
	    var requestUrl="http://192.168.0.235:8080/StructureAddress/cxf/StrucAddressWebService";
        
	    $.ajax({
	         url: requestUrl,
	         type: "POST",
	         dataType: "text",//返回的数据类型
	         async:false,
	         contentType:"text/xml; charset=UTF-8",//发送后台服务器的数据类型及编码
	         data: requestSoapData,
	         success: function (data) {
	        	 alert(data);
	         },
	         error : function() {
	        	 alert("失败");
	         }
	     });
	    
	    //打开连接
//         xhr.open('POST',requestUrl,true);
//         //重新设置请求头
//         xhr.setRequestHeader("Content-Type","text/xml;charset=UTF-8");
//         //设置回调函数
//         xhr.onreadystatechange = _back;
//         //发送请求
// //         xhr.send(requestSoapData);
// 	}
	
	function _back(){
    	if(xhr.readyState == 4){
	          if(xhr.status == 200){
	             alert('调用Webservice成功了');
	          }else{
	         	 alert("调用失败");
	          }
    	}
    }
	
	function testPagination(id){
		$("#"+id).pagination({
	        pageCount: 10,//总页数
	        totalData: 100,//总记录数目
	        showData: 10,//每页显示的条数
	        current: 1,//当前第几页，默认为1
	        count: 5,//当前页前后的页数，默认为3
	        coping: false,//是否显示首页和尾页
	        prevContent: '上页',
	        nextContent: '下页',
	        callback: function (data) {
	            alert(data.getCurrent())
	        }
	    });
	}

	</script>
	
	
	
  </head>
  
  <body>
 	<div id="paginationDiv" onclick="getStrucAddress()" align="center">点击</div>
  </body>
</html>
