package Collection;

import java.util.Vector;

public class Vectors {

	public static void main(String[] args) {
		//TODO Auto-generated method stub
			
		Vector v =new Vector();
		
		v.add(2021);
		v.add("Vision");
		v.add(9);		
		v.add("Sep Batch");
		v.add(2021);
		
		System.out.println(v.size());
		System.out.println(v.get(3));
		System.out.println(v);//before remove
		System.out.println();
		
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
			System.out.println();
			Object var = v.remove(2);
			System.out.println(var.toString());
			System.out.println();
			System.out.println(v);//after remove
	}

	
}
