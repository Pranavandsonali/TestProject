import java.util.Scanner;

public class celsiustofahrenheit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please select your conversion prefrence press 1 for celsius to fahrenheit and 2 for fahrenheit to celsius");
		Scanner option=new Scanner(System.in);
		int inout=option.nextInt();
		
		double celcius;
		double fahrenheit;
		if(inout==1)
		{
			System.out.println("Enter celsius value");
			
			celcius=option.nextDouble();
			fahrenheit=((celcius*9/5) + 32);
			System.out.println("Output is " +fahrenheit);
			
			
		}
		else if(inout==2)
		{
			System.out.println("Enter fahrenheit value");
			fahrenheit=option.nextDouble();
			celcius=((fahrenheit-32)*5/9);
			System.out.println("Output is " +celcius);
		}
		else
		{
			System.out.println("enter valid input");
		}

	}

}
