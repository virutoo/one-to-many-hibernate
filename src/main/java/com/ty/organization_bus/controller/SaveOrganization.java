package com.ty.organization_bus.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.organization_bus.dao.*;
import com.ty.organization_bus.dto.Bus;
import com.ty.organization_bus.dto.Organization;

public class SaveOrganization {
	
	public static void main(String[] args) {
		Organization org = new Organization();
		List<Bus> buses = new ArrayList<Bus>();
		int[] id = {1,2,3};
		int[] capacity = {34,23,42};
		String[] type = {"ac","volvo","normal"};
		
		for(int i=0; i<3; i++) {
			Bus bus = new Bus();
			bus.setId(id[i]);
			bus.setCapacity(capacity[i]);
			bus.setType(type[i]);
			buses.add(bus);
		}
		
		org.setBus(buses);
		org.setId(1);
		org.setName("sundara travels");
		org.setAddress("banglore");
		
		Dao dao = new Dao();
		dao.saveOrganaization(org);
		System.out.println("data saved");
		
	}

}
