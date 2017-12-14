<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/pages/header.jsp" %> 

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>部门管理</title>
  </head>
  
  <body>
  	<div class="container">
  		<div class="row" style="height: 80px">
  		</div>
  		<div class="row">
  			<form action="">
  			<table class="table table-hover">
  				<thead>
  					<tr>
  						<th>序号</th>
  						<th>部门名称</th>
  						<th>部门领导</th>
  						<th>部门位置</th>
  						<th>部门描述</th>
  						<th>操作</th>
  					</tr>
  				</thead>
  				<tbody>
  					<c:forEach items="${departList }" var="department" varStatus="status">
  						<tr>
  						<th scope="row">${status.count}</th>
  						<td>${department.departmentName}</td>
  						<td>${department.departmentLeaderId}</td>
  						<td>${department.departmentPosition}</td>
  						<td>${department.departmentDesc}</td>
  						<td><a href="#">编辑</a></td>
  					</tr>
  					</c:forEach>
  					
  					<!-- <tr>
  						<th scope="row">2</th>
  						<td>研发部</td>
  						<td>code2</td>
  						<td>二楼</td>
  						<td>全是基佬</td>
  						<td><a href="#">编辑</a></td>
  					</tr>
  					<tr>
  						<th scope="row">3</th>
  						<td>人力资源</td>
  						<td>code3</td>
  						<td>一楼</td>
  						<td>全是妹子</td>
  						<td><a href="#">编辑</a></td>
  					</tr> -->
  				</tbody>
  			</table>
  		</form>
  		</div>
  		
  	</div>
  </body>
</html>
