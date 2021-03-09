package com.class04;

public class HW04 {
	public static void main(String[] args) {

//	Write a program that reads a range of integers (Start and  End point),
//	provided by a user and then from that range
//	prints the sum of the even and odd integers.
//Print also the sum of all the total

		int total = 0;
		int start = (int) (Math.random() * 200);
		int end = (int) (Math.random() * 200);
		int sumOdd = 0;
		int sumEven = 0;

		if (start > end) {
			int temp = start;// 1 step
			start = end; // 2 step
			end = temp; // 3 step

		}

		for (int j = start; j <= end; j++) {
			if (j % 2 == 0) { // even number
				sumEven += j;
			}
			if (j % 2 == 1) {
				sumOdd += j;
			}
			total += j;
		}
		System.out.println("The sum of even numbers is " + sumEven);
		System.out.println("The sum of odd numbers is  " + sumOdd);
		System.out.println("The sum of all the total  " + total);

//Write a program to ask a user to enter item they want to buy and the price of that item.
//Every time user enters money accumulate the amount and tell the user how much is left to pay off.
//If user give more money program should return a change.
//Whenever a user done with payments program should say"Thank you for shopping!"

		double money = (int) (Math.random() * 200);
		double totalAmount = (int) (Math.random() * 200);
		double remainingBalance = 0;

		if (money <= totalAmount) {
			remainingBalance = totalAmount - money;
			System.out.println("money = " + money);
			System.out.println("totalAmount = " + totalAmount );
          System.out.println("remainingBalance = " + remainingBalance );
		}

	}
}
