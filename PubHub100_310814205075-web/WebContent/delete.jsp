<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete book</title>
</head>
<body>
<form action="DeleteServlet" method="post">
<h1>Remove A Book From Database</h1>
Book_Name<input type="text"name="name"><br><br>
<button type="submit">REMOVE</button><br><br>
</form>
<a href="delete.jsp">CONTINUE</a><br><br>
<a href="success.jsp">GO BACK</a>
</body>
</html>