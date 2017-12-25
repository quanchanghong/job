<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/resouce.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>添加用户</title>
  </head>
  
  <body>
    <div class="container">
    	<div class="row" style="height: 100px"></div>
		<div class="">
			<div class="form-row">
				<div class="form-group col-md-3">
					<label for="userName">姓名</label> 
					<input type="text" class="form-control" id="userName" name="userName" placeholder="姓名">
				</div>
				<div class="form-group col-md-3">
					<label for="userCode">工号</label> 
					<input type="text" class="form-control" id="userCode" name="userCode" placeholder="工号">
				</div>
				<div class="form-group col-md-3">
					<label for="password">密码</label> 
					<input type="password" class="form-control" id="password" name="password" placeholder="Password">
				</div>
				<div class="form-group col-md-3">
					<label for="inputPassword4">部门</label> 
					<select data-toggle="select" id="departmentId" name="departmentId" class="form-control select select-info mrs mbm">
						<option value="0">人力资源</option>
						<option value="1">资讯部</option>
						<option value="2">My Profile</option>
						<option value="3">My Friends</option>
					</select>
				</div>
			</div>
		</div>    	
    </div>
  </body>
</html>
