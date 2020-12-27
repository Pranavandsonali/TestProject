import java.util.Scanner;

public class removespacefromstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter String");
		Scanner sc=new Scanner(System.in);
		String data=sc.nextLine();
		sc.close();
		System.out.println("Output after removing space");
		String data1=data.replaceAll("\\s+", "");
		System.out.println(data1);
	}

}
