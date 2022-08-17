package com.ty.omnitrix_aliens.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Omnitrix {

	@Id
	private String user;
	private int age;
	@OneToMany
	List<Alien> aliens = new ArrayList<Alien>();

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<Alien> getAliens() {
		return aliens;
	}

	public void setAliens(List<Alien> aliens) {
		this.aliens = aliens;
	}

	@Override
	public String toString() {
		return "Omnitrix [user=" + user + ", age=" + age + ", aliens=" + aliens + "]";
	}

}
