package ConstructorOfJava;

		public class Animal {
			// Constructor:-
			// - it is a special member/ method of the class which is used to initialize the
			// state of an object

			// 1 default constructor
			// if programmer dose no add any constructor in his program then compiler adds
			// its own constructor

			// 2 user defined constructor
			// if programmer adds his own constructor is known as user defined constructor

			// rules to create user define constructor
			// 1- constructor name should be same as class name
			// 2 - constructor does not have any explicit return type hens its does not
			// return any value

			// 1 non Parameterizes constructor / no arguments constructor
			// 2 Parameterizes constructor / with arguments constructor
			
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			// default constructor
			//	Animal(){
			//		
			//	}
			
		
			// 1 no args/ non para constructor
			Animal(){
				System.out.println("Welcome to constructor");
			}

			Animal(int a, String n, String c){
				System.out.println("Non Parameterizes constr..");
			}
			
			int age;
			String name;
			String color;

			void display() {
				System.out.println(age);
				System.out.println(name);
				System.out.println(color);
			}

			public static void main(String[] args) {

				System.out.println("Start");
				Animal cat = new Animal();
				cat.age = 5;
				cat.name = "Tom";
				cat.color = "Blue";
				cat.display();

				System.out.println();

				Animal dog = new Animal();
				dog.age = 10;
				dog.name = "Doggy";
				dog.color = "White";
				dog.display();

			}

		}


	


