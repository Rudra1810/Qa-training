package Exercise;
import java.util.Scanner;
public class ArthmaticOperator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("print the first number");
	int a=sc.nextInt();
	System.out.println("print the second number");
	int b=sc.nextInt();
	//arithmatic operators
	int sum=a+b;
	int difference=a-b;
	int multiplication=a*b;
	int division=(int)a/b;
	int modulo=a%b;
	System.out.println("the sum of a and b is "+sum);
	System.out.println("the difference of a and b is "+difference);
	System.out.println("the multiplication of a and b is "+multiplication);
	System.out.println("the division of a and b is "+division);
	System.out.println("the modulo of a and b is "+modulo);
	
	
	
	
	
}
}                   


