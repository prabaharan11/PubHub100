package com.bala.dao;

import java.sql.SQLException;

import com.bala.model.User;

public class TestUserDAO {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		User user=new User();
		user.setName("kishor");
		user.setEmail("kishor@gmail.com");
		user.setPassword("12344");
		UserDAO dao=new UserDAO();
		
		System.out.println(dao.login(user)+"user");
		

	}

}
