package Methods;

public class TypesOfMethod {
	
	//types
	//main and regular - static method
						//non static method
	
	static void add() {
		System.out.println("Addition");
		System.out.println("Addditon of two numbers 10+20=" + (10+20));
	}
	
		
		void sub() {
		System.out.println("Substraction");
		System.out.println("Substraction of two numbers 100-20=" + (100-20));
		
		}
	public static void main(String[] args) {
	
		// main method is starting of our program.
		//compiler find main method  1st in program execution.
		
		//program starting point is main method.....
		// void mean nothing return any value
		
	   System.out.println("Welcome..!");
	   
	   // to call any static method, we do not need to create any object..
	   //same class
	    add();
	    System.out.println();
		
	    // to call any non- static method, we need to create any object..
		//same class
	    TypesOfMethod obj=new TypesOfMethod();
	    obj.sub();
	    
	    System.out.println();
	    
	}
	

}
