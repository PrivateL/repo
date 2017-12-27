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
				window.location = "${pageContext.request.contextPath}/user_add.action";				
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
							<strong>用户列表</strong>
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
										用户名
									</td>
									<td align="center" width="8%">
										密码
									</td>
									<td align="center" width="10%">
										邮箱
									</td>
									<td align="center" width="10%">
										电话
									</td>
									<td align="center" width="5%">
										激活状态
									</td>
									<td align="center" width="10%">
										创建日期
									</td>
									<td width="5%" align="center">
										查看详细信息
									</td>
									<td width="5%" align="center">
										编辑
									</td>
									<td width="5%" align="center">
										删除
									</td>
								</tr>
								<s:iterator var="u" value="uList" status="status">
										<tr onmouseover="this.style.backgroundColor = 'white'"
											onmouseout="this.style.backgroundColor = '#F5FAFE';">
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="5%">
												<s:property value="#status.count"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="8%">
												<s:property value="#u.username"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="8%">
												<s:property value="#u.password"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="10%">
												<s:property value="#u.email"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="10%">
												<s:property value="#u.phone"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="5%">
												<s:if test="#u.state == 0">
													未激活
												</s:if>
												<s:else>
													激活
												</s:else>
												
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="10%">
												<input type="datetime" value="<s:property value="#u.create_date"/>">
											</td>
											
											<td align="center" style="HEIGHT: 22px">
												<a href="${pageContext.request.contextPath}/userInfo_show?_id=<s:property value="#u.id"/>">
													详细信息
												</a>
											</td>
											
											<td align="center" style="HEIGHT: 22px">
												<a href="${pageContext.request.contextPath}/user_edit.action?id=<s:property value="#u.id"/>">
													<img src="${pageContext.request.contextPath}/images/i_edit.gif" border="0" style="CURSOR: hand">
												</a>
											</td>
											
											<td align="center" style="HEIGHT: 22px">
												<a href="${pageContext.request.contextPath}/user_delete.action?id=<s:property value="#u.id"/>">
													<img src="${pageContext.request.contextPath}/images/i_del.gif" width="16" height="16" border="0" style="CURSOR: hand">
												</a>
											</td>
										</tr>
										
									</s:iterator>	
									<tr style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
										<td align="center" width="18%" colspan="10">
											第 <s:property value="pageBean.page"/>/<s:property value="pageBean.totalPage"/>页
											<s:if test="pageBean.page != 1">
												<a href="${ pageContext.request.contextPath }/user_adminFindAll.action?page=1">首页</a> |
												<a href="${ pageContext.request.contextPath }/user_adminFindAll.action?page=<s:property value="pageBean.page-1"/>">上一页</a> |
											</s:if>
											<s:if test="pageBean.page != pageBean.totalPage">
												<a href="${ pageContext.request.contextPath }/user_adminFindAll.action?page=<s:property value="pageBean.page+1"/>">下一页</a> |
												<a href="${ pageContext.request.contextPath }/user_adminFindAll.action?page=<s:property value="pageBean.totalPage"/>">尾页</a>
											</s:if>
										</td>
									</tr>
							</table>
						</td>
					</tr>
				</TBODY>
			</table>
		</form>
	</body>
</HTML>

