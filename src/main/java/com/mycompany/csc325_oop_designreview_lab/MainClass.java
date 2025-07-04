package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// This is to create a Freshman and a Senior student
		Freshman std1 = new Freshman("Leo", (short) 18, 12);
		Senior std2 = new Senior("Steven", (short) 20, 90);

		// This is to ask user to enter GPA for the freshman
		System.out.print("Enter GPA for " + std1.getName() + ": ");
		std1.setGpa(scanner.nextDouble());

		// This is to ask user to enter GPA for the senior
		System.out.print("Enter GPA for " + std2.getName() + ": ");
		std2.setGpa(scanner.nextDouble());

		// This is to print student details
		System.out.println(std1);
		System.out.println(std2);

		scanner.close();

	}
}
