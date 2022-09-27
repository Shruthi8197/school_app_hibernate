package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.ReferenceBookDAO;
import com.ty.dto.ReferenceBook;

public class TestBookUpdate {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	ReferenceBook referenceBook=new ReferenceBook();
	ReferenceBookDAO dao=new ReferenceBookDAO();
	
	referenceBook.setId(1);
	referenceBook.setName("Mathematical-1");
	referenceBook.setAuthor("RSA");
	referenceBook.setSubject("Maths");
	
	ReferenceBook m2=dao.updateBook(referenceBook);
	System.out.println(m2);
}
}
