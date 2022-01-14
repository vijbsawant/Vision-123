package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Hash_set {

	public static void main(String[] args) {
		Set hs = new HashSet();
		hs.add(11);
		hs.add('Z');
		hs.add("Hash Set");
		hs.add(null);
		hs.add(99.99);
		hs.add(11);
		hs.add(null);
		
		System.out.println(hs.size());
		
		System.out.println("HAsh set only 1 null value be consider;; never accept duplicate value");
		
		System.out.println();
		
		
		Iterator itr = hs.iterator();
		
		//System.out.println(itr.hasNext());
		//System.out.println(itr.next());

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println();

		for (Object o : hs) {
			if (o != null) {
				System.out.println(o.toString());
			}
		}
				
	}

}
