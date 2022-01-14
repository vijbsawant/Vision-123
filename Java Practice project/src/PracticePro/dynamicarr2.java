package PracticePro;

import java.util.Scanner;

public class dynamicarr2 {

	public static void main(String[] args) {
		System.out.println("Enter how many values want to stored here :");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int[] arr=new int [input];
		System.out.println(arr.length);
		
		for(int i =1; i<arr.length; i++) {
			arr[i]=i;
		}
		
		for(int j:arr) {
			System.out.println(j);
		}

	}

}
