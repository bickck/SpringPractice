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
           ���̵� :   <input type="text" name="id"><br>
           ��й�ȣ :      <input type="password" name="passwd"><br>
           <!-- 
           �ּ� :          <input type="text" name="address"><br>
           ���� :     ����<input type="radio" name="gender" value="male">
                     ����<input type="radio" name="gender" value="female"><br>
           �ݷ����� :  ������<input type="checkbox" name="checkDog" value="d">
 
                           �����<input type="checkbox" name="checkCat" value="c">
 
                           ��Ÿ  <input type="checkbox" name="checkEtc" value="e"><br>
                           
                          
         ���԰�� :  <select name="source">
                          <option value="recommand">ģ����õ</option>
                          <option value="search">���ͳݰ˻�</option>
                          <option value="facebook">���̽���</option>
                          <option value="advertise">����</option>
                     </select><br>
          ��Ÿ���� : <textarea name="etc" rows="3" cols="30"></textarea><br><br>-  -->
           <input type="submit" value="����!"> <input type="reset" value="���">
     </form>

</body>
</html>