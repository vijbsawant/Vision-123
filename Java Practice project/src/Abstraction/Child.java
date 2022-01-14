package Abstraction;

public class Child extends Sample {
	
	Child (){
		super();
		System.out.println();
	}
	
	void add() {
		
		//hiding internal details/ implementation 
		System.out.println("Implimentation of child class");
	}

	void demochildM1() {
		
	}
	
	void sub () {
		System.out.println();
	}
}
