package com.bala.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bala.model.User;
import com.bala.util.ConnectionUtil;


public class UserDAO {
	public void register(User user) throws ClassNotFoundException, SQLException{
		Connection connection=ConnectionUtil.getConnection();
		String sql=("insert into users(name,email,password)values (?,?,?)");
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setString(1, user.getName());
		pst.setString(2, user.getEmail());
		pst.setString(3, user.getPassword());
		pst.executeUpdate();
		
	}
public static Boolean login(User user) throws ClassNotFoundException, SQLException{
	Connection connection=ConnectionUtil.getConnection();
	String sql=("select email,password from users where email=? and password=?;");
	PreparedStatement pst=connection.prepareStatement(sql);
	pst.setString(1, user.getEmail());
	pst.setString(2, user.getPassword());
	ResultSet rs=pst.executeQuery();
boolean flag=false;
	if (rs.next())
	{
	flag=true;
		
	}return flag;

	
	
}
}
