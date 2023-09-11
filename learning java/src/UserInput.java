import java.util.Scanner;
public class UserInput {

	public static void main(String[] args) {
		System.out.println("user input example");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		
		int sum = a+ b;
		System.out.println("sum so two number is ");
		System.out.println(sum);	
	}
}
