<%@page import="model.bean.News"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
			<div class="content-left fl">
				<%@include file="inc/left_bar.jsp" %>
			</div>
				<% 
					News item = (News) request.getAttribute("item");
					if(item!=null ){
						
				%>
			<div class="content-right fr">
				<h3><%=item.getName()%></h3>
				<div class="main-content">
					<p><%=item.getChiTiet() %></p>
				</div>
			</div>
					<%}else{ %>
					<p>không có tin nào!</p>
					<%} %>
<%@include file="inc/footer.jsp" %>