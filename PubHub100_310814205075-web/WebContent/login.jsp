<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="LoginServlet">
<h1>Login To Database</h1><br><br>
Email<input type="text" name="email"><br><br>
Password<input type="password" name="password"><br><br>

<button type="submit">LOGIN</button><br><br>

</form>
<a href="home.jsp">RETURN HOME</a>
</body>
</html>