<%@page import="model.dao.CatDAO"%>
<%@page import="model.bean.Category"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h3>Danh mục tin</h3>
<ul>
<%
	ArrayList<Category> listDanhMuc = (ArrayList<Category>) CatDAO.getItems();
	if(listDanhMuc!=null&&listDanhMuc.size()>0){
		for(Category objDanhMuc:listDanhMuc){
%>
	<li><a href="<%=request.getContextPath() %>/cat?id=<%=objDanhMuc.getId() %>" title=""><%=objDanhMuc.getName() %></a></li>
	<%}} %>
</ul>