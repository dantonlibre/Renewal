package com.class02;

public class HW02 {
	public static void main(String[] args) {

//		Вводятся три целых числа. Определить какое из них наибольшее.

		int a = (int) (Math.random() * 400);
		int b = (int) (Math.random() * 400);
		int c = (int) (Math.random() * 400);

		if (a > b && a > c) {
			System.out.println("a");
		} else if (b > a && b > c) {
			System.out.println("b");
		} else {

			System.out.println("c");
		}
//		Create a Java Programs (class) and name it PracticeVariables.
//		create variables for all
//		8 primtive Data Types (byte, short, int, long, float, double, char, boolean).
//		I want you to print out each variable
//		on separate line and test its number range (capacity).
		
		byte vlad = 100;
		
		short vens = 10;
		
		int ben = 235;
		
		ben = 33;
		
		long umar = 1234489898L;
		
		float den = 12.9f;
		
		double ara = 0.9390;
		
		char add = '2';
		
		boolean wise = true;
		
		System.out.println(vlad);
		System.out.println(vens);
		System.out.println(ben);
		System.out.println(umar);
		System.out.println(den);
		System.out.println(ara);
		System.out.println(add);
        System.out.println(wise);		
		
	}
}
