package Exception_handling;

public class Try_catch_finally_pro {

	public static void main(String[] args) 
		 {
				demoReturn();
			}

			static String demoReturn() {
				int a = 00;
				int b = 0;
				System.out.println("Began");
				try {
					System.out.println(a / b);
				} catch (RuntimeException e) {
					System.out.println(e);
					//System.exit(0);
				} finally {
					System.out.println("At any condition print me...!");
					System.out.println("Don't mess with me..");
					System.out.println("you can stop me using exit() method...!");
				}
				
				System.out.println("End");
				return "";

	}

}
