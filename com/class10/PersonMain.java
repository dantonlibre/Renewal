package com.class10;

public class PersonMain {

	public static void main(String[] args) {
		
		Person maks = new Person();
		Person dima = new Person("Dima", 15);

		
		maks.setFullName("Gora");
		maks.setAge(22);
		
		maks.move();
		maks.talk();
		dima.move();
		dima.talk();
		
		System.out.println(maks.getAge() + " " + maks.getFullName());
		System.out.println(dima.getAge() + " " + dima.getFullName());

	}

}
