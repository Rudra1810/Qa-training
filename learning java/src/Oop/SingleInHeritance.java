package Oop;

class SingleInHeritance {
int rollnumber;String fname;String lname;
void input() {
	System.out.println("enter rollnumber fname lname");
}
}

class Rudra extends SingleInHeritance{
	void show() {
		int rollnumber=4;String fname="Rudra";String lname="Bhatiya";
		System.out.println(rollnumber+" "+fname+" "+lname);
		}
		public static void main(String[] args) {
			Rudra ref=new Rudra();
			ref.input();
			ref.show();

		}
	}

