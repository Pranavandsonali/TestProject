import java.util.HashSet;
import java.util.Iterator;

public class hashset1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("d");
		//System.out.println(hs);
		
		HashSet<String> hs2=new HashSet<String>();
		hs2.add("a");
		hs2.add("b");
		hs2.add("g");
		hs2.add("f");
		//hs.retainAll(hs2);
		System.out.println(hs.hashCode());
		//hs.addAll(hs2);
		System.out.println(hs);
		//hs.removeAll(hs2);
		/*for(Object s:hs)
		{
			//System.out.println(s);
		}
		
		Iterator it=hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		*/
	}

}
