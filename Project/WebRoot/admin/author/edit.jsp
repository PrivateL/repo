<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<LINK href="${pageContext.request.contextPath}/css/Style1.css" type="text/css" rel="stylesheet">
	</HEAD>
	<body>
		<form id="userAction_save_do" name="Form1" action="${pageContext.request.contextPath}/authorColumn_update.action" method="post" enctype="multipart/form-data">
			
			<input type="hidden" name="acId" value="<s:property value="model.acId"/>" id="userAction_save_do_logonName" class="bg"/>				
			&nbsp;
			<table cellSpacing="1" cellPadding="5" width="100%" align="center" bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
				<tr>
					<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
						height="26">
						<STRONG>编辑作品专栏</STRONG>
					</td>
				</tr>

				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						作者名称：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="authorName" value="<s:property value="model.authorName"/>" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						作者描述：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="authorDesc" value="<s:property value="model.authorDesc"/>" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						作者照片：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="10">
						<input type="image" name="authorPhoto" value="<s:property value="model.authorPhoto"/>" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						专栏名称：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="columnName" value="<s:property value="model.columnName"/>" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						专栏描述：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="columnDesc" value="<s:property value="model.columnDesc"/>" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						专栏封面：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="image" name="columnImage" value="<s:property value="model.columnImage"/>" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						专栏价格：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
						<input type="text" name="coiumnPrice" value="<s:property value="model.coiumnPrice"/>" id="userAction_save_do_logonName" class="bg"/>
					</td>
				</tr>
				
				<tr>
					<td width="18%" align="center" bgColor="#f5fafe" class="ta_01">
						专栏所属分类：
					</td>
					<td class="ta_01" bgColor="#ffffff" colspan="3">
					
						<select name="ctgSecId" >
							<s:iterator var="cs" value="cList">
						   	 <option value="<s:property value="model.category.ctgSecId"/>">
						   	 	<s:property value="#cs.ctgName"/>
						   	 </option>
						    </s:iterator>
						</select>
						
						<!--  <input type="text" name="category" value="<s:property value="model.category.ctgName"/>" id="userAction_save_do_logonName" class="bg"/>
						-->
					</td>
					<td>
						<input type="hidden" name="columnWeight" value="<s:property value="mode.columnWeight"/>">
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