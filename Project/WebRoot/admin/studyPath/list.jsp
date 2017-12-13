<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="${pageContext.request.contextPath}/css/Style1.css" rel="stylesheet" type="text/css" />
		<script language="javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
		<script type="text/javascript">
			function addUser(){
				window.location = "${pageContext.request.contextPath}/studyPath_add.action";				
			}
		</script>
	</HEAD>
	<body>
		<br>
		<form id="Form1" name="Form1" action="${pageContext.request.contextPath}/user/list.jsp" method="post">
			<table cellSpacing="1" cellPadding="0" width="100%" align="center" bgColor="#f5fafe" border="0">
				<TBODY>
					
					<tr>
						<td class="ta_01" align="center" bgColor="#afd1f3">
							<strong>学习路径列表</strong>
						</TD>
					</tr>
					<tr>
						<td class="ta_01" align="right">
							<button type="button" id="add" name="add" value="添加" class="button_add" onclick="addUser()">
&#28155;&#21152;
</button>

						</td>
					</tr>
					<tr>
						<td class="ta_01" align="center" bgColor="#f5fafe">
							<table cellspacing="0" cellpadding="1" rules="all"
								bordercolor="gray" border="1" id="DataGrid1"
								style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
								<tr
									style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

									<td align="center" width="5%">
										序号
									</td>
									<td align="center" width="8%">
										学习路径名称
									</td>
									<td align="center" width="12%">
										图片
									</td>
									<td align="center" width="5%">
										所属分类
									</td>
									<td align="center" width="10%">
										描述
									</td>
									<td align="center" width="5%">
										点击量
									</td>
									<td align="center" width="10%">
										上传时间
									</td>
									<td width="5%" align="center">
										编辑
									</td>
									<td width="5%" align="center">
										删除
									</td>
								</tr>
								<s:iterator var="s" value="sList" status="status">
										<tr onmouseover="this.style.backgroundColor = 'white'"
											onmouseout="this.style.backgroundColor = '#F5FAFE';">
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="5%">
												<s:property value="#status.count"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="8%">
												<s:property value="#s.pathName"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="12%">
												<img width="45" height="50" src="${pageContext.request.contextPath }/<s:property value="#s.pathImage"/>"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="5%">
												<s:property value="#s.category.ctgName"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="10%">
												<s:property value="#s.pathDesc"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="5%">
												<s:property value="#s.pathWeight"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="10%">
												<input type="datetime" value="<s:property value="#s.pathCreateTime"/>">
											</td>
											
											<td align="center" style="HEIGHT: 22px">
												<a href="${pageContext.request.contextPath}/studyPath_edit.action?pathId=<s:property value="#s.pathId"/>">
													<img src="${pageContext.request.contextPath}/images/i_edit.gif" border="0" style="CURSOR: hand">
												</a>
											</td>
											
											<td align="center" style="HEIGHT: 22px">
												<a href="${pageContext.request.contextPath}/studyPath_delete.action?pathId=<s:property value="#s.pathId"/>">
													<img src="${pageContext.request.contextPath}/images/i_del.gif" width="16" height="16" border="0" style="CURSOR: hand">
												</a>
											</td>
										</tr>
									</s:iterator>	
							</table>
						</td>
					</tr>
				</TBODY>
			</table>
		</form>
	</body>
</HTML>

