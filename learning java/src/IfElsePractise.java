import java.util.Scanner;
public class IfElsePractise {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your age");
		int age= sc.nextInt();
		if(age>=0 && age<16) {
			System.out.println("You can not drive vehicle");
		}
		else if(age>=16 && age<18 ) {
			System.out.println("You can drive only gearless vehicles");
		}
		else{
			System.out.println("You can drive any kind of vehicle if yoy have licence");
		}

	}

}
