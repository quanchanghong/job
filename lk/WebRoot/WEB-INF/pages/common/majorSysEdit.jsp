<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>系统编辑</title>
    
  </head>
  
  <body>
    <div class="container">
  		<form action="${pageContext.request.contextPath}/majorSys/save" method="post">
			<div class="form-group row">
				<input type="hidden" class="form-control " value="${majorSysEditMap.majorSys.majorSysId}" id="majorSysId" name="majorSysId">
				<label for="majorSysName" class="col-sm-1 col-form-label font-weight-bold">系统名称</label>
				<div class="col-sm-3">
					<input type="text" class="form-control " value="${majorSysEditMap.majorSys.majorSysName}" id="majorSysName" name="majorSysName"   placeholder="请输入系统名称">
				</div>
			</div>
			<div class="form-group row">
				<label for="majorSysCode" class="col-sm-1 col-form-label font-weight-bold">系统编码</label>
				<div class="col-sm-3">
					
					<input type="text" class="form-control " value="${majorSysEditMap.majorSys.majorSysCode}" id="majorSysCode" name="majorSysCode" placeholder="字母+数字">
				</div>
			</div>
			<div class="form-group row">
				<label for="majorId" class="col-sm-1 col-form-label font-weight-bold">所属专业</label>
				<div class="col-sm-3">
					<input type="hidden" class="form-control " id="majorIdHelp" name="majorIdHelp" value="${majorSysEditMap.majorSys.majorId}" >
					<select class="form-control" id="majorId" name="majorId" >
						<c:forEach items="${majorSysEditMap.majorList}" var="major">
							<option value="${major.majorId}">${major.majorName}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			
			<div class="form-group row">
				<div class="col-sm-4">
					<input type="submit" class="form-control btn btn-success" value="修改">
				</div>
			</div>
		</form>		
  	</div>
  	<script type="text/javascript">
  		$(document).ready(function(){
  			$("#majorId").val($("#majorIdHelp").val());
  		});
  	</script>
  </body>
</html>
