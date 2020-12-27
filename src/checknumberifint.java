
public class checknumberifint {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		checknumber("pranav");

	}
	
	static boolean checknumber(String s)
	{
		try
		{
			Integer.parseInt(s);
		}
		catch(Exception e)
		{
			//return false;
			e.printStackTrace();
		}
		return true;
		
	}

}
