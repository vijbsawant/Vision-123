package StringsDemo;

		public class Stringmethods {

			public static void main(String[] args) {

				String s1 = "Vision";
				String s2 = "welcome";
				String s3 = "VISION";
				String s4 = "";

				String s5 = "I am learning java program";
				String s6 = "  ";

				// length(); // int

				System.out.println(s1.length());
				int len = s5.length();
				System.out.println(len);

				// .charAt(int index); char

				System.out.println(s5.charAt(2));
				char ch = s5.charAt(25);
				System.out.println(ch);

				// indexOf('char') // int

				System.out.println(s5.indexOf('j'));
				int ind = s5.indexOf('v');
				System.out.println(ind);

				// lastindexOf() int

				System.out.println(s5.lastIndexOf('m'));
				System.out.println(s5.lastIndexOf('a'));
		  
				// isEmpthy boolean

				System.out.println(s1.isEmpty());//false
				System.out.println(s4.isEmpty());//true
				System.out.println(s6.isEmpty());//false
				 
				// toUpperCase(); string
				
				System.out.println(s2.toUpperCase());
				
				//tolowerCase() string
				
				System.out.println(s3.toLowerCase());
				
				// equalsIgnoreCase
				
				System.out.println(s1.equals(s3));
				System.out.println(s1.equalsIgnoreCase(s3));
				
				String s7="Vision";
				// compairTo() int true =0   false -1
				System.out.println(s1.compareTo(s7));
				
				System.out.println();
				//split()  string []
				
				String[] allStr = s5.split(" ");
				for(int i=0; i<allStr.length;i++)
				System.out.println(allStr[i]);
				
				//trim()  delete white spaces string
				
				String s8 = "        Java         ";
				System.out.println(s8);
				System.out.println(s8.trim());
			}
		

	}


