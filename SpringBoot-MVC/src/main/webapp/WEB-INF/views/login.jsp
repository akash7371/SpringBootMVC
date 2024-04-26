<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
</head>
<body>
	<form:form action="dblogin" method="POST">
	Email: <input type="text" name="email"><br>
	Password: <input type="password" name="pass"><br>
	<input type="submit" value="Login">
	
	</form:form>
</body>
</html>