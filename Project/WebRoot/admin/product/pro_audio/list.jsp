<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<HTML>
	<HEAD>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<link href="${pageContext.request.contextPath}/css/Style1.css" rel="stylesheet" type="text/css" />
		<script language="javascript" src="${pageContext.request.contextPath}/js/public.js"></script>
		<script type="text/javascript">
			function addProduct(){
				window.location.href = "${pageContext.request.contextPath}/proAudio_addPage.action";
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
							<strong>音频 列 表</strong>
						</TD>
					</tr>
					<tr>
						<td class="ta_01" align="right">
							<button type="button" id="add" name="add" value="添加" class="button_add" onclick="addProduct()">
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
									<td align="center" width="20%">
										音频图片
									</td>
									<td align="center" width="5%">
										音频名称
									</td>
									<td align="center" width="20%">
										音频描述
									</td>
									<td align="center" width="5%">
										点击量
									</td>
									<td width="10%" align="center">
										上传时间
									</td>
									<td width="10%" align="center">
										所属分类
									</td>
									<td width="5%" align="center">
										编辑
									</td>
									<td width="5%" align="center">
										删除
									</td>
								</tr>
									<s:iterator var="p" value="pageBean.list" status="status">
										<tr onmouseover="this.style.backgroundColor = 'white'"
											onmouseout="this.style.backgroundColor = '#F5FAFE';">
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="5%">
												<s:property value="#status.count"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="20%">
												<img width="45" height="50" src="${pageContext.request.contextPath }/<s:property value="#p.audioImage"/>"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="5%">
												<s:property value="#p.audioName"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="20%">
												<s:property value="#p.audioDesc"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="5%">
												<s:property value="#p.audioWeight"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="10%">
												<s:property value="#p.audioUploadTime"/>
											</td>
											<td style="CURSOR: hand; HEIGHT: 22px" align="center"
												width="10%">
												<s:property value="#p.pathId"/>
											</td>
											<td align="center" style="HEIGHT: 22px">
												<a href="${pageContext.request.contextPath}/user/edit.jsp?userID=15">
													<img src="${pageContext.request.contextPath}/images/i_edit.gif" border="0" style="CURSOR: hand">
												</a>
											</td>
											
											<td align="center" style="HEIGHT: 22px">
												<a href="${pageContext.request.contextPath}/user/list.jsp?userID=15">
													<img src="${pageContext.request.contextPath}/images/i_del.gif" width="16" height="16" border="0" style="CURSOR: hand">
												</a>
											</td>
										</tr>
									</s:iterator>	
									<tr
									style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">

									<td align="center" width="18%" colspan="8">
										第 <s:property value="pageBean.page"/>/<s:property value="pageBean.totalPage"/>页
										<s:if test="pageBean.page != 1">
											<a href="${ pageContext.request.contextPath }/product_adminFindAll.action?page=1">首页</a> |
											<a href="${ pageContext.request.contextPath }/product_adminFindAll.action?page=<s:property value="pageBean.page-1"/>">上一页</a> |
										</s:if>
										<s:if test="pageBean.page != pageBean.totalPage">
											<a href="${ pageContext.request.contextPath }/product_adminFindAll.action?page=<s:property value="pageBean.page+1"/>">下一页</a> |
											<a href="${ pageContext.request.contextPath }/product_adminFindAll.action?page=<s:property value="pageBean.totalPage"/>">尾页</a>
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

