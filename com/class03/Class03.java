package com.class03;

public class Class03 {
	public static void main(String[] args) {

//		Найти сумму четных чисел и их количество в диапазоне от 1 до 99
		int sum = 0;
		int count = 0;
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		int sum4 = 0;
		for (int i = -18; i < 700; i++) {
			if (i < 0) {
				sum4++;
				sum4 = sum4 - i;
			}
			if (i < 0) {
				sum3 -= i;
			}
			if (i % 2 == 1) {
				sum2 += i;
			}
			if (i % 4 == 0) {
				sum1++;
			}
			if (i % 2 == 0) {
				count++;
				sum = sum + i;
			}

		}
		System.out.println(sum);
		System.out.println(" count = " + count + " sum = " + sum + " sum1 = " + sum1 + " sum2 = " + sum2 + " sum3 = "
				+ sum3 + " sum4 = " + sum4);

//		Проверить простое ли число? (число называется простым, если оно делится только
//				само на себя и на 1)

//		int num = (int) (Math.random() * 200) + 2;
//
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//
//				System.out.println("diff num = " + num + " i = " + i);
//			}
//		}
//		Найти сумму четных чисел и их количество в диапазоне от 1 до 99!
     System.out.println("----------------------------------------------");
		int i = (int) (Math.random() * 200);
		sum = 0;
		count = 0;
		for (int j = 0; j < 99; j++) {
			if (j % 2 == 0) {
				sum = sum + j;
				count++;
			}
		}
		System.out.println(" sum = " + sum + " count = " + count);
	}
}
