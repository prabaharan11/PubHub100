<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Adding a Book</title>
</head>
<body>
<form action="SaveBookServlet" method="post">
<h1>Save A Book To Database</h1>
Book_Name<input type="text" name="name"><br><br>
Book_Price<input type="text" name="price"><br><br>
<button type="submit ">SAVE</button><br><br>
<a href="Save_book.jsp">CONTINUE</a><br><br>
<a href="success.jsp">Go Back</a>
</form>

</body>
</html>