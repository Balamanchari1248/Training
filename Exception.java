package program17;

import javax.annotation.processing.FilerException;

public class Exception {

     int a=50,b=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
	    int c=50/0;
	    System.out.println(c);
    }
    catch(ArithmeticException e)
    {
    	System.out.println(e);
    }
    finally
    {
    	System.out.println("Arithmatic exception");
    }
    int h[]= {1,2,3,4,5};
    {
    	 try {
    		
    		 System.out.println(h[7]);
    	 }
    	 catch(ArrayIndexOutOfBoundsException e){
    		 e.printStackTrace();
    	 }
    	 finally {
    		 System.out.println("array indexbound of exception");
     }
    	 String g=null;
         
    	 try {
    		 System.out.println(g.length());
    	 }
    	 catch(NullPointerException e)
    	 {
    		e.printStackTrace(); 
    	 }
    	 finally {
    	 System.out.println("Nullpointer Exception");
    	 }
    	 }
	}

}
