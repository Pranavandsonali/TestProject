class overridding1
{
	int a=1;
	public void show ()
	{
		System.out.println(a);
	}
	public void display ()
	{
		System.out.println("Hello");
	}
}


public class overridding extends overridding1 
{
	static int a=2;
	public static void main(String[] args) 
	{		
		overridding o1=new overridding();
		o1.show();
		o1.display();
	}
	public void show()
	{
		System.out.println("Hey");
	}

}
