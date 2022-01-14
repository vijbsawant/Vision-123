package Exception_handling;

public class Try_catch_pro {

	public static void main(String[] args) {
		
		// exception handling keywords

				

				System.out.println("Began");

				//int a = 11;
				//int b = 0;
				int[] arr = {};

				try {
					System.out.println("Try Block");
					//System.out.println(a/b);
					System.out.println("ERRoR");
					System.out.println(arr[0]);

				} catch (ArithmeticException obj) {
					// handling code

					//System.out.println(obj.getMessage());
					//b = 2;
					//System.out.println(a / b);
					//System.out.println();
				} 
				catch (ArrayIndexOutOfBoundsException array) {
					System.out.println(array);
				System.out.println("End");
				}

	}	

	}


