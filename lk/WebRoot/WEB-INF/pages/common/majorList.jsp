<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>专业列表</title>
    
  </head>
  
  <body>
    <div class="container">
  			<div class="row" style="height: 100px">
  				<a type="button" class="btn btn-success" id="btnAdd" name="btnAdd" href="${pageContext.request.contextPath }/major/add" >添加</a>
  			</div>
  			<div class="row">
  				<div id="content">
  					<table class="table table-bordered">
  						<thead>
  							<tr>
  								<th>序号</th>
  								<th>编号</th>
  								<th>名称</th>
  								<th>操作</th>
  							</tr>
  						</thead>
  						<tbody>
  						<c:forEach items="${majorPage.list}" var="major" varStatus="status">
  							<tr>
  								<th scope="row">${status.count + (majorPage.currentPage - 1)*majorPage.pageSize}</th>
  								<td>${major.majorCode}</td>
  								<td>${major.majorName}</td>
  								<td width="14%">
  								<a  class="btn btn-success "  href="${pageContext.request.contextPath }/major/edit?majorId=${major.majorId}" style="height: 22px; padding-top: 1px;">编辑</a>
  								<a  class="btn btn-danger "  href="${pageContext.request.contextPath }/major/delete?majorId=${major.majorId}"  style="height: 22px; padding-top: 1px;">删除</a>
  								</td>
  							</tr>
  						</c:forEach>
  						</tbody>
  					</table>
  				</div>
  				<div id="foot_nav" style="position: relative; bottom: 10px; margin-left: 20px;">
					<c:if test="${majorPage.currentPage > 1 }">
						<a href="${pageContext.request.contextPath }/major/list?currentPage=${majorPage.currentPage - 1}" class="btn btn-success previous"> <i class="fui-arrow-left"></i> 上一页 </a>
					</c:if>
					
					<ul class="pagination pagination-success">
					<c:if test="${majorPage.pageCount < 26}">
						<c:forEach begin="1" end="${majorPage.pageCount }" step="1" var="i">
							<li><a href="${pageContext.request.contextPath }/major/list?currentPage=${i}">${i }</a>
						</c:forEach>
					</c:if>
					</ul>
					
					<span class="btn btn-success">当前页:${majorPage.currentPage}/${majorPage.pageCount}</span>
					
					<c:if test="${majorPage.currentPage < majorPage.pageCount }">
						<a href="${pageContext.request.contextPath }/user/list?currentPage=${majorPage.currentPage + 1}" class="btn btn-success next"> 下一页 <i class="fui-arrow-right"></i> </a>
					</c:if>
			</div>
  			</div>
  		</div>
  </body>
</html>
