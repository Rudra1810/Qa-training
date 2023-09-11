package Exercise;

public class TypesOfVariables {
        int b=10;  //instance variable
        static int c=20; //static variable  
	public static void main(String[] args) {
		int a=30; //local variable
          System.out.println(a); //local variables are accessed directly
          System.out.println(TypesOfVariables.c); //static variables are accessed using class
          TypesOfVariables ref=new TypesOfVariables();
          System.out.println(ref.b);//instance variables are accessed with reference of class
	}

}
