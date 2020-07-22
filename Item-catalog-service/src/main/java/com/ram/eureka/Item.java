package com.ram.eureka;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
class Item {

	public Item(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
