<%@page import="data.dao.memberDao"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="data.dao.shopDao"%>
<%@page import="data.dto.shopDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
	img.large{
		width:400px;
	}
</style>


</head>
<%
	String shopnum=request.getParameter("shopnum");

	// 로그인 상태 얻기
	String loginok=(String)session.getAttribute("loginok");
	String myid=(String)session.getAttribute("myid");
	
	// 아이디에 해당하는 멤버 시퀀스 얻기
	memberDao mdao=new memberDao();
	String num=mdao.getNum(myid);
	
	// 해당 상품에 대한 데이터 얻기
	shopDao sdao=new shopDao();
	shopDto dto=sdao.getData(shopnum);

	NumberFormat nf=NumberFormat.getCurrencyInstance();
%>
<body>
	<div style="margin: 50px 100px; width:800px;">
		<!-- form에 id를 넣으면 name을 한번에 넘길 수 있다 serialize -->
		<form id="frm">
			<!-- hidden : 장바구니 DB에 넣어야 할 것 -->
			<input type="hidden" name="shopnum" value="<%=shopnum%>">
			<input type="hidden" name="num"	value="<%=num%>">
			
			<table class="table">
				<tr>
					<td style="width:500px;">
						<img alt="" src="shopsave/<%=dto.getPhoto()%>" class="large img-thumnail">
					</td>
					
					<td style="width:300px; padding-top: 50px;">
						<h7>코카콜라 > <b><%=dto.getCategory() %></b></h7> <br>
						<h5><%=dto.getSangpum() %></h5> <br>
						<h8><%=nf.format(dto.getPrice()) %></h8>
						<br>
						
						<!-- 개수 선택 (타입/최소값/최대값/클릭 당 올라가는 개수step 	) -->
						<h8>
							개수 : 
							<input type="number" min="1" max="10" value="1" step="1" name="cnt" class="form-control" style="width:60px;">
						</h8>
						
						<div style="margin-top:100px; margin-left:60px;">
							<button type="button" class="btn btn-success" id="btnCart">장바구니</button>
							<button type="button" class="btn btn-outline-info" onclick="location.href='index.jsp?main=shop/shopList.jsp'">상품목록</button>
						</div>
						
					</td>
				</tr>			
			</table>	
		</form>
	</div>
	
	<script type="text/javascript">
		$("#btnCart").click(function(){	
			// 로그인해야 장바구니에 들어가게 로그인 여부 체크
			var login="<%=loginok%>";
			
			if(login=="null"){
				alert("로그인이 필요합니다.");
				return;
			}
			
			// form 태그의 값을 다 가져오기 ajax
			var cartData=$("#frm").serialize();
			//alert(cartData);
			
			// 장바구니에 상품 추가 ajax
			$.ajax({
				type:"get",
				dataType:"html",
				url:"shop/detailProcess.jsp",
				data:cartData,
				success:function(){
					//alert("장바구니 성공");
					
					var a=confirm("장바구니에 담겼습니다.\n장바구니로 이동하시겠습니까?");
					if(a){
						location.href="index.jsp?main=shop/myCart.jsp";
						
					}
				}
			});
			
		});
		
		
		
	
	</script>
</body>
</html>
