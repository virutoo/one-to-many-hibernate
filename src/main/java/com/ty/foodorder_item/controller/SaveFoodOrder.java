package com.ty.foodorder_item.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.foodorder_item.dao.Dao;
import com.ty.foodorder_item.dto.FoodOrder;
import com.ty.foodorder_item.dto.Item;

public class SaveFoodOrder {
	
	public static void main(String[] args) {
		FoodOrder order = new FoodOrder();
		List<Item> items = new ArrayList<Item>();
		
		int id[] = {3,4};
		String name[] = {"pepper chicken","noodles"};
		int quantity[] = {1,2};
		double cost[] = {26,14};
		
		for(int i=0; i<id.length; i++) {
			Item item = new Item();
			item.setId(id[i]);
			item.setName(name[i]);
			item.setQuantity(quantity[i]);
			item.setCost(cost[i]);
			items.add(item);
		}
		
		order.setId(1);
		order.setCustomerName("goku");
		order.setItem(items);
		order.setPhone(1234);
		order.setAddress("genkai");
		
		Dao dao = new Dao();
		dao.saveFoodOrder(order);
		System.out.println("data saved");
	}

}
