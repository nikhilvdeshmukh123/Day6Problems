package com.bridgelabz.jUnitTest;
import java.util.Scanner;
public class DayOfWeek {
    static void dayOfWeek(int y,int m,int d) {
    	 int Y=y-(14-m)/12;
    	    int X=Y+Y/4-Y/100+Y/400;
    	    int M=m+12*((14-m)/12)-2;
    	    int D=(d+X+31*M/12)%7;
    	    System.out.println("The day is : "+D);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the year :");
    int y=scan.nextInt();
    System.out.println("Enter the month :");
    int m=scan.nextInt();
    System.out.println("Enter the date :");
    int d=scan.nextInt();
    dayOfWeek(y, m, d);
	}

}
