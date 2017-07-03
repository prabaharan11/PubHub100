package com.bala.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bala.model.Book;
import com.bala.util.ConnectionUtil;

public class BookDAO {
	public  void add(Book book) {
		Connection connection;
		PreparedStatement pst=null;
		connection=null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql=("insert into books (name,price) values(?,?)");
			pst=connection.prepareStatement(sql);
			pst.setString(1, book.getName());
			pst.setFloat(2, book.getPrice());
			pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				pst.close();
				connection.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		
	}
	public void UpdatePrice(Book book) {
		Connection connection;
		PreparedStatement pst=null;
		connection=null;
		try {
			connection = ConnectionUtil.getConnection();
			
		
			String sql=("update books set price=? where name=?");
			pst=connection.prepareStatement(sql);
			pst.setFloat(1, book.getPrice());
			pst.setString(2, book.getName());
			pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
	}
	public void Delete(Book book) {
		Connection connection;
		connection=null;
		PreparedStatement pst=null;
		try {
			connection = ConnectionUtil.getConnection();
			String sql=("delete from books where name=?");
		 pst=connection.prepareStatement(sql);
			pst.setString(1, book.getName());
			pst.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			try {
				pst.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		
	}
		
public List<Book> ViewAll() {
	Connection connection;
	connection=null;
	PreparedStatement pst=null;
	try {
		connection = ConnectionUtil.getConnection();
		String sql=("select id,name,price from books ");
		 pst=connection.prepareStatement(sql);
		
		ResultSet rs=pst.executeQuery();
		List <Book>books=new ArrayList<>();
		while(rs.next()){
			Book book=new Book();
			book.setId(rs.getInt(1));
			book.setName(rs.getString(2));
			book.setPrice(rs.getFloat(3));
			books.add(book);
		}return books;
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	finally
	{
		try {
			pst.close();
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	return null;
	
	
}
public List<Book> ViewByName(Book book) throws ClassNotFoundException, SQLException{
	Connection connection=ConnectionUtil.getConnection();
	String sql=("select id,name,price from users where name=?");
	PreparedStatement pst=connection.prepareStatement(sql);

	pst.setString(1, book.getName());
	ResultSet rs=pst.executeQuery();
	
	List<Book> books=new ArrayList<>();

	

	while(rs.next()){
		Book book1 = new Book();
		book1.setId(rs.getInt(1));
		book1.setName(rs.getString(2));
		book1.setPrice(rs.getFloat(3));
		books.add(book);
		
		
	}return books;
	

	
	
}
	

}
