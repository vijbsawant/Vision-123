package String;

public class Reverse_string {

	public static void main(String[] args) {
		String str = "I am using eclipse";
		System.out.println(str);
		String rev="";
		
		for(int i=str.length()-1; i>=0;i--) {
			rev+=str.charAt(i);
		}
		
		System.out.println(rev);
		
		System.out.println();
		
		String s1 = "I love to do tracking";
		System.out.println(s1);
		String reverse = new StringBuffer(s1).reverse().toString();
		System.out.println(reverse);
	}

	}


