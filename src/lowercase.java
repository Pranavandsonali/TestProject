import java.util.Scanner;

public class lowercase {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter data");
		Scanner uinput=new Scanner(System.in);
		String data=uinput.nextLine();
		String a=lower(data);
		System.out.println(lower(data));
			
	}
	public static String lower(String str)
	{
		return str.toLowerCase();
	}

}
