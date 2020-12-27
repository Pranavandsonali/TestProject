import java.util.Scanner;

public class pyramid {

	public static void main(String[] args) {
		
		System.out.println("Enter no of rows for pyramid");
		Scanner sc=new Scanner(System.in);
		int noofrow=sc.nextInt();
		
		for(int i=noofrow;i>0;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.println(" ");
			}
			
			for(int j=1;j<noofrow;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
			
			
		}
		
				
		

	}

}
