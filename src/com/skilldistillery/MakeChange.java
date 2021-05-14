package com.skilldistillery;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		double price = 0.00;
		double tendered = 0.00;
		double change = tendered - price;
		double need = price - tendered;

		System.out.println("What is the price of the item? ");
		price = kb.nextDouble();
		System.out.println("How much money was given? ");
		tendered = kb.nextDouble();
		kb.close();
		
		while (tendered > 0) {
			if (price == tendered) {
				System.out.println("Thank you, have a nice day.");
			}
			else if (price < tendered) {
				System.out.println("Still need " + need );
			}
//			int money = 39;
//			
//			int numQuarters = money / 25;
//			System.out.println(numQuarters);
//			
//			OR
//			for (int i = 0; i < numQuarters; i ++)
//				System.out.println("Quarter(s)");
//				money -= numQuarters * 25;
//			
//			while (money > 0) {
//				if (money >= 25) {
//					System.out.println("Quarter");
//					money -= 25;
//				}
//	}
			
			else if (tendered >= 20.00) {
				System.out.print("Twenty");
				tendered -= 20.00;
			}
			else if (tendered >= 10.00) {
				System.out.print("Ten");
				tendered -= 10.00;
			}
			else if (tendered >= 5.00) {
				System.out.print("Five");
				tendered -= 5.00;
			}
			else if (tendered >= 1.00) {
				System.out.print("One");
				tendered -= 1.00;
			}
			else if (tendered >= 0.25) {
				System.out.print("Quarter");
				tendered -= .25;
			}
			else if (tendered >= 0.10) {
				System.out.print("Dime");
				tendered -= .10;
			}
			else if (tendered >= 0.05) {
				System.out.print("Nickle");
				tendered -= 0.05;
			}
			else if (tendered >= 0.01) {
				System.out.print("Penny");
				tendered -= 0.01;
			}
			
//			else if (tendered > price) {
//				System.out.println("You're change is " + change + ", have a nice day.");
//			}
			
		}
	}

}
