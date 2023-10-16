package com.altonInterview.examples.inheritance;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.altonInterview.examples.inheritance.product.VehileBrandAndEngine;
import com.altonInterview.examples.inheritance.vehile.Ford;
import com.altonInterview.examples.inheritance.vehile.Suzki;

public class CarSpec extends VehileBrandAndEngine {

	// Inheritance
	// method @Override
	// encapsulation 
	
	public static void main(String[] args) {
		// create an object to store thiscar details
		Ford ford = new Ford();
		ford.makeSound("Ford sound");
		List<String> fordList = new ArrayList<>();
		for (int i = 0; i < ford.fordInfo().size(); i++) {
			fordList.add(ford.fordInfo().get(i).getBrand());
			fordList.add(ford.fordInfo().get(i).getEngine());
		}

		// convert the list to stream
		Stream<String> fordStream = fordList.stream();
		
	
		Suzki suzkicar = new Suzki();
		suzkicar.makeSound("Suziki sound");
		
		List<String> suzkiList = new ArrayList<String>();
		for (int i = 0; i < suzkicar.suzkiInfo().size(); i++) {
			suzkiList.add(suzkicar.suzkiInfo().get(i).getBrand().toString());
			suzkiList.add(suzkicar.suzkiInfo().get(i).getEngine().toString());
		}
	
		Stream<String> suzkiStream = suzkiList.stream();
		Stream<String> carSpecification = Stream.concat(fordStream, suzkiStream);
		
		carSpecification.forEach(i->{System.out.println(i+"");});
		
	
		
		
	}

}