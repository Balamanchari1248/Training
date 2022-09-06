package program17;

public class RuntimeException {

	public static void main(String[] args) {
		
		int a=14,b=0,c;
		try {
		c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		finally {
			System.out.println("Values can not divided by 0");
		}
	}
	

}
