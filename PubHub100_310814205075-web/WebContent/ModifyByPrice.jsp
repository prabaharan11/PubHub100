<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modify price</title>
</head>
<body>
<form action="EditServlet" method="post">
<h1>Modify Book Price</h1>
Book_Name<input type="text"name="name"><br><br>
New_Price<input type="text"name="price"><br><br>
<button type="submit">EDIT</button><br><br><br>
<a href="ModifyByPrice.jsp">CONTINUE</a><br><br>
<a href="success.jsp">GO BACK</a>

</form>

</body>
</html>