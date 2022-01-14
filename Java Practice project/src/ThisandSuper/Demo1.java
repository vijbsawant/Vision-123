package ThisandSuper;

public class Demo1 {

		int age;
		String name;
		
		
	  Demo1(int a){
		  System.out.println("Constructor");
		  
	  }
	  
	  Demo1(int age, String name){
		  this(55);
		  this.age= age;
		  this.name= name;
		  this.show();
		  
		  
	  }
		
		void show() {
			
			System.out.println("Light");
			System.out.println(age);
			print(this);
			System.out.println();
		}
		
		void print(Demo1 pqr) {
			
		}
	public static void main(String[] args) {
	
		Demo1 obj = new Demo1(99, "Dhara");
		
		System.out.println(obj.age);
		System.out.println(obj.name);
		obj.show();
		System.out.println();
		
		Demo1 obj2 = new Demo1(101, "Ganga");
		System.out.println();
		System.out.println(obj2.age);
		System.out.println(obj2.name);
		obj2.show();
		
	}

}
