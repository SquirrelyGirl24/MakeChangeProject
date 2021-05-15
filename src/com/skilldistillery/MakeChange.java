package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);

		double price = 0.00;
		double tendered = 0.00;
		double need = 0.00;
		double change = 0.00;

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
			} else {
				change = tendered - price;
				System.out.println("You're change is " + change + ", have a nice day.");
				String output = makeChange(change);
				System.out.println(output);
//				tendered = 0;
			}
		}
	}

	public static String makeChange(double change) {
		int intTotal = (int) change;
		int twenty = 0;
		int ten = 0;
		int five = 0;
		int one = 0;
		int quarter = 0;
		int dime = 0;
		int nickle = 0;
		int penny = 0;
		String output = "";

		while (intTotal > 20) {
			intTotal -= 20;
			twenty++;
		}
		output += "Twenties: " + twenty;
		
		while (intTotal > 10) {
			intTotal -= 10;
			ten++;
		}
		output += "Tens: " + ten;
		
		while (intTotal > 5) {
			intTotal -= 5;
			five++;
		}
		output += "Fives: " + five;
		
		while (intTotal > 1) {
			intTotal -= 1;
			one++;
		}
		output += "Ones: " + one;
		
		while (intTotal > 25) {
			intTotal -= 25;
			quarter++;
		}
		output += "Quarters: " + quarter;
		
		while (intTotal > 10) {
			intTotal -= 10;
			dime++;
		}
		output += "Dimes: " + dime;
		
		while (intTotal > 5) {
			intTotal -= 5;
			nickle++;
		}
		output += "Nickles: " + nickle;
		
		while (intTotal > 1) {
			intTotal -= 1;
			penny++;
		}
		output += "Pennies: " + penny;

		return output;
	}
}
