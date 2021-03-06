<%@page import="model.bean.Friends"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/inc/header.jsp" %>
<!---//End-banner---->
<div class="content">
	 <div class="container">
		 <div class="content-grids">
			 <div class="col-md-8 content-main">
				 <div class="content-grid">
				 <%
				 	if (request.getAttribute("fr") != null) {
				 		Friends fr=(Friends) request.getAttribute("fr");
				 %>
					 <div class="content-grid-head">
						 <h3><%=fr.getFname() %></h3>
						 <h4>Đăng ngày: <%=fr.getDate_create() %> - Lượt xem: <%=fr.getCount_number() %></h4>
						 <div class="clearfix"></div>
					 </div>
					 <div class="content-grid-single">
						 <h3><%=fr.getFname() %></h3>
						 <div class="detail_text">
							 <span><%=fr.getDetail() %></span>
							 <img class="single-pic" src="images/anh1.jpg" alt="">
							 <p><%=fr.getDetail() %></p>
						 </div>
						
						 <div class="comments">
							 <h3>Bạn thân khác của tôi</h3>
							 <div class="comment-grid">
								 <img src="images/anh2.jpg" alt="">
								 <div class="comment-info">
								 <h4><a href="chi-tiet.html">Nguyễn Văn Hùng</a></h4>
								 <p>Hùng sinh ra trong một gia đình giỏi IT. Bố Hùng hiện đang là cố vấn sản phẩm chủ lực của Microsoft. Mẹ cũng là 1 lập trình viên cừ khôi tại tập đoàn VinaEnter.</p>
								 </div>
								 <div class="clearfix"></div>
							 </div>
							 
							 <div class="comment-grid">
								 <img src="images/anh1.jpg" alt="">
								 <div class="comment-info">
								 <h4><a href="chi-tiet.html">Trần Nguyễn Gia Huy</a></h4>
								 <p>Huy là bạn của tôi hồi còn mẫu giáo. Tôi còn nhớ cậu nói: Bạn thích ăn kẹo không mình mang đến cho...</p>
								 </div>
								 <div class="clearfix"></div>
							 </div>	
						</div>
					  </div>
					  <%}%>
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