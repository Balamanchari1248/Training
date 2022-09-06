public class method{

   static void method1(){
	
	     System.out.println("static method");
	
	}
	
	void method2(){
	
	System.out.println("non static method");
	}


public static void main(String[] args){

method.method1();
method m=new method();
m.method2();

}
}