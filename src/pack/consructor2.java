package pack;

public class consructor2 extends  constructor3
{

	public void getdata(int no,String name)
	{
		System.out.println(" Name is " +name+ " Number is " +no);
	}
	public static void main(String[] args) 
	{
		consructor2 c=new consructor2();
		c.getdata(1, "Pranav");
		
		
	}

}
abstract class constructor3
{
	int rolenumber;
	String name;
	constructor3()
	{
		System.out.println("Test");
	}
	
	
	
}
