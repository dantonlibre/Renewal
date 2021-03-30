package com.class09;

public class Phone1 {

	String number;
	String model;
	double weight;

	Phone1(String n, String m, double w) {
		number = n;
		model = m;
		weight = w;
		System.out.println(m);
	}

	Phone1(String n, String m) {
		number = n;
		model = m;
		System.out.println(m);
	}

	Phone1() {

	}

	void receiveCall(String name) {
		System.out.println("Calling" + name);
	}

	String getNumber() {
		return number;
	}

}
