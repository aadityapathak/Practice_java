package com.entity.human1;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number to get if it is vowel or consonent: ");
		Scanner sc = new Scanner(System.in);
		char str = sc.next().charAt(0);
		if (str == 'a' || str == 'e' || str == 'i' || str == 'o' || str == 'u' || str == 'A' || str == 'E' || str == 'I'
				|| str == 'O' || str == 'U') {
			System.out.println("This is a vowel. ");
		} else if (Character.isLetter(str)) {
			System.out.println("This is a consonents. ");
		} else {
			System.out.println("This is Invalid");
		}

	}

}
