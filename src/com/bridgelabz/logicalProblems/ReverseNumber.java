package com.bridgelabz.logicalProblems;
import java.util.Scanner;
public class ReverseNumber {
	static int revNumber=0;
    static int reverse(int n) {
    	if(n>0) {
    		int remainder=n%10;
    		revNumber=revNumber*10+remainder;
    		reverse(n/10);
    	}
    	
    	return revNumber;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n=scan.nextInt();
		System.out.println("The reversed number is :"+ ReverseNumber.reverse(n)); 

	}

}
