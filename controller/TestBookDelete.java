package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.ReferenceBookDAO;
import com.ty.dto.ReferenceBook;

public class TestBookDelete {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ReferenceBook referenceBook=new ReferenceBook();
	ReferenceBookDAO dao=new ReferenceBookDAO();
	System.out.println("Enter the id");
	int id=sc.nextInt();
	Boolean m1=dao.deleteBook(id);
	System.out.println(m1);
}
}
