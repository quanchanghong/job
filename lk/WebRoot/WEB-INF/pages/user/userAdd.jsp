<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/pages/resouce.jsp" %>
<!DOCTYPE HTML>
<html>
  <head>
    <title>添加用户</title>
  </head>
  
  <body>
    <div class="container">
    	<div class="row" style="height: 100px"></div>
		<div class="row">
			<form action="${pageContext.request.contextPath}/user/save" method="post" enctype="multipart/form-data">
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
					<select data-toggle="select" id="departmentId" name="departmentId" class="form-control select select-success mrs mbm">
						<!-- <option value="0">test</option> -->
						<c:forEach items="${departRoleAndStateMap.department }" var="depart" >
							<option value="${depart.departmentId}">${depart.departmentName }</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-3">
					<label for="email">邮箱</label> 
					<input type="text" class="form-control" id="email" name="email" placeholder="邮箱">
				</div>
				<div class="form-group col-md-3">
					<label for="phone">电话</label> 
					<input type="text" class="form-control" id="phone" name="phone" placeholder="电话">
				</div>
				<div class="form-group col-md-3">
					<label for="address">地址</label> 
					<input type="text" class="form-control" id="address" name="address" placeholder="地址">
				</div>
				<div class="form-group col-md-3">
					<label for="roleId">角色</label> 
					<select data-toggle="select" id="roleId" name="roleId" class="form-control select select-success mrs mbm">
						<c:forEach items="${departRoleAndStateMap.role }" var="role" >
							<option value="${role.roleId }">${role.roleName}</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-3">
					<label for="IDNumber">身份证号码</label> 
					<input type="text" class="form-control" id="IDNumber" name="IDNumber" placeholder="身份证号码">
				</div>
				<div class="form-group col-md-3">
					<label for="birthday">生日</label> 
					<input type="text" class="form-control" id="birthday" name="birthday" placeholder="生日">
				</div>
				<div class="form-group col-md-3">
					<label for="qq">QQ</label> 
					<input type="text" class="form-control" id="qq" name="qq" placeholder="QQ">
				</div>
				<div class="form-group col-md-3">
					<label for="state">状态</label> 
					<select data-toggle="select" id="state" name="state" class="form-control select select-success mrs mbm">
						<c:forEach items="${departRoleAndStateMap.state }" var="userState" >
							<option value="${userState.userStateId}">${userState.userStateName }</option>
						</c:forEach>
					</select>
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-3">
					<label for="wechart">微信</label> 
					<input type="text" class="form-control" id="wechart" name="wechart" placeholder="微信">
				</div>
				<div class="form-group col-md-3">
					<label for="skill">技能标签</label> 
					<input type="text" class="form-control" id="skill" name="skill" placeholder="技能">
				</div>
				<div class="form-group col-md-3">
					<!-- <label for="header">头像</label>  -->
					<img alt="头像"  class="img-thumbnail" src="" id="headerImg" name="headerImg" style="width: 155px; height: 140px;">
				</div>
				<div class="form-group col-md-3">
					<label for="header">头像</label> 
					<input type="file" class="form-control" id="header" name="header" placeholder="头像" onchange="showPreHeaderImg(this)">
				</div>
			</div>
			<div class="form-row">
				<div class="form-group col-md-12">
					<input type="submit" class="btn btn-success btn-block" value="保存">
				</div>
			</div>
			</form>
		</div>    	
    </div>
  </body>
  <script type="text/javascript">
  	function showPreHeaderImg(source){
  		var file = source.files[0];
  		if (window.FileReader){
  			var fileReader = new FileReader();
  			fileReader.onloadend = function(e){
  				document.getElementById("headerImg").src = e.target.result;
  			};
  			fileReader.readAsDataURL(file);
  		}
  		else{
  			alert("你的浏览器不支持H5，请升级浏览器！");
  		}
  	}
  	
  	$(document).ready(function(){
  		//$("#header").on("change", showPreHeaderImg(this));
  	});
  	
  </script>
</html>
