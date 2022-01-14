package PracticePro;

import java.util.Scanner;

public class dynamicarr2_1 {

	public static void main(String[] args) {
		System.out.println("Enter how many values want to stored here :");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int[] arr=new int [input];
		System.out.println(arr.length);
		
		for(int i =0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
		for(int j:arr) {
			System.out.println(j);
		}


	}

}
