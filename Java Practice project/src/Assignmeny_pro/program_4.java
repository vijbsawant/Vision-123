package Assignmeny_pro;

public class program_4 {

	public static void main(String[] args) {

			
		
			int space=3;
			int star=1;
			for (int i = 1; i <=5; i++) {
				for (int j = 1; j <=space; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <=star; j++) {
					System.out.print("*");
				}
				System.out.println();
				
				
				if(i<3) 
				{
					space--;
					star=star+2;
				}
				else {
					space++;
					star=star-2;
				}
				
				
			}
			
	}

}
/*	
     *
    ***
   *****
    ***
     *
  */
