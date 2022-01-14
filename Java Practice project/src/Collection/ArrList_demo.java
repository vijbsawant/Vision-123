package Collection;

import java.util.ArrayList;
import java.util.List;

public class ArrList_demo {

	
	public static void main(String[] args) {
		

		//List  a=new ArrayList();
				
				ArrayList a=new ArrayList();
				
				a.add(11);
				a.add("Veera");
				a.add("Oct");
				a.add(19.98);
				a.add(null);
				a.add("Risha");
				
				System.out.println(a.size());
				System.out.println(a.get(3));
				
				System.out.println();
				
				
				a.add(4, 2000);
				
				for(int i=0;i<a.size();i++) {
					System.out.println(a.get(i));
				}
				System.out.println();
				System.out.println(a);
	}
}
