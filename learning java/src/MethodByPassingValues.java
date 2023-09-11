public class MethodByPassingValues {
	 public static int calculateSum(int a, int b) {
	        return a + b;
	    }
	public static void main(String[] args) {
		int num1 = 30;
        int num2 = 10;
        // Call the method and store the result
        int sum = calculateSum(num1, num2);
   
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
	}
}
