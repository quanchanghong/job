<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>

<!DOCTYPE>
<html>
  <head>
    <title>专案成立</title>
  </head>
  
  <body>
    <div class="container">
    	<div id="" class="">
    		<a class="btn btn-success" id="btnAdd" name="btnAdd" href="${pageContext.request.contextPath }/proj/add" >保存</a>		
    	</div>
    	<div id="main">
    		<form action="${pageContext.request.contextPath}/major/save" method="post">
      			<table style="width: 100%;" class="table table-bordered">
      				<tr>
      					<td style="width: 15%;" align="center">专案名称</td>
      					<td><input type="text" class="form-control input-sm" placeholder="专案名称"></td>
      					<td style="width: 15%;" align="center">PM</td>
      					<td>
      						<select data-toggle="select" id="PMId" name="PMId" class="form-control select select-success form-control select-sm mrs">
								<c:forEach items="${departRoleAndStateMap.department }" var="depart" >
									<option value="${depart.departmentId}">${depart.departmentName }</option>
								</c:forEach>
							</select>
      					</td>
      				</tr>
      				<tr>
      					<td style="width: 15%;" align="center">专案编号</td>
      					<td><input type="text" class="form-control input-sm" placeholder="专案编号"></td>
      					<td style="width: 15%;" align="center">SM</td>
      					<td>
      						<select data-toggle="select" id="SMId" name="SMId" class="form-control select select-success form-control select-sm mrs">
								<c:forEach items="${departRoleAndStateMap.department }" var="depart" >
									<option value="${depart.departmentId}">${depart.departmentName }</option>
								</c:forEach>
							</select>
						</td>
      				</tr>
      				<tr>
      					<td style="width: 15%;" align="center">专案简称</td>
      					<td><input type="text" class="form-control input-sm" placeholder="专案简称"></td>
      					<td style="width: 15%;" align="center">PD</td>
      					<td>
      						<select data-toggle="select" id="PDId" name="PDId" class="form-control select select-success form-control select-sm mrs">
								<c:forEach items="${departRoleAndStateMap.department }" var="depart" >
									<option value="${depart.departmentId}">${depart.departmentName }</option>
								</c:forEach>
							</select>
						</td>
      				</tr>
      				<tr>
      					<td style="width: 15%;" align="center">开始日期</td>
      					<td><input type="date" class="form-control input-sm" placeholder="开始日期"></td>
      					<td style="width: 15%;" align="center">结束日期</td>
      					<td>
      						<input type="date" class="form-control input-sm" placeholder="结束日期">
						</td>
      				</tr>
      			</table>
      			<table style="width: 100%; margin-top: 30px;" class="table table-bordered">
      				<thead>
      					<tr>
      						<th>序号</th>
      						<th>专业</th>
      						<th>主办工程师</th>
      						<th>系统</th>
      						<th>备注</th>
      					</tr>
      				</thead>
      				<tbody>
      					<tr>
      						<td>1</td>
      						<td>
      							<select data-toggle="select" id="PDId" name="PDId" class="form-control select select-success form-control select-sm mrs">
								<c:forEach items="${departRoleAndStateMap.department }" var="depart" >
									<option value="${depart.departmentId}">${depart.departmentName }</option>
								</c:forEach>
								</select>
      						</td>
      						<td>
      							<select data-toggle="select" id="PDId" name="PDId" class="form-control select select-success form-control select-sm mrs">
								<c:forEach items="${departRoleAndStateMap.department }" var="depart" >
									<option value="${depart.departmentId}">${depart.departmentName }</option>
								</c:forEach>
								</select>
      						</td>
      						<td>
      							<select data-toggle="select" id="PDId" name="PDId" class="form-control select select-success form-control select-sm mrs">
								<c:forEach items="${departRoleAndStateMap.department }" var="depart" >
									<option value="${depart.departmentId}">${depart.departmentName }</option>
								</c:forEach>
								</select>
      						</td>
      						<td><input type="text" id="remark" name="remark" class="form-control input-sm"></td>
      					</tr>
      				</tbody>
      			</table>
			</form>
    	</div>
  		
  	</div>
  </body>
</html>
