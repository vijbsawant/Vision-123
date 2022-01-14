package Collection;

import java.util.Set;
import java.util.TreeSet;

import java.util.Iterator;


public class Tree_set {

	public static void main(String[] args) {
	
		Set<String> ts = new TreeSet<String>();

		ts.add("A");
		ts.add("P");
		ts.add("E");
		ts.add("D");
		ts.add("M");
		ts.add("Z");
		ts.add("P");
		//ts.add(null);
		System.out.println("unable to add duplicate value ;;; strictly no entry for null value");
		
	Iterator<String> itr = ts.iterator();
	
		System.out.println(ts.size());
		System.out.println();
		
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
		System.out.println();
		//for (DataType var : collection /array)
		//{System.out.println(var);}

		for (String str : ts) {
			System.out.println(str);
		}

	}

}
