<%@page import="java.text.NumberFormat"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dto.shopDto"%>
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
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	img.photo{
		width:230px;
		height:230px;
		border: 1px solid gray;
		margin-bottom: 10px;
	}
	
	.shoptable{
		padding:10px;
		height:150px;
	}
	
	a.goDetail{
		text-decoration: none; 
		color:black;"
	}
	
	a.hover{
		color:gray;
		text-decoration: underline;
	}

</style>


<script type="text/javascript">
	$(function(){
		$("a.goDetail").click(function(){
			var shopnum=$(this).attr("shopnum");
			//alert(shopnum);
			
			// 디테일 페이지로 이동
			location.href="index.jsp?main=shop/detailPage.jsp?shopnum="+shopnum;
		});
		
	});
	
</script>
</head>
<%
	shopDao dao=new shopDao();
	List<shopDto> list=dao.getAllSangpums();
	
	NumberFormat nf=NumberFormat.getCurrencyInstance(); // 화폐
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>
<body>
<div class="container">

  <ul class="nav nav-tabs">
    <li class="active"><a data-toggle="tab" href="#tabs-total">전체목록</a></li>
    <li><a data-toggle="tab" href="#tabs-zero">제로</a></li>
    <li><a data-toggle="tab" href="#tabs-coke">콜라</a></li>
    <li><a data-toggle="tab" href="#tabs-ade">이온음료</a></li>
    <li><a data-toggle="tab" href="#tabs-coffee">커피</a></li>
    <li><a data-toggle="tab" href="#tabs-water">물</a></li>
  </ul>

  <div class="tab-content">
    <div id="tabs-total" class="tab-pane fade in active">
      <h3>전체목록</h3>
      <p>
		<table class="shop table table-bordered" style="width:1000px;">
			<tr>
				<%
					int i=0;
					for(shopDto dto:list){
						// 20~50 까지 난수 발생
						int sale=(int)(Math.random()*31)+20;
					%>
						<td>
							<a shopnum="<%=dto.getShopnum()%>" style="cursor: pointer; class="goDetail">
								<img alt="" src="shopsave/<%=dto.getPhoto()%>" class="photo">
								<br>
								<%=dto.getSangpum() %> <br> </a>
								<b style="color:red;"><%=sale %>%</b>
								<span style="float:right;">
									<div style="color:gray; font-size: 12px;">
										<!-- 원래 가격에 취소선 strike -->
										<%
											// 세일 전 가격
											int price=(int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
										%>
										<strike><%=nf.format(price) %></strike>
									</div>
									<div style="color:black;">
										<%=nf.format(dto.getPrice()) %>
									</div>
								</span>
								
							
						</td>	
						<%
							// 한 행에 들어갈 아이템 수 설정
							if((i+1)%5==0){%>
								</tr><tr>
							<%}
							i++;
							
						%>
					<%}
				%>
			</tr>
		</table>
	  </p>
    </div>
    
    <div id="tabs-zero" class="tab-pane fade">
      <h3>제로</h3>
      <p>
      	<table class="shop table table-bordered" style="width:900px;">
			<tr>
				<%
					i=0;
					for(shopDto dto:list){
						// 카테고리 가져오기
						if(dto.getCategory().equals("제로")){

						// 20~50 까지 난수 발생
						int sale=(int)(Math.random()*31)+20;
					%>
						<td>
							<a shopnum="<%=dto.getShopnum()%>" style="cursor: pointer;" class="goDetail">
								<img alt="" src="shopsave/<%=dto.getPhoto()%>" class="photo">
								<br>
								<%=dto.getSangpum() %> <br></a>
								<b style="color:red;"><%=sale %>%</b>
								<span style="float:right;">
									<div style="color:gray; font-size: 12px;">
										<!-- 원래 가격에 취소선 strike -->
										<%
											// 세일 전 가격
											int price=(int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
										%>
										<strike><%=nf.format(price) %></strike>
									</div>
									<div style="color:black;">
										<%=nf.format(dto.getPrice()) %>
									</div>
								</span>
								
							
						</td>	
						<%
							// 한 행에 들어갈 아이템 수 설정
							if((i+1)%5==0){%>
								</tr><tr>
							<%}
							i++;
							
						%>
						
					<%}
						
					// if문 닫음
					}
				%>
			</tr>
		</table>
      
      
      </p>
    </div>
    
    <div id="tabs-coke" class="tab-pane fade">
      <h3>콜라</h3>
      <p>
      	<table class="shop table table-bordered" style="width:900px;">
			<tr>
				<%
					i=0;
					for(shopDto dto:list){
						// 카테고리 가져오기
						if(dto.getCategory().equals("콜라")){

						// 20~50 까지 난수 발생
						int sale=(int)(Math.random()*31)+20;
					%>
						<td>
							<a shopnum="<%=dto.getShopnum()%>" style="cursor: pointer;" class="goDetail">
								<img alt="" src="shopsave/<%=dto.getPhoto()%>" class="photo">
								<br>
								<%=dto.getSangpum() %> <br></a>
								<b style="color:red;"><%=sale %>%</b>
								<span style="float:right;">
									<div style="color:gray; font-size: 12px;">
										<!-- 원래 가격에 취소선 strike -->
										<%
											// 세일 전 가격
											int price=(int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
										%>
										<strike><%=nf.format(price) %></strike>
									</div>
									<div style="color:black;">
										<%=nf.format(dto.getPrice()) %>
									</div>
								</span>
								
							
						</td>	
						<%
							// 한 행에 들어갈 아이템 수 설정
							if((i+1)%5==0){%>
								</tr><tr>
							<%}
							i++;
							
						%>
						
					<%}
						
					// if문 닫음
					}
				%>
			</tr>
		</table>
      </p>
    </div>
    
    <div id="tabs-ade" class="tab-pane fade">
      <h3>이온음료</h3>
      <p>
      	<table class="shop table table-bordered" style="width:900px;">
			<tr>
				<%
					i=0;
					for(shopDto dto:list){
						// 카테고리 가져오기
						if(dto.getCategory().equals("이온음료")){

						// 20~50 까지 난수 발생
						int sale=(int)(Math.random()*31)+20;
					%>
						<td>
							<a shopnum="<%=dto.getShopnum()%>" style="cursor: pointer;" class="goDetail">
								<img alt="" src="shopsave/<%=dto.getPhoto()%>" class="photo">
								<br>
								<%=dto.getSangpum() %> <br></a>
								<b style="color:red;"><%=sale %>%</b>
								<span style="float:right;">
									<div style="color:gray; font-size: 12px;">
										<!-- 원래 가격에 취소선 strike -->
										<%
											// 세일 전 가격
											int price=(int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
										%>
										<strike><%=nf.format(price) %></strike>
									</div>
									<div style="color:black;">
										<%=nf.format(dto.getPrice()) %>
									</div>
								</span>
								
							
						</td>	
						<%
							// 한 행에 들어갈 아이템 수 설정
							if((i+1)%5==0){%>
								</tr><tr>
							<%}
							i++;
							
						%>
						
					<%}
						
					// if문 닫음
					}
				%>
			</tr>
		</table>
      </p>
    </div>
    
    <div id="tabs-coffee" class="tab-pane fade">
      <h3>커피</h3>
      <p>
      	<table class="shop table table-bordered" style="width:900px;">
			<tr>
				<%
					i=0;
					for(shopDto dto:list){
						// 카테고리 가져오기
						if(dto.getCategory().equals("커피")){

						// 20~50 까지 난수 발생
						int sale=(int)(Math.random()*31)+20;
					%>
						<td>
							<a shopnum="<%=dto.getShopnum()%>" style="cursor: pointer;" class="goDetail">
								<img alt="" src="shopsave/<%=dto.getPhoto()%>" class="photo">
								<br>
								<%=dto.getSangpum() %> <br></a>
								<b style="color:red;"><%=sale %>%</b>
								<span style="float:right;">
									<div style="color:gray; font-size: 12px;">
										<!-- 원래 가격에 취소선 strike -->
										<%
											// 세일 전 가격
											int price=(int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
										%>
										<strike><%=nf.format(price) %></strike>
									</div>
									<div style="color:black;">
										<%=nf.format(dto.getPrice()) %>
									</div>
								</span>
								
							
						</td>	
						<%
							// 한 행에 들어갈 아이템 수 설정
							if((i+1)%5==0){%>
								</tr><tr>
							<%}
							i++;
							
						%>
						
					<%}
						
					// if문 닫음
					}
				%>
			</tr>
		</table>
      </p>
    </div>
    
    <div id="tabs-water" class="tab-pane fade">
      <h3>물</h3>
      <p>
      	<table class="shop table table-bordered" style="width:900px;">
			<tr>
				<%
					i=0;
					for(shopDto dto:list){
						// 카테고리 가져오기
						if(dto.getCategory().equals("물")){

						// 20~50 까지 난수 발생
						int sale=(int)(Math.random()*31)+20;
					%>
						<td>
							<a shopnum="<%=dto.getShopnum()%>" style="cursor: pointer;" class="goDetail">
								<img alt="" src="shopsave/<%=dto.getPhoto()%>" class="photo">
								<br>
								<%=dto.getSangpum() %> <br></a>
								<b style="color:red;"><%=sale %>%</b>
								<span style="float:right;">
									<div style="color:gray; font-size: 12px;">
										<!-- 원래 가격에 취소선 strike -->
										<%
											// 세일 전 가격
											int price=(int)(dto.getPrice()+(dto.getPrice()*(sale/100.0)));
										%>
										<strike><%=nf.format(price) %></strike>
									</div>
									<div style="color:black;">
										<%=nf.format(dto.getPrice()) %>
									</div>
								</span>
								
							
						</td>	
						<%
							// 한 행에 들어갈 아이템 수 설정
							if((i+1)%5==0){%>
								</tr><tr>
							<%}
							i++;
							
						%>
						
					<%}
						
					// if문 닫음
					}
				%>
			</tr>
		</table>
      </p>
    </div>
  </div>
  
</div>


</body>
</html>
