package PracticePro;

import java.util.Scanner;

public class Evenodd {

	public static void main(String[] args) {
		System.out.println("Enter any number :-");
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		System.out.println("You have entered = "+input);
		
		if(input%2==0) {
			System.out.println( input +" is even num");
		}
		else {
			System.out.println( input +" is odd num");
		}
			
		 
		

	}

}
