package com.bala.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bala.dao.BookDAO;
import com.bala.model.Book;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response){
	
}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String name=request.getParameter("name");
	String price=request.getParameter("price")	;
	Book book=new Book();
	book.setName(name);
	book.setPrice(Float.parseFloat(price));
	BookDAO dao=new BookDAO();
	dao.UpdatePrice(book);
	response.sendRedirect("ModifyByPrice.jsp");
	
	
	
	
	}

}
