package com.class02;

public class Class02 {
	public static void main(String[] args) {
		// Из двух случайных чисел, одно из которых четное, а другое нечетное,
		// определить и вывести на экран нечетное число.
		String x = "M";
		switch (x) {
		case "F":
			System.out.println("0-19");
			break;
		case "E":
			System.out.println("20-39");
			break;
		case "D":
			System.out.println("40-59");
			break;
		case "C":
			System.out.println("60-74");
			break;
		case "B":
			System.out.println("75-89");
			break;
		case "A":
			System.out.println("90-100");
			break;
		default:
			break;
		}
		// ;
		int a = 30;
		int b = 39;

		if (a % 2 == 0) {
			System.out.println("a = четное");

		} else {

			System.out.println("b = четное");
		}
		// Вводятся три разных числа. Найти, какое из них является средним (больше
		// одного, но меньше другого)
		int c = (int) (Math.random() * 200);
		int d = (int) (Math.random() * 200);
		int f = (int) (Math.random() * 200);
		if (f > c && d < c) {
			System.out.println("c");
		} else if (c > f && c < d) {
			System.out.println("f");
		} else {
			System.out.println("d");
		}
		// . Составить расписание на неделю. Пользователь вводит порядковый номер дня
		// недели и у него на экране отображается, то, что запланировано на этот день.

		int day = (int) (Math.random() * 6) + 4;

		switch (day) {
		case 1:
			System.out.println("go to school");
			break;
		case 2:
			System.out.println("Go to work");
			break;
		case 3:
			System.out.println("Dinner wirh friends");
			break;
		case 4:
			System.out.println("Party");
			break;
		case 5:
			System.out.println("Birthday");
			break;
		case 6:
			System.out.println("Training");
			break;
		case 7:
			System.out.println("Chill out");
			break;
		default:
			System.out.println("No data");
			break;
		}
//	    Пользователю для расчета времени в пути надо вводить не номера станций, а буквы (A,B,C,D,E). 
//	    Необходимо предусмотреть ввод пользователем и маленьких, и больших букв (избавиться от регистрозависимости). 
//	    То есть если введено или D, или d – должен сработать один и тот же case.    	
		String k = "b";
		switch (k.toLowerCase()) {
		case "a":
			System.out.println("case a or A");
			break;
		case "b":
			System.out.println("case b or B");
			break;
		case "c":
			System.out.println("case c or C");
			break;
		case "d":
			System.out.println("case d or D");
			break;
		case "e":
			System.out.println("case e or E");
			break;
		default:
			System.out.println("no case");
			break;

		}
		// Проверка делимости одного числа на другое
		int r = (int) (Math.random() * 200);
		int w = (int) (Math.random() * 200);
		if (r % w == 0) {
			System.out.println("r = " + r + " w = " + w + " - true");
		} else if (w % r == 0) {
			System.out.println("r = " + r + " w = " + w + " - false");

		} else {
			System.out.println("r = " + r + " w = " + w + " - no count");
		}
//	     Определить, является ли год, который ввел пользователем, високосным или невисокосным.
		int year = (int) (Math.random() * 2021);

		if (year % 4 == 0) {
			System.out.println("year = " + year + " - true");
		} else {
			System.out.println("year = " + year + " - false");
		}
//	     Определить четверть координатной плоскости, которой принадлежит точка. Координаты точки ввести с клавиатуры.
		int n = (int) (Math.random() * 200) - 100;
		int o = (int) (Math.random() * 2000) - 1000;

		if (n > 0 && o < 0) {
			System.out.println("n = " + n + " + о = " + o + " 2");
		}

	}
}

