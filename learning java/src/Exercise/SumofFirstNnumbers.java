package Exercise;
import java.util.Scanner;
public class SumofFirstNnumbers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of term you want to add");
	int n=sc.nextInt();
	int sum=0;
	for (int i=1;i<=n;i++) {
		sum=sum+i;
	}
        System.out.println(sum);
	}

}
