<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
<link
	href="https://fonts.googleapis.com/css2?family=Dongle&family=Gamja+Flower&family=Gowun+Dodum&family=IBM+Plex+Sans+KR&family=Noto+Sans+KR:wght@100..900&display=swap"
	rel="stylesheet">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>infoWrite</title>
</head>
<body>
	<div style="margin: 50px 50px;">
		<h3>출력</h3>
		<table class="table table-bordered" style="width: 350px;">
			<tr>
				<th width="130px;">이름</th>
				<td>${infoDto.name }</td>
			</tr>

			<tr>
				<th width="130px;">좋아하는 색상</th>
				<td style="color: ${infoDto.color}">${infoDto.color }</td>
			</tr>

			<tr>
				<th width="130px;">취미</th>
				<td>
					<c:choose>
						<c:when test="${empty infoDto.hobby}">
                			없음
            			</c:when>
            			
						<c:otherwise>
							<c:forEach items="${infoDto.hobby}" var="hobby">
                  			  [${hobby}]
							</c:forEach>
						</c:otherwise>
					</c:choose>
				</td>
			</tr>

			<tr>
				<th width="130px;">가장 재미있는 언어</th>
				<td>${infoDto.lang }</td>
			</tr>

		</table>

	</div>
</body>
</html>