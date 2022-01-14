package String;

public class Rev_SeprateString {

	public static void main(String[] args) {
		
		String str = "Hello everyone welcome to vision classe";
		
		//Spilt the string
		
		String [] all = str.split(" ");
		System.out.println(all.length);
		
		for (String s:all) {
			System.out.println(s);
			
		}
		System.out.println();
		
		//Reverse the whole string
		
		String rev = "";
		
		
		for (int i = 0; i < all.length; i++){
			
			String temp = "";
			
			for (int j= all[i].length() - 1; j >= 0; j--) {
			
				temp += all[i].charAt(j);
			}
			
			rev += temp + " ";
		}
		System.out.println(str);
		System.out.println(rev);
		
		
	}	

}
