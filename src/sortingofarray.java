import java.util.Arrays;
import java.util.Scanner;

public class sortingofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter String to sort");
		Scanner uinput=new Scanner(System.in);
		String Input="a c b";
		Input.replaceAll("\\s+", "");
		char a[]=Input.toCharArray();
		
		
		Arrays.sort(a);
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
