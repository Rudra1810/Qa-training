
public class SingleInheritance//super class
{
int marks;String name;
protected char grade;

void input() {
	System.out.println("enter marks name grade");
}
}

class Rudra extends SingleInheritance//subclass
{
	void show() {
		int marks=100;
		String name="Rudra";
		char grade='A';
		System.out.println(marks+" "+name+" "+grade);
	}
	public static void main(String[] args) {
		
		
		Rudra sc =new Rudra();
		sc.input();
		sc.show();
	}
	}
