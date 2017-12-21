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
				<div class="form-group col-md-4">
					<label for="userName">姓名</label> 
					<input type="text" class="form-control" id="userName" name="userName" placeholder="姓名">
				</div>
				<div class="form-group col-md-4">
					<label for="userCode">工号</label> 
					<input type="text" class="form-control" id="userCode" name="userCode" placeholder="Password">
				</div>
				<div class="form-group col-md-4">
					<label for="inputPassword4">Password</label> <input type="password"
						class="form-control" id="inputPassword4" placeholder="Password">
				</div>
			</div>
		</div>    	
    </div>
  </body>
</html>
