package ClassAndObject_Demo;

public class Sample {
	
	int age=20;
	
	 String name="Java";
	 
	 static String companyName ="TCS";
	 
	 
	 void add() {
		 System.out.println("Add Method");
	}

	 static void sub() {
		 System.out.println("Sub Method");
	 }
	public static void main(String[] args) {
	 
	Sample obj=new Sample();
	
	System.out.println(obj.age);
	System.out.println(obj.name);
	obj.add();
	
	System.out.println();
	
	System.out.println(companyName);
	obj.companyName="Tech";
	
	System.out.println(obj.companyName);
	sub();
	
	System.out.println();
	
	Sample obj2=new Sample();
	System.out.println(obj2.age);
	System.out.println(obj2.companyName);
	
	System.out.println();
	
	Sample obj3=new Sample();
	System.out.println(obj3.age);
	
	}

}
