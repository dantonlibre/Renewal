package com.class08;

public class Class08 {

	public static void main(String[] args) {
		int[] elem = { 56, 86, 90, 100, 110, 19, 14, 20 };

		// find largest number
		int largest = 0;
		for (int num : elem) {

			if (num > largest) {
				largest = num;
			} 
		}
		System.out.println(largest);
		System.out.println("------------------------------");

		// swap 2 numbers without a temporary variable

		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("------------------------");
		// Swap 2 strings without a temporary variable
		String x = "Hello";
		String y = "World";
		x += y;
		y = x.substring(0, (x).length() - y.length());
		x = x.substring(y.length());
		System.out.println(x);
		System.out.println(y);
		System.out.println("---------------------------");

		// вывести числа фиббоначчи до 150.
		int c;
		a = 0;
		b = 1;
		for (int i = 1; i <= 150; i++) {
			System.out.print(a + " ");

			c = a + b;
			a = b;
			b = c;

		}
		System.out.println();
		System.out.println("---------------------");
//		 вывести элементы массива которые меньше чем сумма двух предыдущих элементов
		int sum = 0;
		for (int i = 0; i < elem.length; i++) {

		}
	}
}
