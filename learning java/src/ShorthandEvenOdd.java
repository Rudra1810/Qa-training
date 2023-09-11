import java.util.Scanner;

public class ShorthandEvenOdd {

	public static void main(String[] args) {
		System.out.println("Even Odd Check");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int a = sc.nextInt();
		
		String result;
	    result = (a%2==0) ? "a is even" : "a is odd";
	    System.out.println(result);
		
	


	}

}
