import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {
//2WSX1q
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		@SuppressWarnings("rawtypes")
		ArrayList al1=new ArrayList();
		al1.ensureCapacity(2);
		
		//to add elements//
		al1.add("1");
		al1.add("2");
		al1.add("3");
		
		ArrayList al2=new ArrayList();
		al2.add("5");
		al2.add("6");
		al2.add("7");
		al2.add("1");
		
		//al1.addAll(al2);
		//al1.removeAll(al2);
		
		System.out.println(al1);
		al1.trimToSize();
		System.out.println(al1);
		//sort list in decending order// 
		/*Collections.sort(al1,Collections.reverseOrder());
		*/
		
		for(Object s:al1)
		{
			//System.out.println(s);
		}
		if(al1.contains(4))
		{
			//System.out.println("Same");
		}
		else
		{
			//System.out.println("not Same");
		}
		//ListIterator<Integer> it=al1.listIterator(6);
		


	}

}
