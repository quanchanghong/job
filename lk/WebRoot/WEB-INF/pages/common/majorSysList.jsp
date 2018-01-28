<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>系统列表</title>
    
  </head>
  
  <body>
    <div class="container">
  			<div class="row" style="height: 100px">
  				<a type="button" class="btn btn-success" id="btnAdd" name="btnAdd" href="${pageContext.request.contextPath }/majorSys/add" >添加</a>
  			</div>
  			<div class="row">
  				<div id="content">
  					<table class="table table-bordered">
  						<thead>
  							<tr>
  								<th>序号</th>
  								<th>系统编号</th>
  								<th>系统名称</th>
  								<th>所属专业</th>
  								<th>操作</th>
  							</tr>
  						</thead>
  						<tbody>
  						<c:forEach items="${majorSysPage.list}" var="majorSys" varStatus="status">
  							<tr>
  								<th scope="row">${status.count + (majorSysPage.currentPage - 1)*majorSysPage.pageSize}</th>
  								<td>${majorSys.majorSysCode}</td>
  								<td>${majorSys.majorSysName}</td>
  								<td>${majorSys.major.majorName}</td>
  								<td width="14%">
  								<a  class="btn btn-success "  href="${pageContext.request.contextPath }/majorSys/edit?majorSysId=${majorSys.majorSysId}" style="height: 22px; padding-top: 1px;">编辑</a>
  								<a  class="btn btn-danger "  href="${pageContext.request.contextPath }/majorSys/delete?majorSysId=${majorSys.majorSysId}"  style="height: 22px; padding-top: 1px;">删除</a>
  								</td>
  							</tr>
  						</c:forEach>
  						</tbody>
  					</table>
  				</div>
  				<div id="foot_nav" style="position: relative; bottom: 10px; margin-left: 20px;">
					<c:if test="${majorSysPage.currentPage > 1 }">
						<a href="${pageContext.request.contextPath }/majorSys/list?currentPage=${majorSysPage.currentPage - 1}" class="btn btn-success previous"> <i class="fui-arrow-left"></i> 上一页 </a>
					</c:if>
					
					<ul class="pagination pagination-success">
					<c:if test="${majorSysPage.pageCount < 26}">
						<c:forEach begin="1" end="${majorSysPage.pageCount }" step="1" var="i">
							<li><a href="${pageContext.request.contextPath }/majorSys/list?currentPage=${i}">${i }</a>
						</c:forEach>
					</c:if>
					</ul>
					
					<span class="btn btn-success">当前页:${majorSysPage.currentPage}/${majorSysPage.pageCount}</span>
					
					<c:if test="${majorSysPage.currentPage < majorSysPage.pageCount }">
						<a href="${pageContext.request.contextPath }/majorSys/list?currentPage=${majorSysPage.currentPage + 1}" class="btn btn-success next"> 下一页 <i class="fui-arrow-right"></i> </a>
					</c:if>
			</div>
  			</div>
  		</div>
  </body>
</html>
