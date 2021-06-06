<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	학생로그인 화면 <br>
	<br>
	<form action="logins.do" method="post">	
	I	D : <input type="text" name="id" /><br>
	Password : <input type="password" name="pwd" /><br>
	<br>
	 <input type="radio" name="radio" value="Pradio">Professor
     <input type="radio" name="radio" value="Sradio" checked>Student
	<br>
	<input type="submit" value="LOGINS" />
	</form>
</body>
</html>