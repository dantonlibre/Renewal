package com.class07;

public class Class07 {

	public static void createCoffeCup(int sugar) {
		System.out.println("you create cooffee whith " + sugar + " spon of sugar");
	}

	public static void main(String[] args) {

		int[] numbers = { 67, 90, -76, -23, -98, 0, 69, -33, 189, 61, 19, 23 };
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {

				System.out.println(numbers[i]);
			}

		}
		System.out.println("-------------------------------------");
		// вывести индекс каждого элемента который можно разделить на 4
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 4 == 0) {
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.println("-----------------------------------------");
		// вывести элементы кратные 3
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 3 == 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		System.out.println("-----------------------------------------");

//        print index of negative elements
		boolean isFirstNumPresent = false;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < 0) {
				if (isFirstNumPresent == true) {
					System.out.print(", ");
				}
				System.out.print(i);
				isFirstNumPresent = true;

			}

		}
		System.out.println();
		System.out.println("---------------------------------");
		// вывести все четные элементы первой половины массива
		System.out.println("this el");
		for (int i = 0; i < numbers.length / 2; i++) {
			if (numbers[i] % 2 == 0) {

				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		System.out.println("------------------------------------1");
		// вывести все элементы второй половины массива
		for (int i = numbers.length / 2; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		System.out.println("--------------------------------");

		// вывести все индексы нечетных элементов
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 1) {

				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("--------------------------------");
		System.out.println();
		// сложнее
		// найти сумму элементов первой половины массива, и количество их
		int sum = 0;
		int count = 0;
		for (int i = 0; i < numbers.length / 2; i++) {
			sum = sum + numbers[i];
			count++;
		}
		System.out.print("sum = " + sum + "count = " + count);
		System.out.println();
		System.out.println("------------------------------2");

		// найти среднее арифметическое всех четных элементов массива

		count = 0;
		sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				sum += numbers[i];
				count++;

			}

		}
		System.out.println(sum / count);
		System.out.println("-----------------------------3");
		// вывести все элементы массива, которые отличаются от среднего арифметического
		// не больше чем на 10 элементов
		count = 0;
		sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
			count++;
		}
		int arifm = sum / count;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > arifm - 10 && numbers[i] < arifm + 10) {

				System.out.print(numbers[i] + " ");
			}

		}
		System.out.println();
		System.out.println("---------------------------------------5");

		// сделать реверс массива
		int temp = 0;
		for (int i = 0; i < numbers.length / 2; i++) {
			temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 - i];
			numbers[numbers.length - 1 - i] = temp;
		}
		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");

		}
		System.out.println();
		System.out.println("------------------------------6");
		// cоздать новый массив и добавить в него все кратные 5 числа от 20 до 50
		count = 0;
		int min = 20;
		int max = 50;
		for (int i = min; i < max; i++) {
			if (i % 5 == 0) {
				count++;

			}

		}
		int[] nums = new int[count];
		int size = 0;
		for (int i = min; i < max; i++) {
			if (i % 5 == 0) {
				nums[size] = i;
				size++;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}

		createCoffeCup(0);
		createCoffeCup(50);
		System.out.println("--------------------");
	}
	
}

// модефикатор доступа/ static | тип возвращяемого значения (void ничего не
// возвращает )| имя метода| параметры метода


