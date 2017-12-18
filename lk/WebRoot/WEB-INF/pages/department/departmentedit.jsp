<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>部门编辑</title>
  </head>

<body class="container">
	<div class="row" style="height: 100px">
		<c:if test="${updateMsg != null}">
			<span style="color: red">${updateMsg }</span>
		</c:if>
	</div>
	<div class="row" style="border: 1px solid #D4D4D4; border-radius: 5px">
		<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/department/update" method="post" style="margin-top: 15px">
			<div class="form-group">
				<label for="departmentName" class="col-lg-2 control-label">名称</label>
				<div class="col-lg-10">
					<input type="text" class="form-control" id="departmentName" name="departmentName" placeholder="部门名称" value="${department.departmentName}" style="width: 700px">
				</div>
			</div>
			<div class="form-group">
				<label for="departmentLeaderId" class="col-lg-2 control-label">领导</label>
				<div class="col-lg-10">
					<input type="text" class="form-control" id="departmentLeaderId" name="departmentLeaderId" placeholder="部门领导" value="${department.departmentLeaderId}" style="width: 700px">
				</div>
			</div>
			<div class="form-group">
				<label for="departmentDesc" class="col-lg-2 control-label">描述</label>
				<div class="col-lg-10">
					<input type="text" class="form-control" id="departmentDesc" name="departmentDesc" placeholder="部门描述" value="${department.departmentDesc}" style="width: 700px">
				</div>
			</div>
			<div class="form-group">
				<label for="departmentPosition" class="col-lg-2 control-label">位置</label>
				<div class="col-lg-10">
					<input type="text" class="form-control" id="departmentPosition" name="departmentPosition" placeholder="部门位置" value="${department.departmentPosition}" style="width: 700px">
				</div>
			</div>
			<div class="form-group">
				<label for="departmentId" class="col-lg-2 control-label"></label>
				<div class="col-lg-10">
					<input type="hidden" class="form-control" id="departmentId" name="departmentId" value="${department.departmentId}">
				</div>
			</div>
			<div class="form-group">
				<label for="sub" class="col-lg-2 control-label"></label>
				<div class="col-lg-10">
					<input type="submit" class="btn btn-sm btn-primary" id="sub" value="修改" style="width: 450px;margin-left: 100px">
				</div>
			</div>
		</form>
	</div>
</body>
</html>
