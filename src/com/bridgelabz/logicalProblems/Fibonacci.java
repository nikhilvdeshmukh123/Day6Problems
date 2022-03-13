package com.bridgelabz.logicalProblems;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the index up to which you need fibonacci sequence :");
		int n=scan.nextInt();
		int a=0;
		int b=1;
		for(int i=0;i<n;i++) {
			if(i>=2) {
				int c=b;
				b=a+b;
				a=c;
				System.out.printf("%d ",b);
			}
			else if(i==1) {
				System.out.printf("%d ",b);
			}
			else {
				System.out.printf("%d ",a);
			}
		}
	}

}
