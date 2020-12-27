import java.util.Scanner;

public class oddoreven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter data ");
		Scanner sc=new Scanner(System.in);
		int  data=sc.nextInt();
		
		
		if(data%2==0)
		{
			System.out.println("number is even");
		}
		else
		{
			System.out.println("number is odd");
		}
	}

}
