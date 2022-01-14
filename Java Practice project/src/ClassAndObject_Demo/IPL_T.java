package ClassAndObject_Demo;

public class IPL_T
{
	
	String  captainname;
	String teamname;
	int age;
	public static void main(String[] args) 
	{
		IPL_T IPL= new IPL_T();
		
		IPL.teamname="CSK";
		IPL.captainname="Mahendra Singh Dhoni";
		IPL.age=40;
				
		System.out.println(IPL.teamname);
		System.out.println("Cap is " + IPL.captainname);
		System.out.println("Age is " + IPL.age);
		
		System.out.println();
		
		IPL.teamname="RCB";
		IPL.captainname="Virat Kohali";
		IPL.age=32;
		
		System.out.println(IPL.teamname);
		System.out.println("Cap is " + IPL.captainname);
		System.out.println("Age is " + IPL.age);
		
		System.out.println();
		
		IPL.teamname="MU";
		IPL.captainname="Rohit Sharma";
		IPL.age=34;
		
		System.out.println(IPL.teamname);
		System.out.println("Cap is " + IPL.captainname);
		System.out.println("Age is " + IPL.age);
		
		System.out.println();
		
		IPL.teamname="SRH";
		IPL.captainname="Kane Williamson";
		IPL.age=31;
		
		System.out.println(IPL.teamname);
		System.out.println("Cap is " + IPL.captainname);
		System.out.println("Age is " + IPL.age);
		
		System.out.println();
		
		IPL.teamname="PK";
		IPL.captainname="KL Rahul";
		IPL.age=29;
		
		System.out.println(IPL.teamname);
		System.out.println("Cap is " + IPL.captainname);	
		System.out.println("Age is " + IPL.age);
	}
	
}

