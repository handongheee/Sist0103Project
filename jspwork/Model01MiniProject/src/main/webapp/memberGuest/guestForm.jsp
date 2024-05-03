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
<script type="text/javascript">
	$(function(){
		$("i.camera").click(function(){
			// trigger 강제 이벤트 발생 - 클릭 시
			$("#photo").trigger("click");	
		});
		
		
		
	});
	
	// ** 이미지 미리보기 **
	function readURL(input) {
	    if (input.files && input.files[0]) {
	        var reader = new FileReader(); //파일을 읽기 위한 FileReader객체 생성
	        reader.onload = function (e) {
	        //파일 읽어들이기를 성공했을때 호출되는 이벤트 핸들러
	            $('#preshow').attr('src', e.target.result);
	            //이미지 Tag의 SRC속성에 읽어들인 File내용을 지정
	            //(아래 코드에서 읽어들인 dataURL형식)
	        }                   
	        reader.readAsDataURL(input.files[0]);
	        //File내용을 읽어 dataURL형식의 문자열로 저장
	    }
	}
</script>
</head>
<body>
<div style="margin:50px 100px; width:600px;">
	<form action="memberGuest/guestAction.jsp" method="post" enctype="multipart/form-data">
		<table class="table table-bodered">
			<caption align="top">
				<b>방명록 등록</b>
				<i class="bi bi-camera-fill fs-2 camera"></i>
				<input type="file" name="photo" id="photo" style="visibility: hidden;" onchange="readURL(this)">
			</caption>
			
			<tr>
				<td>
					<textarea style="width:500px; height:100px;" name="content" class="form-control" required="required"></textarea>
				</td>
				
				<td>
					<button type="submit" class="btn btn-success" style="width:100px; height:100px;">등록</button>
					
					<!-- 이미지 미리보기 -->
					<img alt="" src="" id="preshow" style="position: absolute; left:800px; top:100px; max-width:200px;">
				</td>
				
			</tr>
		</table>
	
	</form>
</div>
	
</body>
</html>
