import java.util.Arrays;
import java.util.Scanner;

public class arrayprac {

	public static void main(String[] args) 
	{
	
		int array[]= {9,8,6};
		int sum=0;
		System.out.println(Arrays.toString(array));
		System.out.println("Enter number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=0;i<=array.length-1;i++)
		{
			for(int j=i+1;j<=array.length-1;j++)
			{
				sum=array[i]+array[j];
				if(sum>a)
				{
					System.out.println("Pair " +array[i]+ " and " +array[j]+ " has sum >" +a+ "");					
				}
				
			}
			
		}
		

	}

}
