package ClassAndObject_Demo;

public class Animal_Demo {
	
	int legs;
	
	String name;
	
	String color;
	
	public static void main(String[] args) {
	
		Animal_Demo dog=new Animal_Demo();
		dog.legs=4;
		System.out.println(dog.legs);
		
		dog.color="black";
		System.out.println(dog.color);
		
		dog.name="Monty";
		System.out.println(dog.name);

		dog.display();
		
	}

	private void display() {
		System.out.println();
		
	}
}
