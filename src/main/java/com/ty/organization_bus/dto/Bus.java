package com.ty.organization_bus.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bus {

	@Id
	private int id;
	private int capacity;
	private String type;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", capacity=" + capacity + ", type=" + type + "]";
	}

}
