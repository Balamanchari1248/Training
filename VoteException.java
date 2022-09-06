package tasks;

import java.util.Scanner;

public class VoteException {

	public static void main(String[] args) {
	
		int age =20;

		try {
		
		        if(age<=18)
		        {
		              throw new NumberFormatException("Invalid Age Exception");
			    }
		        else
		        {
		        	System.out.println("user can vote");
		        }
		}
		catch(Exception e)
        {
		 System.out.println(e);    
        }
		finally {
			System.out.println("voting program");
		}
}
}