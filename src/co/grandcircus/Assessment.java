package co.grandcircus;

import java.util.Scanner;

public class Assessment {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int burgerOrder = 1;
		int sodaOrder = 2;
		int exit = 3;
		double subTotal = 0;
		double total = subTotal * 0.07;
		double burgerCost = 2.50;
		double sodaCost = 1.25;
		String Burgers = "";
		String Sodas = "";
		
		while (true) {
			System.out.println("1. Burger" + "\n" + "2. Soda" + "\n" + "3. Exit");
			System.out.println("Select an option: ");
			int choice = scnr.nextInt();
			if (choice == 1) {
				Burgers += "*";
				continue;
			} else if (choice == 2) {
				Sodas += "*";
				continue;
			} else if (choice > 3) {
				System.out.println("Sorry I didn't understand, let's try again.");
			} else if (choice == 3) {
				break;
			}
		}
		
		
		burgerCost += burgerCost;
		sodaCost += sodaCost;
		subTotal += burgerCost + sodaCost;
		System.out.println("Subtotal: " + subTotal);
		total += (subTotal * 0.07) + subTotal;
		System.out.println("Total: " + total);
		
		System.out.println("Burgers: " + Burgers);
		System.out.println("Sodas: " + Sodas);
		
		
		scnr.close();
	} 
	

	

}
