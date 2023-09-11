import java.util.Scanner;
public class UserinputAndIfElse {

	public static void main(String[] args) {
		
		Scanner userInput=new Scanner(System.in);
		System.out.println("enter your favourite number");
               if(userInput.hasNextInt()) {
            	   int numEntered=userInput.nextInt();
            	   System.out.println("you enered "+ numEntered);
               }
               else {
            	   System.out.println("enter number next time");
               }
	}

}
