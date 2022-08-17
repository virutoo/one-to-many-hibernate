package com.ty.foodorder_item.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.foodorder_item.dto.FoodOrder;
import com.ty.foodorder_item.dto.Item;

public class Dao {
	
	static EntityManagerFactory factory = Persistence.createEntityManagerFactory("vikas");
	static EntityManager entityManager = factory.createEntityManager();
	
	public void saveFoodOrder(FoodOrder order) {
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		if(entityManager.find(FoodOrder.class, order.getId()) == null) {
			entityManager.persist(order);
		}
		
		for(Item item : order.getItem()) {
			entityManager.persist(item);
		}
		transaction.commit();
	}

}
