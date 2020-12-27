class A
{
	public void show() 
	{
	System.out.println("class A");	
	}
}
class B
{
	public void show() 
	{
		System.out.println("class B");
	}
}
public class C  extends A{

	public static void main(String[] args) 
	{
		A a=new C();
		a.show();

	}
	public void show() 
	{
	System.out.println("class C");	
	}

}
