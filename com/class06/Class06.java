package com.class06;

public class Class06 {
	public static void main(String[] args) {

		int[] num = { 3, 4, 6, 19, 17, 34, 1, 15 };

		for (int i = 0; i < 8; i++) {
			System.out.println("Print numbers from 0 -100 = " + i + "Print every element = " + num[i]);
		}
		for (int i = 0; i < 8; i++) {
			System.out.println(num[i]);
		}
		System.out.println("---------------------------");

		for (int i = 0; i < num.length; i++) {

//			if (num[i] > 0) {
//
//				System.out.println(num[i]);
//				System.out.println("---------------------");
//			}
			if (num[i] < 0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("The size of array length = " + num.length);
		System.out.println("Print 2 element = " + num[2]);

		System.out.println("----------------------------------------");
		// print even numbers
		for (int i = 0; i < 8; i++) {
			if (num[i] % 2 == 0) {
				System.out.println(num[i]);
			}
		}
		System.out.println("--------------------------------------");
		// print odd numbers
		for (int i = 0; i < 8; i++) {
			if (num[i] % 2 == 1) {
				System.out.println(num[i]);
			}
		}
		System.out.println("---------------------------------------");
		// print sum of odd and amount of it
		int sum = 0;
		int count = 0;
		int total = 0;
		for (int i = 0; i < 8; i++) {
			if (num[i] % 2 == 1) {
				sum = sum + num[i];
				count++;
				total++;

			}
		}
		System.out.println("sum = " + sum + "; count = " + count + "; total = " + total);

		System.out.println("---------------------------------------------------------");
		int min = num[0];
		for (int i = 0; i < 8; i++) {
			if (num[i] < min) {
				min = num[i];

			}

		}
		System.out.println(min);

		System.out.println("--------------------------------------------");
		int max = num[0];
		for (int i = 0; i < 8; i++) {
			if (num[i] > max) {
				max = num[i];
			}

		}
		System.out.println(max);
        
		System.out.println("----------------------------------");
		
		min = num[0];
		int minindex = 0;
		
		for(int i = 0;i<8;i++) {
			if(num[i] <min) {
				min=num[i];
				minindex=i;
			}
		}
		System.out.println(minindex + "; "+min);
	}
}
