
public class sumofnumbers {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number=111;
		int ans=0;
		int copy;
		while(number>0)	
		{
			copy=number%10;
			ans=ans+copy;
			number=number/10;
		}
		System.out.println(ans);
		
	}

}
