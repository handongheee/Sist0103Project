<%@page import="data.dto.shopDto"%>
<%@page import="data.dto.cartDto"%>
<%@page import="java.util.Map"%>
<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dao.memberDao"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.shopDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
   <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<title>Insert title here</title>
<style type="text/css">
	img.photo{
		width: 110px;
		border: 2px solid gray;
	}
</style>

<script type="text/javascript">
	$(function(){
		$("#allCheck").click(function(){
			// 체크값 얻기 - 전체체크
			var chk=$(this).is(":checked");
			//console.log(chk);
			
			// 체크값 일괄 전달 prop
			$(".idx").prop("checked",chk);
		});
		
		// 상품 클릭 시 디테일 페이지로 이동
		$("div.sangpum").click(function(){
			var shopnum=$(this).attr("shopnum");
			//alert(shopnum);
			
			location.href="index.jsp?main=shop/detailPage.jsp?shopnum="+shopnum;
		});
		
		// 체크박스 삭제
		$("#btnCartDel").click(function(){
			var cnt=$(".idx:checked").length;
			//alert(cnt);
			
			// null 체크
			if(cnt==0){
				alert("삭제할 상품을 선택해주세요.");
				return;
			}
			
			// 선택자 반복문
			$(".idx:checked").each(function(i, elt){
				var idx=$(this).attr("idx");
				console.log(idx);
				
				// 선택한 장바구니 상품 모두 삭제하기
				del(idx);
			});
			// 현재 페이지 새로고침
			location.reload();
		});
		
		// 개별 삭제 i태그
		$("i.del").click(function(){
			var idx=$(this).attr("idx");
			//alert(idx);
			
			var a=confirm("삭제하시겠습니까?");
			if(a){
				del(idx);
				
				// 현재 페이지 새로고침
				location.reload();
			}
			
		});
	
	});
	
	// 사용자 함수 - 삭제
	function del(idx){
		$.ajax({
			type:"get",
			url:"shop/cartDelete.jsp",
			dataType:"html",
			data:{"idx":idx},
			success:function(){
				
			}
		});
	}
</script>
</head>
<%
	String id=(String)session.getAttribute("myid");
	memberDao mdao=new memberDao();
	String name=mdao.getName(id);
	
	shopDao dao=new shopDao();
	List<HashMap<String, String>> list=dao.getCartList(id);
	
	NumberFormat nf=NumberFormat.getCurrencyInstance();
	
	cartDto cdto=new cartDto();
	shopDto sdto=new shopDto();
	
	int totalmoney=0;
%>
<body>
	<h4 class="alert alert-info" style="width:800px;"><%=name %>님의 장바구니</h4>
	<table class="table table-striped" style="width:800px;">
		<tr>
			<th style="width:30px;"><input type="checkbox" id="allCheck"></th>
			<th style="width:200px;">상품정보</th>
			<th style="width:200px;">상품금액</th>
		</tr>
		
		<%
			for(int i=0; i<list.size(); i++){
				// list에 해당하는 값을 map에 넣는다
				HashMap<String, String> map=list.get(i);
				
				// 사진 얻기 map.get
				String photo=map.get("photo");
				%>
				
				<!-- 출력 -->
				<tr>
					<td style="vertical-align: middle">
						<input type="checkbox" name="idx" idx="<%=map.get("idx")%>" class="idx">
					</td>
					
					<td>
						<div class="sangpum" shopnum="<%=map.get("shopnum")%>">
							<img alt="" src="shopsave/<%=photo%>" class="photo" align="left" hspace="20">
							<b><%=map.get("sangpum") %></b> <br>
							개수: <%=map.get("cnt") %>개 <br>
							개당 가격: <%=map.get("price") %>원 <br>
							<%=map.get("cartday") %>
						</div>
					</td>
					
					<td style="vertical-align: middle">
						<%
							
						
							// 가격 형변환
							int price=Integer.parseInt(map.get("price"));
							int cnt=Integer.parseInt(map.get("cnt"));
							price*=cnt;
							totalmoney+=price;
						%>
						<h6>
							<%=nf.format(price) %>
							<i class="bi bi-trash3 del" idx=<%=map.get("idx") %> style="color:red; margin-left: 15px;"></i>
						</h6>
						
					</td>
				</tr>
			<%}		
		%>
			<tr>
				<td colspan="3">
					<button class="btn btn-outline-danger" style="margin-left:100px;" id="btnCartDel">선택삭제</button>
					
					<span style="font-size: 1.5em; float: right;">
						<!-- 장바구니 0원 출력하기 -->
						<%
							if(totalmoney==0){%>
								<b style="color:#FF5C00">총 금액 <%=nf.format(totalmoney) %> </b>
								
							<%} else{ %>
								<b style="color:#FF5C00">총 금액 <%=nf.format(totalmoney) %> </b>
							<%}
						%>
						
					</span>
				</td>
			</tr>
		
	</table>
</body>
</html>
