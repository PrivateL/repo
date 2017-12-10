<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<LINK href="${pageContext.request.contextPath}/css/Style1.css" type="text/css" rel="stylesheet">
		<link rel="stylesheet" href="${pageContext.request.contextPath}/jquery/jquery.datepick.css" type="text/css">
	</HEAD>
	<body>
		<form id="userAction_save_do" name="Form1" action="${pageContext.request.contextPath}/proAudio_save.action" method="post" enctype="multipart/form-data">
			
			&nbsp;
			<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
						height="26">
						<strong><STRONG>添加音频</STRONG>
						</strong>
					</td>
				</tr>

				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						音频名称：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="audioName" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						音频分类：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						
						<select name="ctgSecId" >
							<s:iterator var="cs" value="cList">
						   	 <option value="<s:property value="#cs.ctgSecId"/>">
						   	 	<s:property value="#cs.ctgName"/>
						   	 </option>
						    </s:iterator>
						</select>

					</td>
				</tr>
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01">
						说书人：
					</td>
					<td class="ta_01" bgColor="#ffffff">
						
						<select name="acId" >
							<s:iterator var="as" value="aList">
						   	 <option value="<s:property value="#as.acId"/>">
						   	 	<s:property value="#as.authorName"/>
						   	 </option>
						    </s:iterator>
						</select>

					</td>
				</tr>
				
				
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01">
						音频图片：
					</td>
					<td class="ta_01" bgColor="#ffffff" colSpan="3">
						<input type="file" name="audioImage" size="30" id="userAction_save_do_upload"/>
					</td>
				</tr>
				
				<tr>
					<td align="center" bgColor="#f5fafe" class="ta_01">
						音频地址：
					</td>
					<td class="ta_01" bgColor="#ffffff" colSpan="3">
						<input type="file" name="audioUrl" size="30" id="userAction_save_do_upload"/>
					</td>
				</tr>
				
				<TR>
					<TD class="ta_01" align="center" bgColor="#f5fafe">
						音频描述：
					</TD>
					<TD class="ta_01" bgColor="#ffffff" colSpan="3">
						<textarea name="audioDesc" cols="30" rows="3" id="userAction_save_do_remark" style="WIDTH: 96%"></textarea>
					</TD>
					
				</TR>
				<TR>
					<td align="center" colSpan="4" class="sep1">
						<img src="${pageContext.request.contextPath}/images/shim.gif">
					</td>
				</TR>


				<tr>
					<td class="ta_01" style="WIDTH: 100%" align="center"
						bgColor="#f5fafe" colSpan="4">
						<button type="submit" id="userAction_save_do_submit" name="submit" value="&#30830;&#23450;" class="button_ok">
							&#30830;&#23450;
						</button>

						<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
						<button type="reset" value="&#37325;&#32622;" class="button_cancel">&#37325;&#32622;</button>

						<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
						<INPUT class="button_ok" type="button" onclick="history.go(-1)" value="返回"/>
						<span id="Label1"></span>
					</td>
				</tr>
			</table>
		</form>
	</body>
</HTML>