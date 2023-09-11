import java.util.Scanner;
public class ArithmaticOperatorExcersice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first number ");
		int a = sc.nextInt();
		System.out.println("enter the second number");
		int b = sc.nextInt();
		int sum= a+b;
		System.out.println("the sum is "+sum);
		int difference=a-b;
		System.out.println("the difference is "+difference);
		int multiplication=a*b;
		System.out.println("the multiplication is "+multiplication);
		float division=a/b;
		System.out.println("the division is "+division);
		int modulo=a%b;
		System.out.println("the modulo is "+modulo);
		int decereament=--a;
		System.out.println("the decereament on a is "+decereament);		
		int increament=++b;
		System.out.println("the increament on b is "+increament);
		a+=5;
		System.out.println("number we get by applying +5= operation on a"+a);
		b-=1;
		System.out.println("number we get by applying -1= operation on b"+b);
		}
}
