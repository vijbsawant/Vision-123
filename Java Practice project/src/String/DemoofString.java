package String;

public class DemoofString {

	public static void main(String[] args) {
		
		//1st way: string literal / without using new keyword
		String str1= "java";
		String str2= "java";
		
		//2nd way: with using new keyword
		String str3= new String("java");
		String str4= new String("java");
		
		
		//== operator --- here compare the memory add of string obj.
		System.out.println("here compare the memory add of string obj");
		System.out.println(str1==str2);
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		
		System.out.println();
		//.equals() ---- here compare the content of string obj. 
		System.out.println("here compare the content of string obj");
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		System.out.println(str3.equals(str4));
		
	}

}
