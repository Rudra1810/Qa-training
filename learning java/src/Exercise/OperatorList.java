package Exercise;
import java.util.Scanner;
public class OperatorList {

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
	//Comparison Expressions
	boolean isTrue=a>b;
	boolean isFalse=a<b;
	boolean isEqual=a==b;
	//Logical Expressions
	boolean logicalAnd=a>b&&a<b;
	boolean logicalOr=a>b||a<b;
	boolean logicalNot=!(a>b&&a<b);
	//Assignment Expressions
    int x=5;
    int y=x+3;
    //Method Call Expressions
    String str="Rudra";
    int length = str.length(); 
    double sqrtValue = Math.sqrt(25.0); 

	
	
	System.out.println("the sum of a and b is "+sum);
	System.out.println(difference);
	System.out.println(multiplication);
	System.out.println(division);
	System.out.println(modulo);
	System.out.println(isTrue);
	System.out.println(isFalse);
	System.out.println(isEqual);
	System.out.println(logicalAnd);
	System.out.println(logicalOr);
	System.out.println(logicalNot);
	System.out.println(x);
	System.out.println(y);
	System.out.println(str);
	System.out.println(length);
	System.out.println(sqrtValue);
	
	
	
	
}
}                   


