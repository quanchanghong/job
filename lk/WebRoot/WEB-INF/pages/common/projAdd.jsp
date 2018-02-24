<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>专案成立</title>
  </head>
  
  <body>
    <div class="container">
  		<form action="${pageContext.request.contextPath}/major/save" method="post">
			<div class="form-group row">
				<label for="majName" class="col-sm-1 col-form-label font-weight-bold">专业名称</label>
				<div class="col-sm-3">
					<input type="text" class="form-control " id="majorName" name="majorName"   placeholder="请输入专业名称">
				</div>
			</div>
			<div class="form-group row">
				<label for="majorCode" class="col-sm-1 col-form-label font-weight-bold">专业编码</label>
				<div class="col-sm-3">
					
					<input type="text" class="form-control " id="majorCode" name="majorCode" placeholder="字母+数字">
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-4">
					<input type="submit" class="form-control btn btn-success" value="添加">
				</div>
			</div>
		</form>		
  	</div>
  </body>
</html>
