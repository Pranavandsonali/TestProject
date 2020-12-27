import java.util.Arrays;
import java.util.Collections;

public class reversearray {

	public static void main(String[] args) {
		Integer[] a= {5,2,3,4,1};
		
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));

	}

}
