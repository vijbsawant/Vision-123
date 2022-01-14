package ClassAndObject_Demo;

public class Classreport {
			
	static int std =1;
	int tme =10;
	String sub="Math";
	
	static String teacherName ="RK sir";
	
	public static void main(String[] args) {
		
		Classreport obj= new Classreport();
		
				System.out.println(std + "nd class");
				System.out.println("1st lec start at "+ obj.tme +" am");
				System.out.println(obj.sub);
				System.out.println(teacherName);
			
				System.out.println();
				
				Classreport obj1= new Classreport();
				
				System.out.println(std + "nd class");
				obj1.tme=11;
				System.out.println("2nd lec start at "+ obj1.tme +" am");
				obj1.sub="Science";
				System.out.println(obj1.sub);
				obj.teacherName="RV mam";
				System.out.println(teacherName);
				System.out.println();
				
				System.out.println();
				
				Classreport obj2= new Classreport();
				
				System.out.println(std + "nd class");
				obj2.tme=12;
				System.out.println("lunch time at "+ obj2.tme+" pm");
				System.out.println("Sharing is caring..!");
				
		
		
		
	}
			
}

		

	

	


