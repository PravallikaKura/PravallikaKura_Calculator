package com.epam.Calculator;

import java.util.Scanner;

public class Calculator {
	public static void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		System.out.println("Enter your choice based on the operation"
				+ "1 for Addition" + "2 for Subtraction 3 for Multiplication 4 for Division");
		int choice = sc.nextInt();
		MathOperations mt = new MathOperations();
		switch(choice){
		case 1:
			mt.addition(num1, num2);
			break;
		
		case 2:
			mt.subtraction(num1, num2);
			break;
		case 3:
			mt.multiplication(num1, num2);
			break;
		case 4:
			mt.division(num1, num2);
			break;
	}
}
}
