
public class duplicateinarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int[] a= {1,2,1,2,3};
		String[] strArray = {"Java", "JSP","JSP"};
		int count=1;
		for(int i=0;i<strArray.length;i++)
		{
			for(int j=i+1;j<strArray.length;j++)
			{
				if(strArray[i]==strArray[j])
				{
				count++;
				System.out.println("Dupllicate elements is " +strArray[i]+" count " +count);
				}
			}
		}
		if(count==1)
		{
				System.out.println("No duplicate");
		}
	}

}
