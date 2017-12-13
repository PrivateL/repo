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


		</script>
	</HEAD>
	<body>
		<form id="userAction_save_do" name="Form1" action="${pageContext.request.contextPath}/studyPath_update.action" method="post" enctype="multipart/form-data"
		onsubmit="return checkForm();">
			<input type="hidden" name="pathId" value="<s:property value="model.pathId"/>"/>
			<input type="hidden" name="pathWeight" value="<s:property value="model.pathWeight"/>"/>
			<input type="hidden" name="pathCreateTime" value="<s:property value="model.pathCreateTime"/>">
			&nbsp;
			<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
						height="26">
						<STRONG>编辑学习路径</STRONG>
					</td>
				</tr>

				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						学习路径名称：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="pathName" value="<s:property value="model.pathName"/>" id="pathName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						图片：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="file" name="pathImage" id="pathImage" class="bg"/>
						<img  width="45" height="50" src="${pageContext.request.contextPath}/<s:property value="model.pathImage"/>">
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						所属分类：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<select name="ctgSecId">
							<s:iterator var="cs" value="cList">
						   	 <option value="<s:property value="model.category.ctgSecId"/>">
						   	 	<s:property value="#cs.ctgName"/>
						   	 </option>
						    </s:iterator>
						</select>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						描述：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3" width="50%">
						<input type="text" name="pathDesc" id="pathDesc" value="<s:property value="model.pathDesc"/>"
						maxlength="1000" style="width: 500px">
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