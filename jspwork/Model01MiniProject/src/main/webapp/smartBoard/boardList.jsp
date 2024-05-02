<%@page import="data.dao.smartAnswerDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dao.smartDao"%>
<%@page import="java.util.Vector"%>
<%@page import="java.util.List"%>
<%@page import="data.dto.smartDto"%>
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
	a.detail{
		cursor: pointer;
		text-decoration: none;
		color:black;
		
		/* 제목이 긴 경우 줄임 처리 */
		text-overflow: ellipsis;
		white-space: nowrap;
		overflow: hidden;
		width: 250px;
		display: block;		
	}
	
	a.detail:hover{
		color:gray;
		text-decoration: underline;
	}
</style>

<script type="text/javascript">
	$(function(){
		// 전체 체크 클릭 시 체크값 얻어서 모든 체크값에 전달
		$(".allDelCheck").click(function(){
			// 전체 체크값 얻기
			var chk=$(this).is(":checked");
			console.log(chk); // true/false
			
			// 전체 체크값을 글 앞에 체크에 일괄 전달 - prop()
			$(".allDel").prop("checked", chk);
		});
		
		// 삭제 버튼 클릭 시 삭제
		$("#btnDel").click(function(){
			var len=$(".allDel:checked").length;
			// alert(len);
			if(len==0){
				alert("최소 1개 이상 선택해주세요.");
			} else{
				// 삭제처리
				var a=confirm(len+"개의 글을 삭제하시겠습니까?");
				
				// 체크된 곳의 value 값(num)을 n에 누적
				var n="";
				$(".allDel:checked").each(function(idx){
					n+=$(this).val()+",";
				});
				
				// 마지막 , 제거
				n=n.substring(0,n.length-1);
				console.log(n);
				
				// 삭제 파일로 전송
				location.href="smartBoard/allDelete.jsp?nums="+n;
			}
		});
		
	});
</script>
</head>
<%
	smartDao dao=new smartDao();
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	// 페이징 처리
	// * 페이지 ----------------------------------------------------------------------
	// 전체 개수
	int totalCount=dao.getTotalCount();
	int perpage=3; // 한페이지당 보여질 글의 개수
	int perBlock=5; // 한블럭당 보여질 페이지 개수
	int start; // db에서 가져올 글의 시작 번호(mysql은 첫글이 0번, oracle은 1번)
	int startPage; // 각 블럭마다 보여질 시작페이지
	int endPage; // 각 블럭마다 보여질 끝페이지
	int currentPage; // 현재페이지
	int totalPage; // 총 페이지 수.
	int no; // 각 페이지당 출력할 시작번호 (필수 아님)
	
	// 현재 페이지를 읽는데 단, null일 경우는 1페이지로 준다.
	if(request.getParameter("currentPage")==null){
		currentPage=1;
	} else{
		currentPage=Integer.parseInt(request.getParameter("currentPage")); // 계산을 위해 형변환
	}
	
	// 총 페이지 수 구한다
	// (총 글 개수)/(한페이지당 보여질 개수)로 나눔 (7/5=1)
	// 나머지가 1이라도 있으면 무조건 1페이지 추가(1+1=2페이지 추가)
	totalPage=totalCount/perpage+(totalCount%perpage==0?0:1);
	
	// 각 블럭 당 보여질 시작페이지
	// perBlock=5일 경우 현재 페이지가 1~5일 경우 시작페이지가 1, 끝페이지는 5
	// 현재가 13페이지일 경우엔 시작이 11 끝은 15
	startPage=(currentPage-1)/perBlock*perBlock+1;
	endPage=startPage+perBlock-1;
	
	// 총 페이지가 23일 경우 마지막 블럭은 25가 아닌 23
	if(endPage>totalPage){
		endPage=totalPage;
	}
	
	// 각 페이지에서 보여질 시작번호
	// 1페이지:0, 2페이지:5, 3페이지:10...
	start=(currentPage-1)*perpage;
	
	// 각 페이지당 출력할 시작 번호 구하기
	// ex. 총 글 개수가 23, 1페이지는:23 2페이지는:18, 3페이지는:13..
	no=totalCount-(currentPage-1)*perpage;
	
	// 페이지에서 보여질 글만 가져오기
	List<smartDto> list=dao.getList(start, perpage);
	// --------------------------------------------------------------------------
	
	
	// 댓글 개수 출력 0401
	smartAnswerDao adao=new smartAnswerDao();
	for(smartDto dto:list){
		// 댓글 변수에 댓글 총 개수 넣기
		int acount=adao.getAnswerList(dto.getNum()).size(); // 글번호에 따른 리스트의 개수
		dto.setAnswercount(acount);
	}
	
%>
<body>
<div style="margin:50px 100px; width:800px;">
	
	<br>
	<caption align="top">총 <%=totalCount %>개의 게시글이 있습니다.</caption>
	<table class="table table-bordered">
		<tr class="table-light">
			<td colspan="6">
			<input type="checkbox" class="allDelCheck"> 전체선택
			<span style="float:right;">
				<button type="button" class="btn btn-danger btn-sm" id="btnDel"><i class="bi bi-x-lg"></i> 삭제</button>
				<button type="button" class="btn btn-info btn-sm" onclick="location.href='index.jsp?main=smartBoard/smartform.jsp'"><i class="bi bi-pencil-fill"></i> 글쓰기</button>
			</span>		
			</td>
		</tr>
		
		<tr class="table-light">
			<th width="40"></th>
			<th width="60" style="text-align:center;">번호</th>
			<th width="320">제목</th>
			<th width="130">작성자</th>
			<th width="180">작성일</th>
			<th width="60" style="text-align:center;">조회</th>
		</tr>
		<%
			if(totalCount==0){%>
				<tr>
					<td colspan="4"	align="center">
						<h6><b>등록된 게시글이 없습니다.</b></h6>
					</td>
				</tr>	
			<%} else{
				for(smartDto dto:list){%>
					
					<tr>
						<td align="center">
							<input type="checkbox" class="allDel" value="<%=dto.getNum()%>">
						</td>
						<td align="center"><%=no-- %></td>
						<td><a class="detail" href="index.jsp?main=smartBoard/contentView.jsp?num=<%=dto.getNum()%>&currentPage=<%=currentPage%>"> <%=dto.getSubject()%> </a>
						<%
							// 댓글이 있을 경우에 개수 출력 & 댓글 위치로 랜딩
							if(dto.getAnswercount()>0){%>
								<a href="index.jsp?main=smartBoard/contentView.jsp?num=<%=dto.getNum()%>&currentPage=<%=currentPage%>#alist" style="color:red;">[<%=dto.getAnswercount()%>]</a>
							<%}
						%>
						</td>
						<td><%=dto.getWriter() %></td>
						<td><%=sdf.format(dto.getWriteday())%> </td>
						<td align="center"><%=dto.getReadcount() %></td>
					</tr>		
				<%}	%>
				
				
				
			<%}		
		%>	
	</table>		
	
	<!-- 페이지 번호 출력 -->
	<div style="width: 800px; margin-top:30px;">
		<ul class="pagination justify-content-center">
			<%
				// 이전
				if(startPage>1){%>
					<li class="page-item">
						<a class="page-link" href="index.jsp?main=smartBoard/boardList.jsp?currentPage=<%=startPage-1%>" style="color:black;">이전</a>
					</li>
				<%}
			
				for(int pp=startPage; pp<=endPage; pp++){
					if(pp==currentPage){%>
						<li class="page-item active">
							<a class="page-link" href="index.jsp?main=smartBoard/boardList.jsp?currentPage=<%=pp%>"><%=pp %></a>
						</li>
					<%} else{%>
						<li class="page-item">
							<a class="page-link" href="index.jsp?main=smartBoard/boardList.jsp?currentPage=<%=pp%>"><%=pp %></a>
						</li>
					<%}
				}
				
				// 다음
				if(endPage<totalPage){%>
					<li class="page-item">
						<a class="page-link" href="index.jsp?main=smartBoard/boardList.jsp?currentPage=<%=endPage+1%>" style="color:black">다음</a>
					</li>			
				<%}
			%>
		</ul>
	</div>
</div>
</body>
</html>
