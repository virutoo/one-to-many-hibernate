package com.ty.mobile_sim.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Sim {
	
	@Id
	private int id;
	private String provider;
	private String imrc;

	@Override
	public String toString() {
		return "Sim [id=" + id + ", provider=" + provider + ", imrc=" + imrc + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getImrc() {
		return imrc;
	}

	public void setImrc(String imrc) {
		this.imrc = imrc;
	}

}
