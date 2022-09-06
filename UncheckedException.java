package program17;

public class UncheckedException {

	public static void main(String[] args) {
	
		int num[]= {23,13,45,66,75};
		try {
		System.out.println(num[5]);
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Last line");
	}

}
