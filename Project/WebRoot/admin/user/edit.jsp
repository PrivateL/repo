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
		
		// 跳转去是否保存用户信息
		function sub(){
			var boo = confirm('是否保存用户信息');
	        //confirm 会返回你选择的选项,然后可以依据选择执行逻辑
	        if(boo){
	        	window.location = "${pageContext.request.contextPath}/user_update.action?_id="+id;	    
	        }else{
	        	var id = document.getElementById("id").value;
	           window.location = "${pageContext.request.contextPath}/userInfo_edit.action?_id="+id;	
	        }
		}

		</script>
	</HEAD>
	<body>
		<form id="userAction_save_do" name="Form1" action="${pageContext.request.contextPath}/user_update.action" method="post" enctype="multipart/form-data"
		onsubmit="return checkForm();">
			<input type="hidden" name="id" id="id" value="<s:property value="model.id"/>"/>
			<input type="hidden" name="create_date" value="<s:property value="model.create_date"/>"/>
			<input type="hidden" name="name"  value="<s:property value="model.username"/>"/>
			&nbsp;
			<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
						height="26">
						<STRONG>编辑用户</STRONG>
					</td>
				</tr>
				<tr>
					<s:actionerror />
				</tr>
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						用户名：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="username"  id="username" class="bg" value="<s:property value='model.username'/>"/>
						
					</td>
					
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						密码：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="password" id="password" class="bg" value="<s:property value='model.password'/>"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						邮箱：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="email" id="email" class="bg" value="<s:property value='model.email'/>"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						电话：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="phone" id="phone" class="bg" value="<s:property value='model.phone'/>"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						激活状态：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="radio" name="state" value="0" checked="checked"/>未激活
						<input type="radio" name="state" value="1" />激活
					</td>
				</tr>
		
				<tr>
					<td width="20%" align="center"  class="ta_01">	
						<button onclick="sub();"><font color="red">编辑详细信息</font></button >
					</td>
				</tr>
				
				<tr>
					<td align="center" colSpan="4"class="sep1">
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
						<button type="reset" value="重置" class="button_cancel">&#37325;&#32622;</button>

						<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
						<INPUT class="button_ok" type="button" onclick="history.go(-1)" value="返回"/>
						<span id="Label1"></span>
					</td>
				</tr>
			</table>
		</form>
	</body>
</HTML>