package program17;

public class Exception1 {

	public static void main(String[] args) {
		try {
            Object[] array = new String[2];
            array[0] = 5;
        } 
		catch (ArrayStoreException e) 
		{
          e.printStackTrace();
        }
        System.out.println(" execution will continue");

	}

}
