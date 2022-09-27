package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.UserDAO;
import com.ty.dto.User;

public class TestUserFind {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		User user =new User();
		UserDAO dao=new UserDAO();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		User m1=dao.findUserByInt(id);

	}

}
