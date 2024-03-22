<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%
	// 프로젝트 경로 (절대경로)
	String root=request.getContextPath();

	// 아이디, 로그인유무 세션 가져오기
	String myid=(String)session.getAttribute("myid");
	String loginok=(String)session.getAttribute("loginok");
%>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>

   	<link rel="stylesheet" type="text/css" href="<%=root %>/menu/css/font-awesome.css">
	<link rel="stylesheet" type="text/css" href="<%=root %>/menu/css/menu.css">

	<script type="text/javascript" src="<%=root %>/menu/js/jquery.js"></script>
	<script type="text/javascript" src="<%=root %>/menu/js/function.js"></script>
   
<title>menu</title>
</head>

<body>
<!--  
	<a href="<%=root %>/">메인</a> &nbsp;&nbsp;&nbsp;
	<a href="<%=root %>/">로그인</a> &nbsp;&nbsp;&nbsp;
	<a href="index.jsp?main=member/addForm.jsp">회원가입</a> &nbsp;&nbsp;&nbsp;
	<a href="<%=root %>/">Q&A</a> &nbsp;&nbsp;&nbsp;
	<a href="<%=root %>/">방명록</a> &nbsp;&nbsp;&nbsp;
	<a href="<%=root %>/">상품등록게시판</a> &nbsp;&nbsp;&nbsp;
	<a href="<%=root %>/">이미지</a> &nbsp;&nbsp;&nbsp;
-->	
	 
	<div id="wrap">
	<header>
		<div class="inner relative">
			<a class="logo" href="#"></a>
			<a id="menu-toggle" class="button gray" href="#"><i class="icon-reorder"></i></a>
			<nav id="navigation">
				<ul id="main-menu">
					<li class="current-menu-item"><a href="<%=root%>/">Home</a></li>
					<li class="parent">
						<a href="#">게시판</a>
						<ul class="sub-menu">
							<li><a href="#"><i class="icon-wrench"></i> 회원게시판</a></li>
							<li><a href="#"><i class="icon-credit-card"></i> 이미지게시판</a></li>
							<li><a href="#"><i class="icon-gift"></i> 스마트게시판</a></li>	
						</ul>
					</li>
					<li>
						<a href="#">회원</a>
						<ul class="sub-menu">
							<li><a href="index.jsp?main=member/addForm.jsp"><i class="icon-wrench"></i> 회원가입</a></li>
							
							<%
								// 로그인 되어있고, 관리자 계정이면 회원목록 출력되게
								if(loginok!=null && myid.equals("admin")){%>
									<li><a href="index.jsp?main=member/memberList.jsp"><i class="icon-credit-card"></i> 회원목록</a></li>
								<%}
							%>
							
							
							<li><a href="index.jsp?main=member/myPage.jsp"><i class="icon-gift"></i> 마이페이지</a></li>
							<li><a href="index.jsp?main=login/loginMain.jsp"><i class="icon-gift"></i> 로그인</a></li>
						</ul>
					</li>
					<li class="parent">
						<a href="#">방명록</a>
						<ul class="sub-menu">
							<li><a href="index.jsp?main=memberGuest/guestList.jsp">회원방명록</a></li>
							<li><a href="#">Medium Image</a></li>
							
						</ul>
					</li>
					<li><a href="#">About CocaCola</a></li>
				</ul>
			</nav>
			<div class="clear"></div>
		</div>
	</header>	
</div>    
	
</body>
</html>