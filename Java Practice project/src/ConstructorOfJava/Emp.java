package ConstructorOfJava;

public class Emp {

	int empID;
	String empName;
	String empDept;
	
	
	//with args/ para constructor
	Emp(int id, String name, String dept){		
		empID=id;
		empName=name;
		empDept=dept;
	}
	
	void display(){
		System.out.println(empID);
		System.out.println(empName);
		System.out.println(empDept);
	}
	
	public static void main(String[] args) {

		Emp obj=new Emp(101,"Ramesh","IT");
		obj.display();
		
		System.out.println();
		
		Emp obj2=new Emp(202, "Suresh", "QE");
		obj2.display();
	}

}

