import java.util.Scanner;
public class ArithmaticOperaton {

	public static void main(String[] args) {
		System.out.println("Arithmatic Operation example,pleace enter a>b");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the first number");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		
		int sum = a + b;
		int difference = a - b;
		int multiplication = a*b;
		double division = a/b;
		int div = (int) division;
		int modulo = a%b;
		
		System.out.println("the sum is " + sum);
		System.out.println("the difference is " + difference);
		System.out.println("the multiplication is " + multiplication);
		System.out.println("the division is " + div);
		System.out.println("the modulo is " + modulo);
		System.out.println("the increament on a is "+ ++a);
		System.out.println("the decrement on a is " + --a);
	}
}
