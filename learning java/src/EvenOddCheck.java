import java.util.Scanner;
import java.util.Scanner;
public class EvenOddCheck {

	public static void main(String[] args) {
		System.out.println("Even Odd Check");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
			
		if(a%2==0)
		{
		System.out.println("a is even");
		}
		else 
		{
		System.out.println("a is odd");
		}
	}
}
