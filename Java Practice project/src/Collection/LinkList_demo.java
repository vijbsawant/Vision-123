package Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkList_demo {

	public static void main(String[] args) {
	
		List l1 =new LinkedList();
		
		l1.add("welcome to");
		l1.add(2);
		l1.add("Mirjapur");
		l1.add(2.2);
		l1.add(null);
		l1.add("Mirjapur");
		l1.add(5, 'A');// ask about to sir
		
		System.out.println(l1.size());
		System.out.println();
		System.out.println(l1.get(3));
		System.out.println();
		
		for (int i = 0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		
		System.out.println(l1);//before remove method
		
		Object ele = l1.remove(1);
		System.out.println(ele.toString());
		
		System.out.println(l1);//after remove method
		
		//int arr[]= {2, 4};
		//System.out.println(arr);
	}

}
