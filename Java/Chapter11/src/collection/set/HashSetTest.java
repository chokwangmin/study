package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {


		
		HashSet<String> set = new HashSet<String>();
				set.add("이순신");
				set.add("김유신");
				set.add("유관순");
				set.add("이순신");
								
				System.out.println(set);
				
//			for(String a : set) {
//				System.out.println(a);
//			}
				Iterator<String> ir = set.iterator();
				
				while(ir.hasNext()) {
					String s = ir.next();
					System.out.println(s);
				}
	
			
	} 

}
