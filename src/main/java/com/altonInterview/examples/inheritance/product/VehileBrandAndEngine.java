package com.altonInterview.examples.inheritance.product;

public class VehileBrandAndEngine {
	private String brand = "Brand Nameyet to be given"; // Vehicle attribute
	private String engine = "On Progress";
	
	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void makeSound(String sound) {		
		System.out.println(sound);
	}
}