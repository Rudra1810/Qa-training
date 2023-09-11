import java.util.Scanner;

	
	public class UserInputStrings {

		public static void main(String[] args) {
			System.out.println("user input example");
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the firstname");
			String a = sc.nextLine();
			System.out.println("enter the Lastname");
			String b = sc.nextLine();
			
			String result= a+' '+b;
			System.out.println("Your Name is "+ result);
			
		}
	}