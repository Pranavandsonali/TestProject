public class sai extends sai1 
{
	static int age=30;
	public static void main(String[] args) 
	{
		sai s=new sai();
		
		s.age();
	}
	public  void age()
	{
		System.out.println(age);
		String a="pranav";
		String b="chavaan";
		System.out.println(a.concat(" "+b));
		System.out.println(a.compareTo(b));
	}
}	

class sai1
{
	int age=20;
}
