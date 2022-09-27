package com.ty.controller;

import com.ty.dao.StudentDAO;
import com.ty.dto.Student;

public class TestStuUpdate {
	public static void main(String[] args) {
		Student student=new Student();
		StudentDAO dao=new StudentDAO();
		
		student.setRol(2);
		student.setName("Dharni H");
		student.setPercentage(99);
		
		Student student2=dao.updateStudent(student);
		System.out.println(student2);
	
	}

}
