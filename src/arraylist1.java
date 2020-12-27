import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class arraylist1 
{

	public static void main(String[] args) {
		
		ArrayList ar=new ArrayList();
		ar.add("A");
		ar.add("A");
		ar.add("C");
		ar.add("D");
		
		HashSet hs=new HashSet();
		
		for(Object s:ar)
		{
			hs.add(s);
		}
		ar.clear();
		
		for(Object s:hs)
		{
			ar.add(s);
		}
		
		System.out.println(ar);

	}

}

