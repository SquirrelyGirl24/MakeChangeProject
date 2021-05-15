package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double price = 0.0;
		double tendered = 0.0;
		double need = 0.0;
		double change = 0.0;

		System.out.println("What is the price of the item? ");
		price = kb.nextDouble();
		System.out.println("How much money was given? ");
		tendered = kb.nextDouble();
		kb.close();

		while (tendered > 0) {
			if (price == tendered) {
				System.out.println("Thank you, have a nice day.");
			} else if (price > tendered) {
				need = price - tendered;
				System.out.println("Still need " + need);
				tendered = 0;
			} else {
				change = tendered - price;
				System.out.println("You're change is $" + change + ", have a nice day.");
				String output = makeChange(change);
				System.out.println(output);
				tendered = 0;
			}
		}
	}

	public static String makeChange(double change) {
		int intTotal = ((int) (change * 100));
		System.out.println(intTotal);
//		double intTotal = change;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickle = 0;
		int penny = 0;
		String output = "";

		while (intTotal > 2000) {
			intTotal -= 2000;
			twenty++;
		}
		if (twenty > 0) output += " Twenties: " + twenty;
//		System.out.println(intTotal);
//		System.out.println(twenty);

		while (intTotal > 1000) {
			intTotal -= 1000;
			ten++;
		}
		if (ten > 0) output += " Tens: " + ten;
//		System.out.println(intTotal);
//		System.out.println(ten);

		while (intTotal > 500) {
			intTotal -= 500;
			five++;
		}
		if (five > 0) output += " Fives: " + five;
//		System.out.println(intTotal);
//		System.out.println(five);

		while (intTotal > 100) {
			intTotal -= 100;
			one++;
		}
		if (one > 0) output += " Ones: " + one;
//		System.out.println(intTotal);
//		System.out.println(one);

		while (intTotal > 25) {
			intTotal -= 25;
			quarter++;
		}
		if (quarter > 0) output += " Quarters: " + quarter;
//		System.out.println(intTotal);
//		System.out.println(quarter);

		while (intTotal > 10) {
			intTotal -= 10;
			dime++;
		}
		if (dime > 0) output += " Dimes: " + dime;
//		System.out.println(intTotal);
//		System.out.println(dime);

		while (intTotal > 5) {
			intTotal -= 5;
			nickle++;
		}
		if (nickle > 0) output += " Nickles: " + nickle;
//		System.out.println(intTotal);
//		System.out.println(nickle);

		while (intTotal >= 1) {
			intTotal -= 1;
			penny++;
		}
		if (penny > 0) output += " Pennies: " + penny;
//		System.out.println(intTotal);
//		System.out.println(penny);

		return output;
	}
}
