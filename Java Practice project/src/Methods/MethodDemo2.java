package Methods;

public class MethodDemo2{

			// returnType methodName(){}

			static int add(int a, int b) {
			 int c = a + b;
				return a + b;
			}

			static String fullName(String fName, String lName) {
				return fName + " " + lName;
			}

			int avg(int a, int b) {
				int d = (a + b) / 5;
				return d;
			}

			public static void main(String[] args) {
				int sum = 1;
				
				System.out.println(sum);

				sum = add(80, 20);
				
				System.out.println();

				System.out.println(sum);
				
				System.out.println();

				String str = fullName("Arav", "Jaju");
				System.out.println(str);
				
				System.out.println();

				System.out.println(fullName("Mona", "Patil"));
				
				System.out.println();
				
				System.out.println(add(10, 50));
				
				System.out.println();

				MethodDemo2 obj = new MethodDemo2();
				int pqr = obj.avg(100, 100);
				System.out.println("Avarage is =" + pqr);

			}
	}


