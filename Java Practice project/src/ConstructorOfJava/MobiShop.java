package ConstructorOfJava;

public class MobiShop {

		
		String mobname;
		String mobmodel;
		int mobprice;
		
		
		
		MobiShop( String name, String Model, int Price) {		
			mobmodel = Model;
			mobname = name;
			mobprice = Price;
		}
		
		void display(){
			System.out.println(mobname);
			
			System.out.println(mobmodel);
			
			System.out.println(mobprice);
		}
		
		public static void main(String[] args) {
			
			System.out.println("Parameterizes constructor/argu :-");

			System.out.println();
			
			MobiShop obj=new MobiShop("APPLE","WATCH", 21999);
			obj.display();
			
			System.out.println();
			
			MobiShop obj1=new MobiShop("APPLE","MINI", 55499);
			obj1.display();
			
			System.out.println();
			MobiShop obj2=new MobiShop("APPLE","MACBOOK", 89999);
			obj2.display();
			
			System.out.println();
		}

	}


