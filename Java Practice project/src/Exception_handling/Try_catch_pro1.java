package Exception_handling;

public class Try_catch_pro1 {

	public static void main(String[] args) {
		
		System.out.println("Began");
		//int a = 11;
		//int b = 0;
		int arr[]= {};
		
		try {
			//System.out.println(a / b);
			arr[1]=10;
		}
		catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj);
			System.out.println("first block");
		}
		catch (RuntimeException e) {
			System.out.println(e);
			System.out.println("second bolock");
		}
		catch(Exception r) {
			System.out.println(r);
		}
		System.out.println("End");

	}

}
