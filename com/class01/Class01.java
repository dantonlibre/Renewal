package com.class01;

public class Class01 {

	public static void main(String[] args) {
		// Написать программу определения оценки студента по его рейтингу, на основе
		// следующих правил

		int a = 13;

		if (a <= 19 && a >= 0)
			System.out.println("F");
		else if (a <= 20 && a >= 39)
			System.out.println("E");
		else if (a <= 40 && a >= 59)
			System.out.println("D");
		else if (a <= 60 && a >= 74)
			System.out.println("C");
		else if (a <= 75 && a >= 89)
			System.out.println("B");
		else if (a <= 90 && a >= 100)
			System.out.println("A");
	
	}
}
