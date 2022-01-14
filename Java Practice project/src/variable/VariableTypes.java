package variable;

public class VariableTypes {

		
		//instance variable or global variable
		
		int age=10;
		
		//static variable or class variable
		
		static String name="Java";
		

		public static void main(String[] args) {
			//it is peace of memory which holds the value
			
			//there are 3 types of variable
			
			//1 local: presently work for method, particular for that method 
			
			//2 instance or global: is through out the program,
			
			//3 static variable: through out program we can call st.variable; no need of object
			
			System.out.println("START");
			//local variable
			int abc=30;
			System.out.println(abc);
			
            System.out.println(abc+15);
			
             abc=90;
            
            System.out.println(abc/2);
			
            VariableTypes obj=new VariableTypes();
            
            System.out.println("Age is = "+obj.age);
            
            obj.display();
            
            System.out.println(name);
            
            System.out.println("END");
            
            
		}

		void display() {
			
			System.out.println("Display method");
			
			int lmp=100;
			
			System.out.println(lmp);
			
			System.out.println(age);
			
			System.out.println(name);
			
			
		
		}
		
}


