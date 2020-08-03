<%@page import="model.dao.CatDAO"%>
<%@page import="model.bean.FriendList"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <div class="categories">
					 <h3>DANH MỤC BẠN BÈ</h3>
					 <%
					 	ArrayList<FriendList> listDanhMuc= CatDAO.getItems();
						 if(listDanhMuc!=null&&listDanhMuc.size()>0){
							 for(FriendList objFriend: listDanhMuc){
					 %>
					 <li class="active"><a href="<%=request.getContextPath()%>/Category?id=<%=objFriend.getId()%>"><%=objFriend.getName() %></a></li>
					<%} }%>
	</div>