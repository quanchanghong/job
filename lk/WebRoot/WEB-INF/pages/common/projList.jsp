<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>专案列表</title>
  </head>
  <body>
    <div class="container">
  			<div class="row" style="height: 100px">
  				<a type="button" class="btn btn-success" id="btnAdd" name="btnAdd" href="${pageContext.request.contextPath }/proj/add" >添加</a>
  			</div>
  			<div class="row">
  				<div id="content">
  					<table class="table table-bordered">
  						<thead>
  							<tr>
  								<th>序号</th>
  								<th>专案编号</th>
  								<th>专案名称</th>
  								<th>专案简称</th>
  								<th>创建日期</th>
  								<th>开始日期</th>
  								<th>结束日期</th>
  								<th>PM</th>
  								<th>PD</th>
  								<th>SM</th>
  								<th>创建者</th>
  								<th>操作</th>
  							</tr>
  						</thead>
  						<tbody>
  						<c:forEach items="${projPage.list}" var="proj" varStatus="status">
  							<tr>
  								<th scope="row">${status.count + (projPage.currentPage - 1)*projPage.pageSize}</th>
  								<td>${proj.projCode}</td>
  								<td>${proj.projName}</td>
  								<td>${proj.projShortName}</td>
  								<td>${proj.projCreate}</td>
  								<td>${proj.projStart}</td>
  								<td>${proj.projEnd}</td>
  								<td>${proj.projPM.userName}</td>
  								<td>${proj.projPD.userName}</td>
  								<td>${proj.projSM.userName}</td>
  								<td>${proj.creator.userName}</td>
  								<td width="14%">
  								<a  class="btn btn-success "  href="${pageContext.request.contextPath }/proj/edit?projId=${proj.projId}" style="height: 22px; padding-top: 1px;">编辑</a>
  								<a  class="btn btn-danger "  href="${pageContext.request.contextPath }/proj/delete?projId=${proj.projId}"  style="height: 22px; padding-top: 1px;">删除</a>
  								</td>
  							</tr>
  						</c:forEach>
  						</tbody>
  					</table>
  				</div>
  				<div id="foot_nav" style="position: relative; bottom: 10px; margin-left: 20px;">
					<c:if test="${projPage.currentPage > 1 }">
						<a href="${pageContext.request.contextPath }/proj/list?currentPage=${projPage.currentPage - 1}" class="btn btn-success previous"> <i class="fui-arrow-left"></i> 上一页 </a>
					</c:if>
					
					<ul class="pagination pagination-success">
					<c:if test="${projPage.pageCount < 26}">
						<c:forEach begin="1" end="${projPage.pageCount }" step="1" var="i">
							<li><a href="${pageContext.request.contextPath }/proj/list?currentPage=${i}">${i }</a>
						</c:forEach>
					</c:if>
					</ul>
					
					<span class="btn btn-success">当前页:${projPage.currentPage}/${projPage.pageCount}</span>
					
					<c:if test="${projPage.currentPage < projPage.pageCount }">
						<a href="${pageContext.request.contextPath }/proj/list?currentPage=${projPage.currentPage + 1}" class="btn btn-success next"> 下一页 <i class="fui-arrow-right"></i> </a>
					</c:if>
			</div>
  			</div>
  		</div>
  </body>
</html>
