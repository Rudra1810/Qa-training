package Oop;
class ConstructorExample{
	int a;
	String s;
	ConstructorExample(){
		a=10;
		s="java";
	}
	void show() {
		System.out.println(a+" "+s);
	}
}
public class Constructor {

	public static void main(String[] args) {
		ConstructorExample ref=new ConstructorExample();
		ref.show();

	}

}
