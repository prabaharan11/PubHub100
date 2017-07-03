package com.bala.model;

public class TestUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user=new User();
		user.setId(1);
		user.getId();
		user.setName("praba");
        user.setEmail("praba@gmail.com");
        user.setPassword("12345");
        System.out.println(user);
	}

}
