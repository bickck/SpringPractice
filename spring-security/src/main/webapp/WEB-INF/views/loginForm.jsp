<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action ="/login" method ="POST">
		<input type="text" name="username" palceholder="Username"> <input
			type="password" name="password" palceholder="Password"> 
		<button>로그인</button>
	</form>
	<a href="/joinForm"> 회원가입을 아직 하지 않으셨나요?</a>
</body>
</html>