package com.ty.dao;

import javax.naming.Reference;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.ReferenceBook;

public class ReferenceBookDAO {

	public ReferenceBook saveBook(ReferenceBook referenceBook) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(referenceBook);
		entityTransaction.commit();
		return referenceBook;
	}

	public ReferenceBook findBookById(int id) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		ReferenceBook book = entityManager.find(ReferenceBook.class, id);
		if (book != null)
			System.out.println("Book id:" + book.getId());
		System.out.println("Book name:" + book.getName());
		System.out.println("Book author:" + book.getAuthor());
		System.out.println("Subject is:" + book.getSubject());
		return book;
	}

	public boolean deleteBook(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		ReferenceBook referenceBook = entityManager.find(ReferenceBook.class, id);
		if (referenceBook != null)
			entityTransaction.begin();
		entityManager.remove(referenceBook);
		entityTransaction.commit();
		return true;

	}

	public ReferenceBook updateBook(ReferenceBook referenceBook) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.merge(referenceBook);
		entityTransaction.commit();
		return referenceBook;
	}
}
