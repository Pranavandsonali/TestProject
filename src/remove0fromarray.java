import java.util.ArrayList;

public class remove0fromarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,0,2,0,5};
		ArrayList l1= new ArrayList();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				
			}
			else
			{
				l1.add(a[i]);
			}
			
		}
		System.out.println(l1);
		
	}

}
