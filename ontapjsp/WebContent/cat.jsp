<%@page import="model.bean.News"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="inc/header.jsp" %>
			<div class="content-left fl">
				<%@include file="inc/left_bar.jsp" %>
			</div>
			<div class="content-right fr">
				<h3>Thời sự</h3>
				<div class="main-content items-new">
					<ul>
					<%
						ArrayList<News> listNewsByIdCat= (ArrayList<News>)request.getAttribute("listNewsByIdCat");
					if(listNewsByIdCat!=null&&listNewsByIdCat.size()>0){
						for(News objNews: listNewsByIdCat){
					%>
						<li>
							<h2>
								<a href="<%=request.getContextPath() %>/ChiTiet?id=<%=objNews.getId() %>" title=""><%=objNews.getName() %></a>
							</h2>
							<div class="item">
								<p><%=objNews.getMoTa() %></p>
								<div class="clr"></div>
							</div>
						</li>
						<%} }else{%>
						<p>Không có tin nào!</p>
						<%} %>
						
					</ul>
				</div>
			</div>
<%@include file="inc/footer.jsp" %>