<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>회원가입 페이지</h1>

	<form action="/join" method="POST">
		<input type="text" name="username" palceholder="Username"> <input
			type="password" name="password" palceholder="Password"> <input
			type="email" name="email" palceholder="Email">
		<button>회원 가입</button>
	</form>
</body>
</html>