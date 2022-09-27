package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.UserDAO;
import com.ty.dto.User;

public class TestUserDelete {

	public static void main(String[] args) {
		User user=new User();
		UserDAO dao=new UserDAO();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		boolean m=dao.deleteUser(id);
		System.out.println(m);

	}

}
