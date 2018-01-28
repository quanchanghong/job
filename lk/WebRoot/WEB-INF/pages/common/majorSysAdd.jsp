<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>系统添加</title>
    
  </head>
  
  <body>
    <div class="container">
  		<form action="${pageContext.request.contextPath}/majorSys/save" method="post">
			<div class="form-group row">
				<label for="majorSysName" class="col-sm-1 col-form-label font-weight-bold">系统名称</label>
				<div class="col-sm-3">
					<input type="text" class="form-control " id="majorSysName" name="majorSysName"   placeholder="请输入系统名称">
				</div>
			</div>
			<div class="form-group row">
				<label for="majorSysCode" class="col-sm-1 col-form-label font-weight-bold">系统编码</label>
				<div class="col-sm-3">
					
					<input type="text" class="form-control " id="majorSysCode" name="majorSysCode" placeholder="字母+数字">
				</div>
			</div>
			<div class="form-group row">
				<label for="majorId" class="col-sm-1 col-form-label font-weight-bold">所属专业</label>
				<div class="col-sm-3">
					<!--<input type="hidden" class="form-control " id="majorIdHelp" name="majorIdHelp" value="${addMap.ais.area.areaId}" placeholder="区域">-->
					<select class="form-control" id="majorId" name="majorId" >
						<c:forEach items="${majorList}" var="major">
							<option value="${major.majorId}">${major.majorName}</option>
						</c:forEach>
					</select>
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
