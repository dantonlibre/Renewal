package com.class12;

public class Country {
	String name;

	Country(String name) {
		this.name = name;
	}
}

class Italy extends Country {

	String food;

	Italy(String food, String name) {
		super(name);
		this.food = food;
	}

	public String getName() {
		return name;
	}
	
	public String getFood() {
		return food;
	}
	
}
