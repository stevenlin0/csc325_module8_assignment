package com.mycompany.csc325_oop_designreview_lab;

public abstract class Human {
	private String name;
	private String address;
	private short age;

	// This is the constructor that takes name and age
	public Human(String name, short age) {
		this.name = name;
		this.age = age;
	}

	// This is the getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract String getAddress();
	public abstract void setAddress(String address);

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}
}
