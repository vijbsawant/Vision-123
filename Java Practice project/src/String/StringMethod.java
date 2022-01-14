package String;

public class StringMethod {

	public static void main(String[] args) 
	{
		String s1 ="Hello";
		String s2 ="good morning";
		String s3 ="hello";
		String s4 ="";
		
		String s5 ="have a nice dear";
		String s6 =" ";
		String s7= "vision";
		
		System.out.println("Length Of String :");
		System.out.println(s2.length());
		System.out.println("-----------");
		int len = s5.length();
		System.out.println(len);
		
		System.out.println();
		
		System.out.println("Char At index :");
		System.out.println(s1.charAt(4));
		System.out.println("----------");
		char ch = s1.charAt(0);
		System.out.println(ch);
		
		System.out.println();
		
		System.out.println("Index of Char :");
		System.out.println(s2.indexOf('m'));
		System.out.println("------------");
		int indx = s3.indexOf('Y');
		System.out.println(indx);
		
		System.out.println();
		
		System.out.println("Check empty or not :");
		System.out.println(s4.isEmpty());
		System.out.println("------------");
		System.out.println(s6.isEmpty());
		
		System.out.println();
		System.out.println("Uppercase () :");
		System.out.println(s1.toUpperCase());
		
		System.out.println();
		System.out.println("Lowercase() :");
		System.out.println(s3.toLowerCase());
		
		System.out.println();
		System.out.println("equals()");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println("equalsIgnorecase() :");
		System.out.println(s1.equalsIgnoreCase(s3));
		System.out.println(s2.equalsIgnoreCase(s5));
		
		System.out.println();
		System.out.println("compareTo() :");
		System.out.println(s7.compareTo(s1));
		System.out.println("compareToIgnorecase() :");
		System.out.println(s1.compareToIgnoreCase(s3));
		
		System.out.println();
		System.out.println("split() :");
		String[] Str = s2.split("o");
		for(int i=0; i < Str.length; i++) {
		System.out.print(Str[i]);
		}
		
		System.out.println();
		System.out.println("trim() :");
		String s ="    Vision class       ";
		System.out.println(s);//before trim()
		System.out.println(s.trim());//after trim()
		
	}
}
