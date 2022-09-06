package program17;

import java.util.Scanner;

public class ReplaceString {
  // Replacing white spaces
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter String: ");
	    String str=sc.nextLine();
	    String str1=sc.nextLine();
		str= str.replace(" ", "");
		//concat
		str1=str.concat(str1+"murugadas");
		
		System.out.println("After removing Whitespaces: "+str);
        System.out.println("concat: "+str1);
	}

}
