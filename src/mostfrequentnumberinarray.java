import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class mostfrequentnumberinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a= {1,2,3,3,1,1};
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		
		for(int i:a)
		{
			if(hm.containsKey(i))
			{
				hm.put(i, hm.get(i)+1);
			}
			else
			{
				hm.put(i, 1);
			}
		}
		System.out.println(hm);
		int b=Collections.max(hm.values());
		//System.out.println(hm.k);
		for(Entry<Integer, Integer> entry: hm.entrySet()) {

		      // if give value is equal to value from entry
		      // print the corresponding key
		      if(entry.getValue() == b) {
		        System.out.println("The key for value " + b + " is " + entry.getKey());
		        break;
		      }
		
	}
	}}
