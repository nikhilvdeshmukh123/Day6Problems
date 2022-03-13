package com.bridgelabz.logicalProblems;
import java.util.Scanner;
import java.time.Duration;
import java.time.Instant;

public class Stopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Press enter to start the stopwatch :");
		String initial=scan.nextLine();
		Instant start = Instant.now();
		
		System.out.println("Press enter to end the stopwatch :");
		String final_=scan.nextLine();
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end); 
		System.out.println("Total time elapsed : "+timeElapsed.toSeconds()+" seconds");
	}

}
