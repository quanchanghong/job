<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/resouce.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>密码找回</title>
    <style type="text/css">
    	
    </style>
  <body>
  
    <div class="container">
    	<div  class="col-mid-12" style="width: 650px; height: auto; border: 1px solid #D4D4D4; border-radius:5px; text-align: center; margin-left: 100px;margin-top: 100px">
    		<form action="">
    		<div class="form-group row" style="margin-top: 20px">
    			<label for="email" class="col-sm-2 col-form-lable" style="margin-top: 10px">邮箱</label>
    			<div class="col-sm-10">
      				<input type="text" class="form-control" id="email" placeholder="请输入邮箱" name="email" style="width: 400px">
    			</div>
    		</div>
    		<div class="form-group row" style="margin-top: 20px">
    			<label for="username" class="col-sm-2 col-form-lable" style="margin-top: 10px">用户名</label>
    			<div class="col-sm-10">
      				<input type="text" class="form-control" id="username" placeholder="请输入用户名" name="username" style="width: 400px">
    			</div>
    		</div>
    		<div class="form-group row" style="margin-top: 20px">
    			<label for="phone" class="col-sm-2 col-form-lable" style="margin-top: 10px">手机号码</label>
    			<div class="col-sm-10">
      				<input type="text" class="form-control" id="phone" placeholder="请输入手机号码" name="phone" style="width: 400px">
    			</div>
    		</div>
    		<div class="form-group row" style="margin-top: 20px">
    			<label for="code" class="col-sm-2 col-form-lable" style="margin-top: 10px">验证码</label>
    			<div class="col-sm-10">
      				<input type="text" class="form-control" id="code" placeholder="请输入验证码" name="code" style="width: 400px">
    			</div>
    		</div>
    		<div class="form-group row" style="margin-top: 20px">
    			<div class="col-sm-10">
      				<input type="submit" class="btn btn-primary" id="find" value="找回密码" style="width: 400px;margin-left: 40px">
    			</div>
    		</div>
    	</form>
    	</div>
    </div>
    <script type="text/javascript">
    	$(document).ready(function(){
    		$("#find").on("click", function(event){
    			$.ajax({
    				type:"GET",
    				url:"findPwd",
    				data:{username:$("#username").val(), email:$("#email").val(), phone:$("#phone").val()},
    				async:"false",
    				success:function(data){
    					alert(data);
    				}
    			});
    			return false;
    		});
    	});
    </script>
  </body>
</html>
