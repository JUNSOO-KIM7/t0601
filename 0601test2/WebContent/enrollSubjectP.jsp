<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	교수 : 과목등록 !! <br>
	<br>
	Subject 
	<form action="enrollSubjectP.do" method="post">	
	I	D : <input type="text" name="subNo" /> 과목번호 <br>
	TITLE : <input type="text" name="subName" />강의명<br>
	# of Student : <input type="text" name="subMax" />학생수<br>
	
	<br>
	<input type="submit" value="ENROLL" />

</body>
</html>