<%@page import="com.bala.model.Book"%>
<%@page import="java.util.List"%>


<%@page import="com.bala.dao.BookDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>View All</title>
</head>
<body>
<table border="3">
<tr>
<th>Book Id</th>
<th>Book Name</th>
<th>Book Price</th>
</tr>
<% BookDAO dao=new BookDAO();
List<Book> list=dao.ViewAll();
for(Book book:list)
{
	%>
	<tr>
	<td><%=book.getId() %></td>
	<td><%=book.getName() %></td>
	<td><%=book.getPrice() %></td>
	</tr>
	<%
}
	%>


</table>
</body>
</html>