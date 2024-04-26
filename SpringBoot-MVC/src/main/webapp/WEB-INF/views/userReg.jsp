<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration</title>
</head>
<body>
	<form:form method="POST" action="db/register">
		User Name: <input type="text" name="name"><br>
		User Email: <input type="text" name="email"><br>
		Password: <input type="password" name="pass"><br>
		Contact: <input type="text" name="contact"><br>
		
		<input type="submit" value="Register">
	
	</form:form>
</body>
</html>