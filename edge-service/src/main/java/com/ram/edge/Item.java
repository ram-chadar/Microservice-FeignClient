package com.ram.edge;

public class Item {
    private String name;

    public Item() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Item(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + "]";
	}
    
    
}
