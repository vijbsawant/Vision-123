package Abstraction;

public class DemoAbstractionMain {

	public static void main(String[] args) {
		
		//1.We can not able to create  object of abstract class..
		
		
		Child c = new Child();
		c.add();
		c.demoMethod_1();
		
		//up casting
		
		Sample s = new Child();
		s.add();
		s.demoMethod_1();

	}

}
