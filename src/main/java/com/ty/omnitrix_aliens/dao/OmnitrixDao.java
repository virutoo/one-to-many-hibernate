package com.ty.omnitrix_aliens.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class OmnitrixDao {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();
	
	public saveOmnitrix() {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(
	}

}
