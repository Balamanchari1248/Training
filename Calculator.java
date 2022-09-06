package Training;

import java.util.Scanner;

import Test.Modulous;

class Calculator extends Modulous implements Inteface1,Interface2 {

	@Override
	public int addition(int a, int b) {
	
		return a+b;
	}

	@Override
	public int subtraction(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}
	
	@Override
	public int multiplication(int a, int b) {
		// TODO Auto-generated method stub
   		return a*b;
	}

	@Override
	public int division(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value: ");
		int a=sc.nextInt();
		
		System.out.println("Enter b value: ");
		int b=sc.nextInt();
		Inteface1 c= new Calculator();
		
		System.out.println("add: "+c.addition(a,b));
		System.out.println("sub: "+c.subtraction(a,b));
		Interface2 c1=new Calculator();
		System.out.println("mul: "+c1.multiplication(a,b));
		System.out.println("div: "+c1.division(a,b));
		Modulous mod=new Calculator();
		mod.display(a,b);
	}

	@Override
	public void display(int a,int b) {
		System.out.println("mod:"+(a%b));
	}


	

}