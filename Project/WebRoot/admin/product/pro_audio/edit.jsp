<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<LINK href="${pageContext.request.contextPath}/css/Style1.css" type="text/css" rel="stylesheet">
	</HEAD>
	<body>
		<form id="userAction_save_do" name="Form1" action="${pageContext.request.contextPath}/proAudio_update.action" method="post" enctype="multipart/form-data">
			
			<input type="hidden" name="audioId" value="<s:property value="model.audioId"/>" id="userAction_save_do_logonName" class="bg"/>				
			<input type="hidden" name="audioWeight" value="<s:property value="model.audioWeight"/>" id="userAction_save_do_logonName" class="bg"/>				
			<input type="hidden" name="audioUploadTime" value="<s:property value="model.audioUploadTime"/>" id="userAction_save_do_logonName" class="bg"/>				
			<input type="hidden" name="audioUrl" value="<s:property value="model.audioUrl"/>" id="userAction_save_do_logonName" class="bg"/>				
			<input type="hidden" name="audioLong" value="<s:property value="model.audioLong"/>" id="userAction_save_do_logonName" class="bg"/>				
			<input type="hidden" name="pathId" value="<s:property value="model.pathId"/>" id="userAction_save_do_logonName" class="bg"/>				
			
			&nbsp;
			<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
						height="26">
						<strong>编辑音频</strong>
					</td>
				</tr>

				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						音频名称：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="audioName" value="<s:property value="model.audioName"/>" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						音频描述：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="audioDesc" value="<s:property value="model.audioDesc"/>" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						音频图片：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="10">
						<img width="45" height="50" src="${pageContext.request.contextPath }/<s:property value="model.audioImage"/>"/>
						<input type="file" name="audioImage" value="<s:property value="model.audioImage"/>"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						音频作者：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
					
						<select name="acId" >
							<s:iterator var="as" value="aList">
						   	 <option value="<s:property value="model.authorColumn.acId"/>">
						   	 	<s:property value="#as.authorName"/>
						   	 </option>
						    </s:iterator>
						</select>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						音频所属分类：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
					
						<select name="ctgSecId" >
							<s:iterator var="cs" value="cList">
						   	 <option value="<s:property value="model.category.ctgSecId"/>">
						   	 	<s:property value="#cs.ctgName"/>
						   	 </option>
						    </s:iterator>
						</select>
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