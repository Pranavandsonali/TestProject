import java.util.Scanner;

public class equalstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        System.out.println("Enter multiplication range");
        int range = sc.nextInt();
        for(int i=1;i<=range;i++)
        {
        	System.out.println(number*i);
        	
        }
}
}
