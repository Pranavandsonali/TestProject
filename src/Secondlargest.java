
public class Secondlargest {
	static int first,second;
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		int array[]= {14,12,11,13};

		if(array[0]>array[1])
		{
			first=array[0];
			second=array[1];
		}
		else if(array[1]>array[0])
		{
			first=array[1];
			second=array[0];
		}
		
		for(int i=2;i<array.length;i++)
		{
			if(array[i]>first)
			{
				second=first;
				first=array[i];
			}
			else if(array[i]<first && array[i]>second)
			{
				second=array[i];
			}
		}
		System.out.println(first);
		
	}

}
