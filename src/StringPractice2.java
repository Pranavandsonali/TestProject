
public class StringPractice2 
{
	
	public static void main(String[] args)
	{
	String data="Test";	
	Boolean a=data.endsWith("p");
	System.out.println(a);
	System.out.println(data.indexOf("e"));
	String replace=data.replace("Test", "Prnav Cahavan");
	System.out.println(replace);
	String[] ab=replace.split(" ");
	for(int i=0;i<ab.length;i++)
	{
		System.out.println(ab[i]);
	}
	}

}
