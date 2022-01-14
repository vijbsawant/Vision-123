package Methods;

public class MethodArgs {
	
	static void add() {
		System.out.println("addtion of 2 no (4+1) =" +(4+1));
	}

	static void sum(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		
		System.out.println("Addition of 3 no ("+a+"+"+b+"+"+c+")=" + d);
	}
	
	static void sum(int a, int b)
	{
		int c = a+b;
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		
		System.out.println("Addition of 2 no (" + a + "+" + b +")=" + c);
	}
	
	 void fullName( String fName, String lName) {
		System.out.println("Fullname = "+fName +" "+lName);
		
		
	}
	
	public static void main(String[] args) {
	
		
		add();
		
		System.out.println();
		
		sum(1,1,1);
		
		sum(2,2,2);
		
		sum(3,3,3);
		
		sum(11,11);
		
		System.out.println();
		
		MethodArgs obj= new MethodArgs();
		obj.fullName("Ram", "Kapoor");
		
		
	}

}
