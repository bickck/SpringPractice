<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<H1> Register.jsp </H1>
	 <form action="/login" method="post">
           아이디 :   <input type="text" name="id"><br>
           비밀번호 :      <input type="password" name="passwd"><br>
           <!-- 
           주소 :          <input type="text" name="address"><br>
           성별 :     남자<input type="radio" name="gender" value="male">
                     여자<input type="radio" name="gender" value="female"><br>
           반려동물 :  강아지<input type="checkbox" name="checkDog" value="d">
 
                           고양이<input type="checkbox" name="checkCat" value="c">
 
                           기타  <input type="checkbox" name="checkEtc" value="e"><br>
                           
                          
         가입경로 :  <select name="source">
                          <option value="recommand">친구추천</option>
                          <option value="search">인터넷검색</option>
                          <option value="facebook">페이스북</option>
                          <option value="advertise">광고</option>
                     </select><br>
          기타사항 : <textarea name="etc" rows="3" cols="30"></textarea><br><br>-  -->
           <input type="submit" value="전송!"> <input type="reset" value="취소">
     </form>

</body>
</html>