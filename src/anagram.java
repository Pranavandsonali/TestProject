import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String data="pranav";
		String data1="vanarp";
		char[] data2= data.toCharArray();
		char[] data3= data1.toCharArray();
		
		Arrays.sort(data2);
		Arrays.sort(data3);
		System.out.println(Arrays.toString(data2));
		System.out.println(Arrays.toString(data3));
		System.out.println(Arrays.equals(data3, data2));
		
	}

}
