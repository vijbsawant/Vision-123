package InheritanceOfjava;

public class MultiLevel_Inheri {

	public static void main(String[] args) {
		 
		System.out.println();
		System.out.println("Calling class method in Another Class ");
		Granny_Multi g = new Granny_Multi();
		
		System.out.println(g.grandname);
		
		Parent_Multi p = new Parent_Multi();
		
		System.out.println(p.fname);
		
		Child_Multi c = new Child_Multi();
		
		System.out.println(c.myname);
		
		// Here We Use MultiLevel Inheritance
		
		System.out.println();
		
		System.out.println("Name list :");
		
		Granny_Multi g3 = new Granny_Multi();
		
		System.out.println(g3.grandname);
		System.out.println(g3.fname);
		System.out.println(g3.myname);
		
		System.out.println();
		
		System.out.println("Age list :");
		
		Granny_Multi g1 = new Granny_Multi();
		
		System.out.println(g1.grandAge);
		System.out.println(g1.fatherAge);
		System.out.println(g1.myAge);
		
		System.out.println();
		
	    System.out.println("Their Talking Apperance :");
		
		Granny_Multi g2 = new Granny_Multi();
		
		g2.grand();
		g2.parent();
	    g2.child();
		
		
	
	}

}
