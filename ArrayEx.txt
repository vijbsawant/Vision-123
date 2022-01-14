package Array;

public class DemoofArray {

	public static void main(String[] args) {
		
				// array is a collection of smiler type of data
				// array is created by size
				// array works on index basis and first index is always 0

				// 1
				int[] arr = new int[7];

				arr[0] = 11;
				arr[1] = 12;
				arr[2] = 13;
				arr[3] = 14;
				arr[4] = 15;
				arr[5] = 16;
				arr[6] = 17;
				
				System.out.println("ARRAY OF LENGTH: ");
				System.out.println(arr.length);

				System.out.println();

				
				System.out.println(arr[0]);
				System.out.println(arr[0+1]);

				System.out.println();

				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);
				}
				
				System.out.println();

				// 2
				String[] name = { "A","B","C","D","E"};
				
				System.out.println("NAME OF LENGTH: ");

				System.out.println(name.length);

				System.out.println();
				
				for (int i = 0; i < name.length; i++) 
					System.out.println(name[i]);
				

				//REVERSE ORDER
				
				System.out.println(); 
				
				System.out.println("REVERSE ORDER: ");
				for (int k = name.length - 1; k>= 0; k--) {
					
					System.out.println(name[k]);
				}
			
		}
	}


