package com.class05;

public class Class05 {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 0 || 9 - i == j && i < 5 || j == i && i < 5) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("--------------------------------");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 0 || 9 - j == i && j < 5 || i == j && j < 5) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 9 || 9 - j == i && j > 4 || i == j && j > 4) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (9 - j == i && i < 5 || j == 9 || j == 0 || i == 0 || i == 9 || i == j && i < 5) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();
		}
		System.out.println("-----------------------------------------");

		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (j == 5 || i == 5 || i == 0 && j > 5 || j == 10 && i > 5 || i == 10 && j < 5 || j == 0 && i < 5) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
		System.out.println("-------------------------------------");

		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (j == 5 && i > 4 || i == 5 && j > 5 || j == 10 && i > 5 || i == 10 && j > 5 || j == i && i > 5
						|| 15 - i == j) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
		System.out.println("----------------------------------------");
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (j == 5 || i == 10 && j <= 8 && j >= 2 || i == 9 && j == 2 || i == 9 && j == 8
						|| 5 - i == j && j > 1) {
					System.out.print(" * ");
				} else {
					System.out.print("   ");
				}

			}
			System.out.println();

		}
//		int[]num = {} ;
//		num[1] = 5;
//		System.out.println(num);
	}
}
