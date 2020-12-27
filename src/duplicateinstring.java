import java.util.HashMap;

public class duplicateinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="aba";
		char a[]=data.toCharArray();
		HashMap<Character,Integer> hp=new HashMap();
		
		for(int i=0;i<a.length;i++)
		{
			if(hp.containsKey(a[i]))
			{
				hp.put(a[i], hp.get(a[i])+1);
			}
			else
			{
				hp.put(a[i],1);
			}
		}
		System.out.println(hp);
	}

}
