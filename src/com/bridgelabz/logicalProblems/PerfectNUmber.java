package com.bridgelabz.logicalProblems;
import java.util.Scanner;
public class PerfectNUmber {
	static void check(int n) {
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		if(sum==n) {
			System.out.println("Provided number is a Perfect number");
		}
		else {
			System.out.println("Provided number is not a Perfect number");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the number : ");
    int n=scan.nextInt();
    PerfectNUmber.check(n);
	}

}
