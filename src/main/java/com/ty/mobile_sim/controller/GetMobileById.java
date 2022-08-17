package com.ty.mobile_sim.controller;

import com.ty.mobile_sim.dao.Dao;
import com.ty.mobile_sim.dto.Mobile;

public class GetMobileById {
	
	public static void main(String[] args) {
		int id = 1;
		Mobile mobile = new Dao().getMobileById(id);
		System.out.println(mobile.getCost());
		System.out.println(mobile.getId());
		System.out.println(mobile.getName());
	}

}
