<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  home.jsp
</h1>

<P>  The time on the server is ${serverTime}. </P>
 <form action="/login.do" method="get">
 	<input type="submit" value="login"> 
 </form>
 
 <form action="/test.do" method="get">
 	<input type="submit" value="test"> 
 </form>
 
 <form action="/getInfo.do" method="get">
 	<input type="submit" value="getInfo"> 
 </form>
 
 <form action="/register.do" method="get">
 	<input type="submit" value="Register"> 
 </form>

 
 
</body>
</html>
