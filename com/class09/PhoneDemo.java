package com.class09;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone1 phone = new Phone1("59696955", "Apple", 5.10);
		Phone1 phone1 = new Phone1("596066060", "Samsung");
		Phone1 phone2 = new Phone1();

		phone.number = "59696955";
		phone.model = "Apple";
		phone.weight = 5.10;

		phone.number = "596066060";
		phone.model = "Samsung";

		System.out.println(phone.getNumber());
		System.out.println(phone.model);
		System.out.println(phone.weight);
		System.out.println();

		System.out.println(phone1.getNumber());
		System.out.println(phone1.model);
		System.out.println(phone1.weight);
		System.out.println();

		System.out.println(phone2.getNumber());
		System.out.println(phone2.model);
		System.out.println(phone2.weight);
		System.out.println();

		phone.receiveCall("Mother");
		phone1.receiveCall("Dima");

	}

}
