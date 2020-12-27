import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Equalityoftwoarray {

	public static void main(String[] args) 
	{
		String[] data1= {"A","B","C"};
		String[] data2= {"A","B","C","S"};
		Integer[] data3= {1,2,3};
		
		ArrayList<String> list1= new ArrayList<String>(Arrays.asList(data1));
		ArrayList<String> list2= new ArrayList<String>(Arrays.asList(data1));
		ArrayList<Integer> list3= new ArrayList<Integer>(Arrays.asList(data3));
		
		if(list1.equals(list2))
		{
			System.out.println("Array is identical" );
			
		}
		else
		{
		System.out.println("Array is not same");
		
		
		}
}
}

