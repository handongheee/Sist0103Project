<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt"	uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
   <link href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
   <script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
</head>
<body>	
	<fmt:requestEncoding value="utf-8"/>
	
	<form action="ex03_if_choose.jsp">
		<table class="table table-bordered" style="width=300px;">
			<tr>
				<th class="table-light">이름</th>
				<td>
					<input type="text" name="name" class="form-control" style="width:120px;">
				</td>
			</tr>
			
			<tr>
				<th class="table-light">나이</th>
				<td>
					<input type="text" name="age" class="form-control" style="width:120px;">
				</td>
			</tr>
			
			<tr>
				<th class="table-light">부서</th>
				<td>
					<input type="text" name="buseo" class="form-control" style="width:150px;">
				</td>
			</tr>
			
			<tr>
				<th class="table-light">급여</th>
				<td>
					<input type="text" name="pay" class="form-control" style="width:200px;">
				</td>
			</tr>
			
			<tr>
				<td colspan="2" align="center">
					<button type="submit" class="btn btn-danger">결과확인</button>
				</td>
			</tr>
		</table>
	</form>
	
	<!-- 이름을 입력했을 경우에만 출력 
		이름: ㅇㅇㅇ 님
		나이: ㅇㅇ세 (성인/미성년자_20세 이상은 성인, 나머지는 미성년자 출력)
		월급여: (화페단위, 천단위 구분기호로 출력)
		부서: (choose) 기획부, 경영관리부, 마케팅부 나머지는 '해당 부서는 저희 회사에 없는 부서입니다.' 출력
	-->
	<hr>
	<c:if test="${!empty param.name }">
		<div class="alert alert-info" style="width:400px;">
			이름: ${param.name } 님 <br>
			나이: ${param.age } 세(
				<c:if test="${param.age>=20 }">
					<span style="color:blue;">성인</span>
				</c:if>
				<c:if test="${param.age<20 }">
					<span style="color:green;">미성년</span>
				</c:if>
			) <br>
			
			월급여: <fmt:formatNumber value="${param.pay }" type="currency"/> <br>
			부서: ${param.buseo } <br>
			
			<c:choose>
				<c:when test="${param.buseo=='기획부' }">
					기획부는 3층에 있습니다.
				</c:when>
				<c:when test="${param.buseo=='경영관리부' }">
					경영관리부는 7층에 있습니다.
				</c:when>
				<c:when test="${param.buseo=='마케팅부' }">
					마케팅부는 12층에 있습니다.
				</c:when>
				<c:otherwise>
					${param.buseo }는 없는 부서입니다.
				</c:otherwise>
			</c:choose>
			
		</div>
	</c:if>
</body>
</html>