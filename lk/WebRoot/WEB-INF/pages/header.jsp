<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link href="${pageContext.request.contextPath }/css/button.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/css/bootstrap.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/css/flat-ui.css" rel="stylesheet">
	<link href="${pageContext.request.contextPath }/css/qch.css">
  </head>
  
  <body>
  
  <style>
      body {
        <%--min-height: 2000px;--%>
        padding-top: 70px;
      }
    </style>
    	
    <div class="navbar navbar-default navbar-fixed-top" role="navigation" style="height: 60px">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
          </button>
          <a class="navbar-brand" href="#">亚翔综合系统</a>
        </div>
        <div class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href="#">首页</a></li>
            <li><a href="#about">About</a></li>
            <li><a href="#contact">Contact</a></li>
            <li class="dropdown">
              <a href="#" class="dropdown-toggle" data-toggle="dropdown">环安卫中心 <b class="caret"></b></a>
              <ul class="dropdown-menu">
                <li><a href="${pageContext.request.contextPath}/department/list">部门管理</a></li>
                <li><a href="${pageContext.request.contextPath}/proj/list">专案管理</a></li>
                <li><a href="${pageContext.request.contextPath}/user/list">用户管理</a></li>
                
                <li><a href="${pageContext.request.contextPath}/major/list">专业管理</a></li>
                <li><a href="${pageContext.request.contextPath}/majorSys/list">系统管理</a></li>
              </ul>
            </li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href="../navbar/">Default</a></li>
            <li class="active"><a href="./">Static top</a></li>
            <li><a href="../navbar-fixed-top/">Fixed top</a></li>
            
          </ul>
          <form class="navbar-form navbar-left" action="#" role="search">
            <div class="form-group">
              <div class="input-group">
                <input class="form-control" id="navbarInput-01" type="search" placeholder="Search">
                <span class="input-group-btn">
                  <button type="submit" class="btn"><span class="fui-search"></span></button>
                </span>
              </div>
            </div>
          </form>
        </div><!--/.nav-collapse -->
      </div>
    </div>
    
    
    
    
    
    
    
    <script src="${pageContext.request.contextPath }/js/jquery-3.2.1.js"></script>
    <script src="${pageContext.request.contextPath }/js/flat-ui.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/application.js"></script>
    <!--  <script src="${pageContext.request.contextPath }/js/bootstrap.min.js"></script>-->
  </body>
</html>
