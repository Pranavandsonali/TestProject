import java.util.Scanner;

public class whitespace {

	public static void main(String[] args) 
	{
		System.out.println("Enter String to reverse");
		Scanner uinput=new Scanner(System.in);
		String Input=uinput.nextLine();
		String i=Input.replaceAll("\\s+","");
		System.out.println(i);
	}

}
