package com.ty.controller;

import com.ty.dao.ReferenceBookDAO;
import com.ty.dto.ReferenceBook;

public class TestBook {
	public static void main(String[] args) {
		ReferenceBook referenceBook=new ReferenceBook();
		ReferenceBookDAO dao=new ReferenceBookDAO();
		
		referenceBook.setId(12);
		referenceBook.setName("Java");
		referenceBook.setAuthor("Agarwal");
		referenceBook.setSubject("Programming");
		
		ReferenceBook rf=dao.saveBook(referenceBook);
		System.out.println(rf);
	}

	
	
	
	}
