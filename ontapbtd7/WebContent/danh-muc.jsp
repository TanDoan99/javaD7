<%@page import="model.bean.Friends"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>TRUNG TÂM ĐÀO TẠO LẬP TRÌNH VINAENTER</title>
	<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
	<link href="css/style.css" rel='stylesheet' type='text/css' />
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="vinaneter, php, java, android, ios, laravel, codeigniter" />
	<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
	<!----webfonts---->
		<link href='http://fonts.googleapis.com/css?family=Oswald:100,400,300,700' rel='stylesheet' type='text/css'>
		<link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,300italic,400italic,600italic' rel='stylesheet' type='text/css'>
		<!----//webfonts---->
		  <script src="http://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
		<!--end slider -->
		<!--script-->
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<!--/script-->
<script type="text/javascript">
			jQuery(document).ready(function($) {
				$(".scroll").click(function(event){		
					event.preventDefault();
					$('html,body').animate({scrollTop:$(this.hash).offset().top},900);
				});
			});
</script>
<!---->

</head>
<body>
<!---strat-banner---->
<div class="banner">				
	 <div class="header">  
		  <div class="container">
			  <div class="logo">
					<a href="/"> <img src="images/logo.png" title="soup" /></a>
			 </div>
			 <!---start-top-nav---->
			 <div class="top-menu">
				  <span class="menu"> </span> 
				   <ul>
						<li><a href="index.html">Trang chủ</a></li>							
						<div class="clearfix"> </div>
				 </ul>
			 </div>
			 <div class="clearfix"></div>
					<script>
					$("span.menu").click(function(){
					$(".top-menu ul").slideToggle("slow" , function(){
					});
					});
					</script>
				<!---//End-top-nav---->					
		 </div>
	 </div>
	 <div class="container">
		 <div class="banner-head">
			 <h1>NHỮNG NGƯỜI BẠN THÂN CỦA TÔI</h1>
		 </div>
		 <div class="banner-links">
			 <ul>
				 <li class="active"><a href="index.html">Những người bạn</a></li>
				 <li><a href="lien-he.html">Liên hệ</a></li>
				 <div class="clearfix"></div>
			 </ul>
		 </div>
	 </div>
</div>
<!---//End-banner---->
<div class="content">
	 <div class="container">
		 <div class="content-grids">
			 <div class="col-md-8 content-main">		
			 	<%
			 		if (request.getAttribute("fl") != null) {
			 			FriendList fl = (FriendList) request.getAttribute("fl");
			 	%>		 
				 <h1 class="title"><span>Những người bạn >> </span><%=fl.getName() %></h1>
				 <%} %>
				 <div class="content-grid-sec">
				 <%
				 	if (request.getAttribute("listFriendCat") != null) {
					 	ArrayList<Friends> listFriendCat=(ArrayList<Friends>) request.getAttribute("listFriendCat");
					 	if(listFriendCat!=null && listFriendCat.size()>0){
					 		for(Friends objFriend: listFriendCat){
				 
				 %>
					 <div class="content-sec-info">
							 <h3><a href="<%=request.getContextPath()%>/Category?id=<%=objFriend.getFl_id()%>"><%=objFriend.getFname() %></a></h3>
							 <h4>Đăng ngày: <%=objFriend.getDate_create() %> - Lượt xem: <%=objFriend.getCount_number() %></h4>
							 <p><%=objFriend.getDetail() %> </p>
							 <img src="<%=request.getContextPath() %>/images/<%=objFriend.getPicture()%>" alt=""/>
							 <a class="bttn" href="<%=request.getContextPath()%>/Detail?id=<%=objFriend.getFid()%>">Chi tiết bạn tôi</a>
					 </div>
					 <%}} }%>
				 </div>
				 	 
			 </div>
			 
			 <div class="col-md-4 content-main-right">
				 <div class="search">
						 <h3>TÌM BẠN TÔI</h3>
						<form>
							<input type="text" value="" onfocus="this.value=''" onblur="this.value=''">
							<input type="submit" value="">
						</form>
				 </div>
				 
				 <%@include file="/inc/sitebar.jsp" %>
				 
				 <div class="archives">
					 <h3>Liên kết VinaEnter</h3>
					 <li class="active"><a href="http://vinaenter.edu.vn/lap-trinh-php-tu-az.html" target="_blank"><img width="100%" src="images/php.png" alt="" /></a></li>
					 <li><a href="http://vinaenter.edu.vn/lap-trinh-java-tu-az.html" target="_blank"><img width="100%" src="images/java.png" alt="" /></a></li>
					 <li><a href="http://vinaenter.edu.vn/lap-trinh-android-tu-az.html" target="_blank"><img width="100%" src="images/android.png" alt="" /></a></li>
				 </div>
			 </div>
			 <div class="clearfix"></div>
		 </div>
	 </div>
</div>

<div class="copywrite">
	 <div class="container">
	 <p>Copyrights &copy; 2016 <a href="http://vinaenter.edu.vn">VinaEnter Edu</a>. All rights reserved</p>
</div>
</div>
<!---->
<script type="text/javascript">
		$(document).ready(function() {
				/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
				*/
		$().UItoTop({ easingType: 'easeOutQuart' });
});
</script>
<a href="#to-top" id="toTop" style="display: block;"> <span id="toTopHover" style="opacity: 1;"> </span></a>


</body>
</html>