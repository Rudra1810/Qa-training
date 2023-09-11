package Exercise;

public class Hello {
	void hello() {
		System.out.println("hello methos is non statia "
				+ "mathod \n so this is accessed by the object of a class");
	}
	
        static void show() {
        	System.out.println("show is this is static method");
        }
	    public static void main(String[] args) {
		show();
		System.out.println("hello");
		Hello obj=new Hello();
		obj.hello();
	   }

}
