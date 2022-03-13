package com.bridgelabz.jUnitTest;
import java.util.Scanner;
public class SquareRoot {
	static double epsilon=Math.exp(-15);
    static double sqrt(double input) {
    	double t=input;
    	while(true) {
    		t=0.5*(input/t +t);
    		if(Math.abs(t-input/t)<epsilon*t) {
    			return t;
    		}
    		
    	}
    
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int input=scan.nextInt();
        System.out.println(sqrt(input));
	}

}
