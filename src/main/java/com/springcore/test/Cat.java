package com.springcore.test;

public class Cat {
	private String barking;

	public String getBarking() {
		return barking;
	}

	public void setBarking(String barking) {
		this.barking = barking;
	}

	@Override
	public String toString() {
		return "Cat [barking=" + barking + "]";
	}

	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}


}
