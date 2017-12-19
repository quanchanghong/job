<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/pages/header.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>用户管理</title>
  </head>
  <body>
  		<div class="container">
  			<div class="row" style="height: 100px">
  				<input type="button" class="btn btn-success" value="添加"/>
  			</div>
  			<div class="row">
  				<div id="content">
  					<table class="table table-bordered">
  						<thead>
  							<tr>
  								<th>序号</th>
  								<th>姓名</th>
  								<th>工号</th>
  								<th>部门</th>
  								<th>状态</th>
  								<th>角色</th>
  								<th>技能</th>
  								<th>操作</th>
  							</tr>
  						</thead>
  						<tbody>
  						<c:forEach items="${userList}" var="user" varStatus="status">
  							<tr>
  								<th scope="row">${status.count}</th>
  								<td>${user.userName}</td>
  								<td>${user.userCode}</td>
  								<td>${user.departmentId}</td>
  								<td>${user.state}</td>
  								<td>${user.roleId}</td>
  								<td>${user.skill}</td>
  								<td width="14%">
  								<a  class="btn btn-success "  href="" style="height: 22px; padding-top: 1px;">编辑</a>
  								<a  class="btn btn-danger "  href=""  style="height: 22px; padding-top: 1px;">删除</a>
  								</td>
  							</tr>
  						</c:forEach>
  						</tbody>
  					</table>
  				</div>
  				<div id="foot_nav">
				<div>
					<a href="#fakelink" class="btn btn-success previous"> <i
						class="fui-arrow-left"></i> 上一页 </a>
					<ul class="pagination pagination-success">
						<li><a href="#fakelink">1</a>
						</li>
						<li><a href="#fakelink">2</a>
						</li>
						<li><a href="#fakelink">3</a>
						</li>
						<li><a href="#fakelink">4</a>
						</li>
						<li><a href="#fakelink">5</a>
						</li>
					</ul>
					<a href="#fakelink" class="btn btn-success next"> 下一页 <i
						class="fui-arrow-right"></i> </a>
				</div>
				<!-- /pagination -->
			</div>
  			</div>
  		</div>
  </body>
</html>
