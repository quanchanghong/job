<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  	<meta charset="utf-8">
  	<meta name="viewport" content="width=1000, initial-scale=1.0, maximum-scale=1.0">
    <!--  <meta http-equiv="X-UA-Compatible" content="IE=edge">-->
    <!--  <meta name="viewport" content="width=device-width, initial-scale=1">-->
    
    <title>亚翔工程云管理平台</title>
    
    <link href="${pageContext.request.contextPath }/css/ie10-viewport-bug-workaround.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/carousel.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath }/css/flat-ui.css" rel="stylesheet">
  </head>
  
  <!--<body background="${pageContext.request.contextPath}/images/lk_index_bg.png">-->
  <body>
  
  
  <form action="${pageContext.request.contextPath }/login" method="post">
  <div class="mylogin">
  	<div>
  		<!-- <p>亚翔工程云管理平台</p> -->
  	</div>
        <!--  <div class="login-screen">-->
          <div class="login-form">
            <div class="form-group">
              <input type="text" class="form-control login-field" value="" placeholder="请输入工号" id="login-name" />
              <label class="login-field-icon fui-user" for="login-name"></label>
            </div>

            <div class="form-group">
              <input type="password" class="form-control login-field" value="" placeholder="请输入密码" id="login-pass" />
              <label class="login-field-icon fui-lock" for="login-pass"></label>
            </div>

            <a class="btn btn-primary btn-lg btn-block" href="${pageContext.request.contextPath }/login">登录</a>
            <a class="login-link" href="#">忘记密码?</a>
          </div>
        <!--  </div>-->
      </div>
     </form>
    
    <div id="myCarousel" class="carousel slide" data-ride="carousel">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
      </ol>
      <div class="carousel-inner" role="listbox">
        <div class="item active">
          <img class="first-slide" src="${pageContext.request.contextPath}/images/lk_index_bg.png" alt="First slide">
          <div class="container">
            <div class="carousel-caption">
              <h1>亚翔工程云管理平台</h1>
            </div>
          </div>
        </div>
        <div class="item">
          <img class="second-slide" src="${pageContext.request.contextPath}/images/lk_index_bg.png" alt="">
          <div class="container">
            <div class="carousel-caption">
              <h2>亚翔工程云管理平台</h2>
              
            </div>
          </div>
        </div>
        <div class="item">
          <img class="third-slide" src="${pageContext.request.contextPath}/images/lk_index_bg.png" alt="">
          <div class="container">
            <div class="carousel-caption">
              <h3>亚翔工程云管理平台</h3>
            </div>
          </div>
        </div>
      </div>
      <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
        <span class="sr-only">Previous</span>
      </a>
      <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
        <span class="sr-only">Next</span>
      </a>
    </div><!-- /.carousel -->
    
    
    
    <!--  <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>-->
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/vendor/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/ie10-viewport-bug-workaround.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/flat-ui.min.js"></script>
    
  </body>
</html>

