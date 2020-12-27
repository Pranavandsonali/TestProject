import java.security.cert.CollectionCertStoreParameters;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "a");
		hm.put(2, "b");
		hm.put(3, "c");
		hm.put(4, "c");
		hm.put(5, "c");
		//HashMap <Integer,String> hm2=new HashMap<Integer,String>();
		hm.putIfAbsent(6, "a");
		//System.out.println("Values from HashMap" +hm);
		//System.out.println("Values from HashMap2 " +hm2.get(6));
		//int i=Collections.max(hm.keySet());
		//System.out.println(i);
		
		/*Set s= hm.keySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Object key=it.next();
			System.out.println(""+key+":"+hm.get(key));
		}
		*/
		
		System.out.println("---------------After Adding------------------");
		Set<Entry<Integer, String>> entrySet = hm.entrySet();
        
        for (Entry<Integer, String> entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        hm.remove(6, "e");
        System.out.println("---------------After removing------------------");
        for (Entry<Integer, String> entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("---------------After replace------------------");
        hm.replace(6, "e");
        for (Entry<Integer, String> entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("---------------After replace------------------");
        hm.replace(6, "e", "a");
        for (Entry<Integer, String> entry : entrySet) 
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
	}
}