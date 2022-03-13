package com.bridgelabz.logicalProblems;

import java.util.Scanner;

public class PrimeNumber {
	static void check(int n) {
		if (n == 0 || n == 1) {
			System.out.println("This is not a prime");
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				count += 1;
			}
			if (count > 1) {
				System.out.println("This is not a prime number");
				break;
			}

		}
		if (count == 0) {
			System.out.println("This is prime number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = scan.nextInt();
		PrimeNumber.check(n);
	}

}
