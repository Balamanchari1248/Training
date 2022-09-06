package Task;

import Training.Encapsulation;

public class calculator extends Abstract implements Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Interface c1=new calculator();
		Encapsulation1 n=new Encapsulation1();
		n.setA(10);
		n.setB(20);
		c1.add(n.getA(),n.getB());
		c1.sub(n.getA(),n.getB());
		c1.mul(n.getA(),n.getB());
		c1.div(n.getA(),n.getB());
		
		Abstract mod=new calculator();
		mod.modulous(10,20);
	
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b);
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a-b);
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a*b);
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a/b);
		return a/b;
	}

	@Override
	public int modulous(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a%b);
		return a%b;
	}

	

	

	

}
