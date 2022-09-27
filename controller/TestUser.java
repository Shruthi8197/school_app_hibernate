package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.UserDAO;
import com.ty.dto.User;

public class TestUser {

	public static void main(String[] args) {
		User user =new User();
		UserDAO dao=new UserDAO();
		user.setName("Dimple");
		user.setEmail("dimple@gmail");
		user.setPassword("dimple123");
		user.setPhone(56747457);
		user.setGender("female");
		
		User m=dao.saveUser(user);
		System.out.println(m);
		
		
		
	}

}
