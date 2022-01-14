package ThisandSuper;

public class Child extends Parent {
      int age=25;
      
      
      Child() {
    	  super();
    	  System.out.println("child constructor");
      }
      
      
        void m2 (){
        	System.out.println();
        	System.out.println(super.age);
        	System.out.println(super.name);
        	
        	super.m1();
        }
      
     public static void main(String[] args) {
		
    	Child obj = new Child(); 
    	 
    	 System.out.println(obj.age);
    	 
    	 obj.m2();
    	 
    	 
	}
}
