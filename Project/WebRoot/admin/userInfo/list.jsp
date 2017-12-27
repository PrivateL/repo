<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<LINK href="${pageContext.request.contextPath}/css/Style1.css" type="text/css" rel="stylesheet">
	<script type="text/javascript">
		 function checkForm(){
			// 校验学习路径名
			var pathName = document.getElementById("pathName").value;
			if(pathName==null || pathName==''){
				alert("学习路径名不能为空!");
				return false;//表单不提交
			}
			// 校验图片
			var pathImage = document.getElementById("pathImage").value;
			if(pathImage==null || pathImage==''){
				alert("图片不能为空");
				return false;
			}
			// 校验描述
			var pathDesc = document.getElementById("pathDesc").value;
			if(pathDesc==null || pathDesc==''){
				alert("描述不能为空");
				return false;
			}
		}
		
		function update(){
			window.location = "${pageContext.request.contextPath}/userInfo_add.action";	
		}

		</script>
	</HEAD>
	<body>
		<form id="userAction_save_do" name="Form1" action="${pageContext.request.contextPath}/user_adminFindAll.action?page=1" method="post" enctype="multipart/form-data"
		onsubmit="return checkForm();">
			
			<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
						height="26">
						<STRONG>用户 <s:property value='username'/> 的详情页面</STRONG>
					</td>
				</tr>
				<tr>
					<s:actionerror />
				</tr>
	
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						昵称：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<s:property value='model.name'/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						头像：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<img alt="" src="<s:property value='model.photo'/>">	
					</td>
					
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						性别：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<s:property value='model.sex'/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						年龄：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<s:property value='model.age'/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						用户等级：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<s:property value='model.level'/>
					</td>
				</tr>
			
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						学历：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<s:property value='model.education'/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						工作：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<s:property value='model.job'/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						行业：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<s:property value='model.job'/>
					</td>
				</tr>
				
				
			
				<tr>
					<td align="center" colSpan="4" class="sep1">
						<img src="${pageContext.request.contextPath}/images/shim.gif">
					</td>
				</tr>


				<tr>
					<td class="ta_01" style="WIDTH: 100%" align="center"
						bgColor="#f5fafe" colSpan="4">
						<button type="submit" id="userAction_save_do_submit"  value="确定" class="button_ok">
							&#30830;&#23450;
						</button>

						<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
						<INPUT class="button_ok" type="button" onclick="history.go(-1)" value="返回"/>
						<span id="Label1"></span>
					</td>
				</tr>
			</table>
		</form>
	</body>
</HTML>