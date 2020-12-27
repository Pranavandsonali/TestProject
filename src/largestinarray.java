import java.util.ArrayList;
import java.util.Collections;

public class largestinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int array[]= {41,10,9};
		/*Using Loop
		int largestnumber=array[0];
		
		for(int i=0;i<=array.length-1;i++)
		{
			if(array[i]>largestnumber)
			{
				largestnumber=array[i];
				
			}
		}
		System.out.println(largestnumber);
		*/
		//-------usiing list------------
		int array[]= {41,10,9};
		ArrayList<Integer> list=new ArrayList<>();
		for(int a:array)
		{
			list.add(a);
		}
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list.get(1));
		
	}

}
