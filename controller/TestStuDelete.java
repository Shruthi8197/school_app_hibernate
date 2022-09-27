package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.StudentDAO;
import com.ty.dto.Student;

public class TestStuDelete {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student student=new Student();
		StudentDAO dao=new StudentDAO();
		
		System.out.println("Enter the id");
		int id =sc.nextInt();
		
		boolean m=dao.deleteStudent(id);
		System.out.println(m);
		
	}

}
