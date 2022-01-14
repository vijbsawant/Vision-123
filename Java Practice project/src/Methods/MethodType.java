package Methods;

public class MethodType {

		//Types
		//- main method
		//- Regular method - static method
						 //- non static method

		
		static void add() {
			System.out.println("Addition of two numbers");
			System.out.println(199+1);
		}
		
		 void sub() {
			System.out.println("Substraction of two numbers");
			System.out.println(400-1);
		}
		
		
		public static void main(String[] args) {
			// it is a starting point of our program
			// compiler find main method first in program execution
			
			System.out.println("Welcome Guys..!");	
			
			//same class
			//to call any static methods we do not need to create any object
			add();

			System.out.println();
			
			//same class
			//to call any non static method, we need to create an object
			MethodType obj=new MethodType();
			obj.sub();
			
			System.out.println();
			//different class 
			
			//to call static method, we need to call it with className
			MethodType2.M2();
			
			//to call non static method, we need to create an object
			
			MethodType2 obj2=new MethodType2();
			obj2.M1();

	}

}
