package com.bala.dao;

import java.sql.SQLException;

import com.bala.model.Book;

public class TestBookDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Book book=new Book();
	
		book.setName("java8");
		//book.setPrice(235);
		//book.setPrice(500);
		//book.setName("sura");
		//book.setId(2);
		BookDAO dao=new BookDAO();
		//dao.UpdatePrice(book);
		//dao.add(book);
		//dao.Delete(book);
		dao.ViewByName(book);
		
		//dao.ViewByName(book);
		System.out.println(book);

	}

}
