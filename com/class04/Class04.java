package com.class04;

public class Class04 {

	/// Print even numbers from1 - 20
	// print numbers from 1-100
	// Print odd numbers between 20 and 50(2 ways)

	public static void main(String[] args) {

		// print number from 100 to 1
		// int i = (int) (Math.random() * 200);
		int j = 100;
		while (j >= 1) {
			System.out.println(j);
			j--;
		}
		System.out.println("---------------------------------");
		/// Print even numbers from1 - 20
		int m = (int) (Math.random() * 200);
		int i = 1;
		while (i <= m) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			i++;
		}
		System.out.println("---------------------------------");
		// print numbers from 1-100
		int s = 1;
		while (s <= 100) {
			System.out.println(s);
			s++;
		}
		System.out.println("---------------------------------");
		// Print odd numbers between 20 and 50(2 ways)
		int y = 20;
		while (y < 50) {
			if (y % 2 == 1) {
				System.out.println(y);
			}
			y++;
		}
		System.out.println("---------------------------------");
		for (y = 20; y < 50; y++) {
			if (y % 2 == 1) {
				System.out.println(y);
			}
		}

		System.out.println("---------------------------------");
		// We are playing a lottery game and the lucky number is 17;
		// We want to keep asking the user to enter any numbers from 1-20;
		// until he guesses the lucky number
		// --> In that case we print "Congrats, you won!"

		int p = 0;
		while (true) {
			p++;
			int l = (int) (Math.random() * 20);
			if (l == 17) {
				System.out.println(" Congrats you win! try count: " + p);
				break;
			}

		}

	}
}
