package InheritanceOfjava;

public class Child extends Parent {

	int childRollNo = 111;
	
	String childName = "Purvi";
	
	String childSurname = "Sawant";
	
	void info() {
		System.out.println("Purvi's Detailes :");
	}
	
	
	public static void main(String[] args) {
		
		/*Parent p =new Parent();
		
		System.out.println(p.namee);
		System.out.println(p.name);
		System.out.println(Parent.address);
		p.father();
		System.out.println("Arav");
		p.mother();
		System.out.println("Avnee");*/

		Child c =new Child();
		
		c.info();
		System.out.println("Childname:");
		System.out.println(c.childName);
		System.out.println("Childrollno:");
		System.out.println(c.childRollNo);
		System.out.println("ChildSurname:");
		System.out.println(c.childSurname);

		System.out.println();
		c.father();
		System.out.println(c.name);
		c.mother();
		System.out.println(c.namee);
		c.live();
		System.out.println(address);
	
		
	}

}
