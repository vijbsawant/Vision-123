package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linked_hashset {

	public static void main(String[] args) {
		//Set lhs=new LinkedHashSet();
				LinkedHashSet lhs = new LinkedHashSet();

				lhs.add("Meera,s");
				lhs.add("25th");
				lhs.add("Birthday Bash");
				lhs.add("at " + 9.50);
				lhs.add(null);
				lhs.add("25th");
				lhs.add(null);

				System.out.println("Linked hash set only 1 null value be consider;; never accept duplicate value");
				
				System.out.println();
				
				System.out.println(lhs.size());
				
				System.out.println();
				
				Iterator itr = lhs.iterator();

				while (itr.hasNext()) {
					System.out.println(itr.next());
				}

				System.out.println();

				for (Object o : lhs) {
					if (o != null) {
						System.out.println(o.toString());
					}
				}

	}

}
