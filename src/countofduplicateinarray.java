import java.util.HashMap;

public class countofduplicateinarray {

	public static void main(String[] args) {
		int[] a= {1,3,1};
		HashMap<Integer, Integer> hmp= new HashMap<Integer,Integer>();
		for(int i:a)
		{
			if(hmp.containsKey(i))
			{
				hmp.put(i,hmp.get(i)+1);
			}
			else
			{
				hmp.put(i, 1);
			}
		}
		System.out.println(hmp);
		

	}

}
