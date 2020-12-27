import java.util.Scanner;

public class ReverseSting {

	public static void main(String[] args) {
		
		System.out.println("Enter String to reverse");
		Scanner uinput=new Scanner(System.in);
		String Input=uinput.nextLine();
		/*char output;
		String a="";
		for(int i=Input.length()-1;i>=0;i--)
		{
		output=Input.charAt(i);
		a=a+output;
		}
		System.out.println(a);
		/*char array[];
		array=Input.toCharArray();
		for(int i=array.length-1;i>=0;i--)
		{
			System.out.println(array[i]);
		}*/
		char[] data=Input.toCharArray();
		String rev="";
		for(int i=data.length-1;i>=0;i--)
		{
			rev=rev+data[i];
		}
		System.out.println(rev);
		
		
	}

}
