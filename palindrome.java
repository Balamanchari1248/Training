package Test;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		String name;
		String reverseStr = "";
		Scanner sc= new Scanner(System.in);
		System.out.println("enter String: ");
		name=sc.nextLine();
		
		int StrLength=name.length();
		System.out.println(name.length());
		    for (int i = (StrLength - 1); i >=0; i--) {
		      reverseStr = reverseStr + name.charAt(i);
		    }

		    if (name.equals(reverseStr)) {
				System.out.println("It is palindrome");
			}
		    else
			{
		    	System.out.println("It is not a palindrome");
		}

	}

}
