package Exception_handling;

public class Unchecked_excep {

	public static void main(String[] args) {
		System.out.println("Began");
		
		int a=1;
		int b=0;
		
		int c=a/b;//unchecked exception
		System.out.println(c);
		System.out.println("End");

	}

}
