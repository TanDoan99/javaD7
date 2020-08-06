<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="/inc/header.jsp" %>
<!---//End-banner---->
<div class="contact">
	 <div class="container">
		 <div class="contact-head">
			 <h3>Liên hệ</h3>
			  <form action="<%=request.getContextPath() %>/LienHeController" method="post">
				  <div class="col-md-6 contact-left">
						<input type="text" placeholder="Name" required=""name="name">
						<input type="text" placeholder="E-mail" required="" name="email">
						<input type="text" placeholder="Phone" required="" name="phone">
				 </div>
				 <div class="col-md-6 contact-right">
						 <textarea placeholder="Message" name="mess"></textarea>
						 <input type="submit" value="SEND">
				 </div>
				 <div class="clearfix"></div>
			 </form>
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