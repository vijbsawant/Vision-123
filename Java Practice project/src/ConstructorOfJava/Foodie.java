package ConstructorOfJava;

public class Foodie {
	
	Foodie(){
		
		System.out.println();
		System.out.println("Welcome to FOODIE CORNER");
		System.out.println();
		System.out.println("Your Order sir/mam..!");
	} 
	Foodie(String n, String t, int qua){
	}
		String name;
		String type;
		int quantity;
		int tablenum;
		
		void display() {
		System.out.println(name);
		System.out.println(type);
		System.out.println(quantity);
		System.out.println(tablenum);
	
		}
	public static void main(String[] args) {
	
		System.out.println("Non parameterizes constructor/argu :-");
		
		Foodie Chinese = new Foodie();
		Chinese.name = "PaneerTikka";
		Chinese.type = "Spicy";
		Chinese.quantity =2;
		Chinese.tablenum =11;
		Chinese.display();
		
		System.out.println();
		
		
		Foodie SouthIndian = new Foodie();
		SouthIndian .name = "ButterCheeseMasalaDosa";
		SouthIndian .type = "Medium";
		SouthIndian .quantity =4;
		SouthIndian .tablenum =12;
		SouthIndian .display();
		
		
	}

}
