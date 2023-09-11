import java.util.Scanner;

public class Method_Square {
	  static double calculateRectangleArea(double length,double width) {
		  return length * width;
		  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the length of the rectangle: ");
        double length = sc.nextDouble();
        
        System.out.print("Enter the width of the rectangle: ");
        double width = sc.nextDouble();
        
        sc.close();
        
        double area = calculateRectangleArea(length, width);
        System.out.println("The area of the rectangle is: " + area);
        

	}

}
