
public class SubClass extends s
{ 
	
	
	static int b=2;
	
    public   void demo1() 
    {
    	
    	System.out.println(b);
    	System.out.println(c);
    } 
public static void main(String args[]) 
{ 
	SubClass s=new SubClass();
	s.demo1();
}
}
class s
{
	int c=4;
	 
}
