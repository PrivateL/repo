<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta content="text/html; charset=UTF-8" http-equiv="Content-Type">
	<!-- 设置IE浏览器较高版本的适配 -->
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<!-- 网页自适应 -->
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<!--[if lt is IE 9]>
	<script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	<script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
	<![endif]-->
	<link media="all" href="${pageContext.request.contextPath}/css/SignandSignup.css" type="text/css" rel="stylesheet">

	<title>Sign in or Sign up</title>

	<!-- Style -->
	<script type="text/javascript">
		function checkUsername(){
		var username = document.getElementById("username").value;
		//1.创建异步交互对象
		var xhr = createXmlHttp();
		//2.设置监听
		xhr.onreadystatechange = function(){
			if(xhr.readyState == 4){
				if(xhr.status == 200){
					//用户名是否存在
					document.getElementById("span1").innerHTML = xhr.responseText;
				}
			}
		}
		//3.打开连接
		xhr.open("GET","${pageContext.request.contextPath}/user_findByUsername.action?time="+new Date().getTime()+"&username="+username,true);
		//4.发送
		xhr.send(null);
	}
	
	function createXmlHttp(){
	   var xmlHttp;
	   try{ // Firefox, Opera 8.0+, Safari
	        xmlHttp=new XMLHttpRequest();
	    }
	    catch (e){
		   try{// Internet Explorer
		         xmlHttp=new ActiveXObject("Msxml2.XMLHTTP");
		      }
		    catch (e){
		      try{
		         xmlHttp=new ActiveXObject("Microsoft.XMLHTTP");
		      }
		      catch (e){}
		      }
	    }
		return xmlHttp;
	 }
	</script>
</head>
<body>
<div class="adcenter">
<div align="center">

</div>
</div>
	<h1>Login or  Register</h1>
	<div class="container w3layouts agileits">
		<div class="login w3layouts agileits">
			<h2>登 录</h2>
			<div><strong style="color:red;"><s:actionerror/></strong></div>
			<form action="${pageContext.request.contextPath }/user_login.action" method="post">
				<input name="Userame" placeholder="用户名" required="" value="" type="text">
				<input name="Password" placeholder="密码" required="" type="password">
				<div class="send-button w3layouts agileits">
					<input value="登 录" type="submit">
				</div>
			</form>
			<!-- 
			<ul class="tick w3layouts agileits">
				<li>
					<input id="brand1" value="" type="checkbox">
					<label for="brand1"><span></span>记住我</label>
				</li>
			</ul>
			 -->
			<a href="#">记住密码?</a>
			<div class="social-icons w3layouts agileits">
				<p>- 快捷登录 -</p>
				<ul>
					<li class="qq"><a href="#">
					<span class="icons w3layouts agileits"></span>
					<span class="text w3layouts agileits">QQ</span></a></li>
					<li class="weixin w3ls"><a href="#">
					<span class="icons w3layouts"></span>
					<span class="text w3layouts agileits">微信</span></a></li>
					<li class="weibo aits"><a href="#">
					<span class="icons agileits"></span>
					<span class="text w3layouts agileits">微博</span></a></li>
					<div class="clear"> </div>
				</ul>
			</div>
			<div class="clear"></div>
		</div><div class="copyrights"> </div>
		<div class="register w3layouts agileits">
			<h2>注册</h2>
			<form action="${pageContext.request.contextPath }/user_regist.action" method="post">
				<input name="Name" placeholder="用户名" required="" value="" type="text" onblur="checkUsername()">
				<span id="span1"></span><span><s:fielderror fieldName="username"/></span>
				<input name="Email" placeholder="邮箱" required="" value="" type="text">
				<input name="Password" placeholder="密码" required="" type="password">
				<input name="Phone Number" placeholder="手机号码" required="" value="" type="text">
				<div class="send-button w3layouts agileits">
					<input value="免费注册" type="submit">
				</div>
			</form>
			<h2>注册成功后请重新登录 </h2>
			<div class="clear"></div>
		</div>
		  <div class="clear"></div>
	</div>

	<div class="footer w3layouts agileits">
		<p>End @ More Templates <a href="http://monster18.3vfree.com/%E6%9E%9C%E7%B2%89%E7%BD%91%E4%B8%BB%E9%A1%B5.html target="_top" title="login or register">网站登录页</a>
			and<a href="http://monster18.3vfree.com/?qqdrflag=02ff4" title="我的网页" target="_top">网站首页</a></p>
	</div>

</body>
</html>

