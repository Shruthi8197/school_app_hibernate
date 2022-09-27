package com.ty.controller;

import com.ty.dao.UserDAO;
import com.ty.dto.User;

public class TestUserUpdate {

	public static void main(String[] args) {
		User user=new User();
		UserDAO dao=new UserDAO();
		user.setId(2);
		user.setName("RSY");
		user.setEmail("rsy@gmail");
		user.setPassword("rsy1234");
		user.setGender("Male");
		user.setPhone(5463536);
		
		User m=dao.updateUser(user);
		System.out.println(m);

	}

}
