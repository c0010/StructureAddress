<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%=basePath%>">
<script type="text/javascript" src="js/jquery/jquery-1.7.2.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>结构化地址页面</title>
<script type="text/javascript">
function transformerStrucAddress(){
	var transformerId="";
	var idText=$("#ids").val();
	if(!idText){
		alert("输入不能为空");
		return;
	}
	var ids=idText.split(",");
	if(!ids)
		return;
	for(var idIndex=0;idIndex<ids.length;idIndex++){
		transformerId+="<acpr:transformerId>"
		transformerId+=ids[idIndex];
		transformerId+="</acpr:transformerId>"
    }
	//拼接请求报文
	var params ='<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/" '         +'xmlns:acpr="http://acpr.webservice.barm.gzkit.com">'
	+'<soapenv:Header/><soapenv:Body><acpr:GetAddressClassifyPowerRangeRequest>'
	+'<acpr:addressClassifyPowerRangeList>'
	+transformerId
	+'</acpr:addressClassifyPowerRangeList></acpr:GetAddressClassifyPowerRangeRequest>'
	+'</soapenv:Body></soapenv:Envelope>'; 
     
     
     var requestUrl="http://192.168.0.240:8080/PowerIncident/cxf/addressClassifyPowerRangeService";
	 $.ajax({
         url: requestUrl,
         type: "POST",
         dataType: "text",//返回的数据类型
         async:false,
//       contentType:"text/json; charset=UTF-8",//发送后台服务器的数据类型及编码
         data: params,
         success: function (data) {
        	$("#textArea").val(data);
        	alert("成功")
         },
         error: function(){
        	 alert("失败");
         }

     });
    

 	}




</script>
</head>
<body>
	<div id="test1">
	<table align="center">
		<caption>结构化地址转化</caption>
		<tr><td>设备id:</td><td><input id="ids" type="text" width="150" ></td><td rowspan="2"><div style="background-color: blue;height: 50px" onclick="transformerStrucAddress()">转化地址</div></td></tr>
		<tr><td>设备名称:</td><td><input id="names" type="text" width="150" ></td></tr>
		<tr><td valign="top">输出结果:</td><td colspan="2"><textarea id="textArea"  rows="5" cols="30" ></textarea></td></tr>
	</table>
	</div>
</body>
</html>