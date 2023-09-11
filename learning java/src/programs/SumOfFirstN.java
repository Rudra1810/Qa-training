package programs;
import java.util.Scanner;

public class SumOfFirstN {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter any number");
	int a=sc.nextInt();
	int result=(a*(a+1))/2;
	System.out.println(result);

	}

}
