package Exercise;
import java.util.Scanner;
public class NumberClassification {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    char choice;
    do {
    	 System.out.println("enter any number");
         int a=sc.nextInt();
	     if(a<0) {
		     System.out.println("Your entered number is negative");
		    }
	     else if(a==0) {
		     System.out.println("Your entered number is zero");
		    }
         else{
		     System.out.println("Your entered number is positive");
		     }
		     System.out.print("Do you want to check another number? (y/n): ");
		     choice = sc.next().charAt(0);
	 }while(choice == 'y' || choice == 'Y');
		  System.out.println("Program ended.");
    }
}
        
