package com.entity.human1;

import java.util.Scanner;

public class classOperator {
	public static void main(String[] args) {
		System.out.println("Enter any two number to get out put: ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("Enter any operator(+,-,*,/) to calculate: ");
		char op = sc.next().charAt(0);
		switch (op) {
		case '+':
			int sum = num1 + num2;
			System.out.println("Sum is: " + sum);
			break;
		case '-':
			int sub = num1 - num2;
			System.out.println("Sub is: " + sub);
			break;
		case '*':
			int mul = num1 * num2;
			System.out.println("Mul is: " + mul);
			break;
		case '/':
			int div = num1 / num2;
			System.out.println("Div is: " + div);
			break;
		case '%':
			int mod = num1 % num2;
			System.out.println("Mod is: " + mod);
			break;
		default:
			System.out.println("Wrong Input");
		}

	}
}
