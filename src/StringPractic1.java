
public class StringPractic1 {

	public static void main(String[] args) {
		
		String data="Pranav";
		
		char[] data1= {'P','r','a','n','a','v'};
		String data2=new String(data1);
		
		if(data.equals(data2))
		{
			System.out.println("String is same");
		}
		else
		{
			System.out.println("String is not same");
		}
		if(data.equalsIgnoreCase(data2))
		{
			System.out.println("String is same according to equals ignore case");
		}
		else
		{
			System.out.println("String is not same");
		}
		System.out.println(data.contentEquals(data2));
		System.out.println(data2.substring(1,2));
		

	}

}
