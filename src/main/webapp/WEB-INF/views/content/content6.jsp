<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	textarea {
		width:99.8%;
		
	}
	form{
		display : inline;
	}
	button {
		float : right;
		height : 40px;
		margin : 5px;
	}
	#btn {
		display : flex;
		justify-content: flex-end;
	}  
</style>
</head>
<body>
	<h4>제목 : ${vo.title }</h4>
	<hr />
	<textarea name="" id="" cols="100" rows="15" >${vo.content}</textarea>
	<form action="${pageContext.request.contextPath }/back6" method="post">
		<button>뒤로가기</button>
	</form>
</body>
</html>