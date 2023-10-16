package com.altonInterview.examples.inheritance.vehile;

import java.util.ArrayList;
import java.util.List;

import com.altonInterview.examples.inheritance.product.VehileBrandAndEngine;


public class Ford extends VehileBrandAndEngine {
	public List<Ford> fordInfo() {
		Ford ford = new Ford();
		ford.setBrand("Ford");
		ford.setEngine("V6 ");

		List<Ford> fordList = new ArrayList<Ford>();
		fordList.add(ford);
		
		return fordList;
	}

}
