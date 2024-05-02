<%@page import="data.dto.answerGuestDto"%>
<%@page import="data.dao.answerGuestDao"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="data.dao.memberDao"%>
<%@page import="data.dto.guestDto"%>
<%@page import="java.util.List"%>
<%@page import="data.dao.guestDao"%>
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
   <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
<style type="text/css">
	i.mod, i.del{
		cursor: pointer;
	}
</style>

<script type="text/javascript">
	$(function(){
		// 추천 버튼 클릭 시
		$("span.likes").click(function(){
			var num=$(this).attr("num");
			//alert(num);
			var tag=$(this);
			
			$.ajax({
				type:"get",
				dataType:"json",
				data:{"num":num},
				url:"memberGuest/updateIncreChu.jsp",
				success:function(data){
					//alert(data.chu);
					// this에 다음(span)에 data.chu
					tag.next().text(data.chu);
					
					//하트에 animate
					 tag.next().next().animate({"font-size":"15px"},500,function(){
						  //애니메이션 끝난 후
						  $(this).css("font-size","0px");
					 })
				}	
			});
		});
		
		// 삭제 버튼 클릭 시
		$("i.del").click(function(){
			var num=$(this).attr("num");
			var currentPage=$(this).attr("currentPage");
			//alert(num+", "+currentPage);
			
			var yes=confirm("정말 삭제하시겠습니까?");
			if(yes){
				location.href='memberGuest/delete.jsp?num='+num+'&currentPage='+currentPage;
			}
		});
		
		// 댓글부분은 무조건 처음에는 안보이게 처리
		$("div.answer").hide();
		
		// 댓글 클릭 시 댓글 부분 출력(toggle)
		$("span.answer").click(function(){
			//$("div.answer").toggle(); 방법01
			$(this).parent().find("div.answer").toggle(); // 방법02
		});
		
		// 댓글 삭제
		$("i.adel").click(function(){
			
			var ans=confirm("삭제하려면 [확인]을 눌러주세요.");
			
			if(ans){
				var idx=$(this).attr("idx");
				// alert(idx);

				$.ajax({
					type:"get",
					dataType:"html",
					url:"memberGuest/deleteAnswer.jsp",
					data:{"idx":idx},
					success:function(){
						location.reload(); // 새로고침
					}
				});
			}
		});
		
		// 댓글 수정 - 수정 아이콘 누르면 모달창 출력
		$("i.aedit").click(function(){
			var idx=$(this).attr("idx");
			//alert(idx);
			
			$("#idx").val(idx);
			
			$.ajax({
				type:"get",
				dataType:"json",
				url:"memberGuest/answerContent.jsp",
				data:{"idx":idx},
				success:function(res){
					$("#idx").val(res.idx);
					$("#ucontent").val(res.story);
				}
			});
		});
		
		// 댓글 수정 - 모달창 내 btnUpdate 클릭 시
		$("#btnUpdate").click(function(){
			//alert("클릭");
			var idx=$("#idx").val();
			var content=$("#ucontent").val();
			//alert(idx+", "+content);
	
			$.ajax({
				type:"post",
				dataType:"html",
				url:"memberGuest/updateAnswer.jsp",
				data:{"idx":idx, "content":content};
				success:function(){
					location.reload();
				}
				
			});	
		});
		
		
	});
</script>
</head>
<%
	guestDao dao=new guestDao();

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
	List<guestDto> list=dao.getList(start, perpage);
	// --------------------------------------------------------------------------
%>
<body>
<%
	// 로그인상태 확인
	String loginok=(String)session.getAttribute("loginok");
	
	// 아이디로 이름 가져오기 (세션)
	String myid=(String)session.getAttribute("myid");
	memberDao mdao=new memberDao();
	//String name=mdao.getName(myid);
	
	// 마지막 페이지 방명록이 삭제될 경우 삭제 후 그 이전페이지로 랜딩
	if(list.size()==0 && currentPage!=1){%>
		<script type="text/javascript">
			location.href="index.jsp?main=memberGuest/guestList.jsp?currentPage=<%=currentPage-1%>";
		</script>
	<%}
	
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");

	// 로그인 중 일때만 폼 출력
	if(loginok!=null){%>
		<jsp:include page="guestForm.jsp"/>
		<hr width="700" align="Left" style="margin-left: 100px;">
	<%}
%>
<div style="margin: 50px 100px;">
	<b>방명록 리스트</b> <br>
	<caption>총 <%=totalCount %>개의 게시글이 있습니다</caption>
	<table class="table table-bordered" style="width:700px;">
		<%
			if(totalCount==0){%>
				<tr>
					<td colspan="5" align="center">
						<h6><b>등록된 게시글이 없습니다</b></h6>
					</td>
				</tr>
		<%} else{
			int num=1;
			for(guestDto dto:list){
				// 이름 얻어오기
				String id=dto.getMyid();
				String name=mdao.getName(id);			
			%>
				<tr>
					
					<td style="margin-left:10px;">
						<%
							// 로그인한 아이디와 글쓴 아이디가 같은 경우에만 수정/삭제 버튼이 보이게한다
							if(loginok!=null && dto.getMyid().equals(myid)){%>
								<div style="float:right;">
									<!-- 단순 처리는 경로추가 안해도 됨. -->
									<i class="bi bi-x-square del" num=<%=dto.getNum() %> currentPage=<%=currentPage %> style="color:red;"></i>
									<i class="bi bi-pencil-square mod" onclick="location.href='index.jsp?main=memberGuest/updateForm.jsp?num=<%=dto.getNum() %>&currentPage=<%=currentPage %>'" style="color:green;"></i>
								</div> <br>
							<%}
						%>	
						
						<%=num++ %> &nbsp;&nbsp;&nbsp;
						<i class="bi bi-person-circle"></i>
						<%=name %> (<%=dto.getMyid() %>)
						<div style="color:#aaa; float:right;">
							<%=sdf.format(dto.getWriteday()) %>
						</div> 
						<br><Br>
						<div style="margin-left: 30px;">
							<%=dto.getContent().replace("\n", "<br>") %>
						</div>
						
						<div style="margin-left: 30px;">
						<%
							// 이미지가 null이 아닌 경우 출력
							if(dto.getPhotoname()==null){
				
							} else{
								%>
									<img src="save/<%=dto.getPhotoname()%>" style="width:120px;">
								<%	
							}					
						%>
						</div>
					</td>
				</tr>
				
				<!-- 댓글 & 추천  -->
				<tr>
					<td>
					
					<%
						// 각 방명록에 달린 댓글 목록 가져오기
						answerGuestDao adao=new answerGuestDao();
						List<answerGuestDto> alist=adao.getAllAnswers(dto.getNum());
					
					%>
					
					
						<span class="answer" style="cursor:pointer;">댓글 <%=alist.size() %></span>
						<span class="likes" style="margin-left: 20px; cursor:pointer;" num=<%=dto.getNum()%>><i class="bi bi-heart"></i></span>
						<span class="chu"><%=dto.getChu() %></span>
						<i class="bi bi-heart-fill" style="font-size: 0px; color: red;"></i>
						
						<div class="answer">
							<%
								// 댓글 작성
								if(loginok!=null){%>
									<div class="answerForm">
										<form action="memberGuest/answerInsert.jsp" method="post">
											<input type="hidden" name="num" value="<%=dto.getNum()%>">
											<input type="hidden" name="myid" value="<%=myid%>">
											<input type="hidden" name="currentPage" value="<%=currentPage%>">
											
											<table>
												<tr>
													<td width="500">
														<textarea style="width:480px; height:70px;" name="content" required="required" class="form-control"></textarea>
													</td>
													
													<td>
														<button type="submit" class="btn btn-info" style="width:70px; height:70px;">등록</button>
													</td>
												</tr>
											</table>
											
										</form>
									</div>
								<%}
							
							%>
							
							<div class="answerList">
								
								
								<table style="width: 500px;" >
			    	               <%
			    	               	// 댓글 출력
			    	                 for(answerGuestDto adto:alist)
			    	                 {%>
			    	                	 <tr>
			    	                	   <td>
			    	                	     <i class="bi bi-person-circle fs-2" style="color: gray;"></i>
			    	                	   </td>
			    	                	   <td>
			    	                	   
			    	                	   
			    	                	      <%
			    	                	        //작성자명
			    	                	        String aname=mdao.getName(adto.getMyid());
			    	                	      %>
			    	                	      <br>
			    	                	      <b><%=aname %></b>
			    	                	      &nbsp;
			    	                	      
			    	                	      <%
			    	                	        //글작성자와 댓글작성자가 같을경우
			    	                	        if(dto.getMyid().equals(adto.getMyid())){%>
			    	                	        	
			    	                	        	<span style="color: red;">작성자</span>
			    	                	        <%}
			    	                	      %>
			    	                	      
			    	                	      <span style="font-size: 9pt; color: gray; margin-left: 20px;">
			    	                	         <%=sdf.format(adto.getWriteday()) %>
			    	                	      </span>
			    	                	      
			    	                	      
			    	                	      <!-- 댓글 수정삭제는 본인만 보이게 -->
			    	                	      <%
			    	                	        if(loginok!=null && adto.getMyid().equals(myid)){%>
			    	                	        	<!-- 수정할 부분 -->
			    	                	        	<i class="aedit bi bi-pencil-square" idx="<%=adto.getIdx()%>"  data-bs-toggle="modal" data-bs-target="#myModal"></i>
    	                	      					<i class="bi bi-trash adel" idx="<%=adto.getIdx()%>"></i>
			    	                	        <%}
			    	                	      %>
			    	                	      
			    	                	      <br>
			    	                	      <span style="font-family: 10pt;"><%=adto.getContent().replace("\n", "<br>") %></span>
			    	                	      
			    	                	   </td>
			    	                	 </tr>
			    	                 <%}
			    	               %>
    	            			 </table>
								
								
							</div>
						</div>
					</td>
				</tr>
				
				
			<%}
			
		}
	
		%>
	</table>
	
	<!-- 페이지 번호 출력 -->
	<div style="width: 700px; text-align: center;">
		<ul class="pagination justify-content-center">
			<%
				// 이전
				if(startPage>1){%>
					<li class="page-item">
						<a class="page-link" href="index.jsp?main=memberGuest/guestList.jsp?currentPage=<%=startPage-1%>" style="color:black;">이전</a>
					</li>
				<%}
			
				for(int pp=startPage; pp<=endPage; pp++){
					if(pp==currentPage){%>
						<li class="page-item active">
							<a class="page-link" href="index.jsp?main=memberGuest/guestList.jsp?currentPage=<%=pp%>"><%=pp %></a>
						</li>
					<%} else{%>
						<li class="page-item">
							<a class="page-link" href="index.jsp?main=memberGuest/guestList.jsp?currentPage=<%=pp%>"><%=pp %></a>
						</li>
					<%}
				}
				
				// 다음
				if(endPage<totalPage){%>
					<li class="page-item">
						<a class="page-link" href="index.jsp?main=memberGuest/guestList.jsp?currentPage=<%=endPage+1%>" style="color:black">다음</a>
					</li>			
				<%}
			%>
		</ul>
	</div>
</div>



<!-- The Modal -->
<div class="modal fade" id="myModal">
  <div class="modal-dialog">
    <div class="modal-content">

      <!-- Modal Header -->
      <div class="modal-header">
        <h4 class="modal-title">댓글 수정</h4>
        <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      </div>

      <!-- Modal body -->
      <div class="modal-body">
        <div class="updateForm d-inline-flex">
        	<input type="hidden" id="idx">
        	<input type="text" id="ucontent" class="form-control" style="width:200px;">
        	<button type="button" class="btn btn-info" id="btnUpdate" style="margin-left:10px;">댓글 수정</button>
        </div>
      </div>

      <!-- Modal footer -->
      <div class="modal-footer">
        <button type="button" class="btn btn-danger" data-bs-dismiss="modal">Close</button>
      </div>

    </div>
  </div>
</div>




</body>
</html>
