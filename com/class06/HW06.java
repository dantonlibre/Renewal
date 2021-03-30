package com.class06;

public class HW06 {

	public static void main(String[] args) {

//		1. Найти минимальный элемент массива

		int[] num = { 37, 45, 47, 98, 59, 60, 06, -33, 9, 50, 19 };

		int min = 0;
		for (int i = 0; i < 11; i++) {
			if (num[i] < min) {
				min = num[i];

			}

		}
		System.out.println(min);

		System.out.println("-------------------------------------");

//		2. Найти максимальный элемент массива
		int max = 0;
		for (int i = 0; i < 11; i++) {
			if (num[i] > max) {
				max = num[i];
			}
		}
		System.out.println(max);

		System.out.println("--------------------------------------");

//		3. Найти индекс минимального элемента массива

		min = num[0];
		int minindex = 0;

		for (int i = 0; i < 11; i++) {
			if (num[i] < min) {
				min = num[i];
				minindex = i;
			}
		}
		System.out.println(minindex + ";" + min);

		System.out.println("-------------------------------------");

//		4. Найти индекс максимального элемента массива

		max = num[0];
		for (int i = 0; i < 11; i++) {
			if (num[i] > max) {
				max = num[i];
				minindex = i;
			}
		}
		System.out.println(minindex + ";" + max);

		System.out.println("-------------------------------------");

//		5. Посчитать сумму элементов массива с нечетными индексами

		int sum = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				sum = sum + num[i];
			}
		}
		System.out.println(sum);

		System.out.println("--------------------------------------");
//		7. Посчитать количество нечетных элементов массива
		int count = 0;
		for (int i = 0; i < 11; i++) {
			if (num[i] % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);

		System.out.println("-----------------------------------------");
//		6. Сделать реверс массива (массив в обратном направлении)
		for (int i = 0; i < num.length; i++) {

			System.out.print(num[i] + " ");
		}
		System.out.println();

		int temp = 0;
		for (int i = 0; i < num.length / 2; i++) {
			temp = num[num.length - 1 - i];// 1 step
			num[num.length - 1 - i] = num[i];// 2 step
			num[i] = temp;// 3 step
		}

		for (int i = 0; i < num.length; i++) {

			System.out.print(num[i] + " ");
		}
	}

}
