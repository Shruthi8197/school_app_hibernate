package com.ty.controller;

import com.ty.dao.StudentDAO;
import com.ty.dto.Student;

public class TestStudent {
	public static void main(String[] args) {
		Student student=new Student();
		StudentDAO dao=new StudentDAO();
		
		student.setRol(3);
		student.setName("Dhanvi");
		student.setPercentage(94.5);
		
		Student m=dao.saveStudent(student);
		System.out.println(m);
	}

}
