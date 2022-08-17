package com.ty.organization_bus.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.organization_bus.dto.Bus;
import com.ty.organization_bus.dto.Organization;

public class Dao {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();
	
	public void saveOrganaization(Organization org) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(org);
		for(Bus bus : org.getBus()) {
			entityManager.persist(bus);
		}
		transaction.commit();
	}
	
	public Organization getOrganizationDetails(int id) {
		return entityManager.find(Organization.class, id);
	}

}
