package PracticePro;

import java.util.Scanner;

public class rev_input_string {
	
	 public static void main(String[] args) {
		 System.out.println("Enter your String :");
		 
		 Scanner scn = new Scanner(System.in);
		 
		 String str = scn.nextLine();
		 System.out.println(str);
		 String rev="";
		 for (int i=str.length() -1; i>=0;i--) {
			 rev+=str.charAt(i);
		 }
		System.out.println(rev);
	}

}
