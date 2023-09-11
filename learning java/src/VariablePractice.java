
public class VariablePractice {
 
	 public static void main(String[] args) {
		 int integerone = 18;
		 int integertwo= integerone+ 2;
		 int a= 1,b=32,c=67;
		 int x,y,z;
		 x=y=z=10;
		 
		 System.out.println(integerone);
		 System.out.println(integertwo);
		 System.out.println(a+b+c);
		 System.out.println(x-y-z);
		 
		 boolean isJavaFun=true;
		 boolean isJavaFun2=false;
		 
		 System.out.println(isJavaFun);
		 System.out.println(isJavaFun2);
		 
		 char myGrade='A'; 
		 char maths='A',physics='b',java='A',bloodGroup='o';
		 
		 System.out.println(myGrade);
		 System.out.println("your grade in maths is "+maths);
		 System.out.println("your grade in maths is "+physics);
		 System.out.println("your grade in maths is "+java);
		 System.out.println("your bloodgroup is "+bloodGroup);
		 
		 int myint=9;
		 double mydouble =myint;
		 double mydouble1=9.87d;
		 int myint1= (int)mydouble1;
		 
		 System.out.println(mydouble);
		 System.out.println(myint1);
		 
		 String name="Rudra";
		 String intToString=Integer.toString(myint1);
		 
		 System.out.println(name);
		 System.out.println(intToString);
		 
		 int stringToInteger = Integer.parseInt(intToString);
		 System.out.println(stringToInteger);
	 }
}
