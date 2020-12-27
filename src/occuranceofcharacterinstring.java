import java.util.Arrays;

public class occuranceofcharacterinstring {

	public static void main(String[] args) {
		
		String data="pppp";
		char[] data1=data.toCharArray();
		//String[] data2= {"a","b"};
		int count=0;
		for(int i=0;i<data1.length;i++)
		{
			for(int j=i+1;j<data1.length;j++) 
			{
				if(data1[i]==data1[j])
				{
					count++;
					
					System.out.println("Max occurance is " +data1[i]+ " and count " +count);	
					break;
				}
				
			}
			
		}
		
		
		

	}

}
