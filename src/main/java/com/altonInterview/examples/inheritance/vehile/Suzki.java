package com.altonInterview.examples.inheritance.vehile;

import java.util.ArrayList;
import java.util.List;

import com.altonInterview.examples.inheritance.product.VehileBrandAndEngine;

public class Suzki extends VehileBrandAndEngine {

	public List<Suzki> suzkiInfo() {
		Suzki suzki = new Suzki();
		suzki.setBrand("Suzki");
		suzki.setEngine("6 Lane");
		

		List<Suzki> suzkiList = new ArrayList<Suzki>();
		suzkiList.add(suzki);
		
		return suzkiList;
	}
	
	@Override
	public void makeSound(String sound) {		
		super.makeSound(sound);
	}

}
