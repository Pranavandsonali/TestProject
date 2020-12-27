import java.util.Random;

public class reverseword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data="Pranav chavan";
		char data1[]=data.toCharArray();
		String rev="";
		for(int i=data1.length-1;i>=0;i--)
		{
			rev=rev+data1[i];
				
		}
		Random r=new Random();
		System.out.print(rev);
		System.out.println("");
		
	}

}
