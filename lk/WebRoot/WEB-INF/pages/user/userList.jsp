<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户管理</title>
  </head>
  <script type="text/javascript">
  	$(document).ready(function(){
  		$("#btnAdd").on("click",function(){
  		});
  	});
  </script>
  <body>
  		<div class="container">
  			<div class="row" style="height: 100px">
  				<a type="button" class="btn btn-success" id="btnAdd" name="btnAdd" href="${pageContext.request.contextPath }/user/add" >添加</a>
  			</div>
  			<div class="row">
  				<div id="content">
  					<table class="table table-bordered">
  						<thead>
  							<tr>
  								<th>序号</th>
  								<th>姓名</th>
  								<th>工号</th>
  								<th>部门</th>
  								<th>状态</th>
  								<th>角色</th>
  								<th>技能</th>
  								<th>操作</th>
  							</tr>
  						</thead>
  						<tbody>
  						<c:forEach items="${onePage.list}" var="uservo" varStatus="status">
  							<tr>
  								<th scope="row">${status.count + (onePage.currentPage - 1)*onePage.pageSize}</th>
  								<td>${uservo[0].userName}</td>
  								<td>${uservo[0].userCode}</td>
  								<td>${uservo[2].departmentName}</td>
  								<td>${uservo[0].state}</td>
  								<td>${uservo[1].roleName}</td>
  								<td>${uservo[0].skill}</td>
  								<td width="14%">
  								<a  class="btn btn-success "  href="${pageContext.request.contextPath }/user/edit?userId=${uservo[0].userId}" style="height: 22px; padding-top: 1px;">编辑</a>
  								<a  class="btn btn-danger "  href="${pageContext.request.contextPath }/user/delete?userId=${uservo[0].userId}"  style="height: 22px; padding-top: 1px;">删除</a>
  								</td>
  							</tr>
  						</c:forEach>
  						</tbody>
  					</table>
  				</div>
  				<div id="foot_nav" style="position: absolute; bottom: 10px; margin-left: 20px;">
					<c:if test="${onePage.currentPage > 1 }">
						<a href="${pageContext.request.contextPath }/user/list?currentPage=${onePage.currentPage - 1}" class="btn btn-success previous"> <i class="fui-arrow-left"></i> 上一页 </a>
					</c:if>
					
					<ul class="pagination pagination-success">
					<c:if test="${onePage.pageCount < 26}">
						<c:forEach begin="1" end="${onePage.pageCount }" step="1" var="i">
							<li><a href="${pageContext.request.contextPath }/user/list?currentPage=${i}">${i }</a>
						</c:forEach>
					</c:if>
					</ul>
					
					<span class="btn btn-success">当前页:${onePage.currentPage}/${onePage.pageCount}</span>
					
					<c:if test="${onePage.currentPage < onePage.pageCount }">
						<a href="${pageContext.request.contextPath }/user/list?currentPage=${onePage.currentPage + 1}" class="btn btn-success next"> 下一页 <i class="fui-arrow-right"></i> </a>
					</c:if>
					
			</div>
  			</div>
  		</div>
  </body>
</html>
