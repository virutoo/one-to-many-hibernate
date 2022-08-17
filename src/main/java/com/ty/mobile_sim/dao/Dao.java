package com.ty.mobile_sim.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.mobile_sim.dto.Mobile;
import com.ty.mobile_sim.dto.Sim;

public class Dao {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();
	
	public void saveMobile(Mobile mobile) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(mobile);
		for(Sim sim : mobile.getSims()) {
			entityManager.persist(sim);
		}
		transaction.commit();
	}
	
	public Mobile getMobileById(int id) {
		return entityManager.find(Mobile.class, id);
	}

}
