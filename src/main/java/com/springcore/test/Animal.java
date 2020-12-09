package com.springcore.test;

public class Animal {
	private String name;
	private String  breed;
	private Cat ob;
	private Dog ob2;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Cat getOb() {
		return ob;
	}
	public void setOb(Cat ob) {
		this.ob = ob;
	}
	public Dog getOb2() {
		return ob2;
	}
	public void setOb2(Dog ob2) {
		this.ob2 = ob2;
	}
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", breed=" + breed + ", ob=" + ob + ", ob2=" + ob2 + "]";
	}
	
	

	
}
