package Test;

import java.util.Scanner;

public class Numbers {
	public static void main(String args[]) {
	
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number: ");
		int sum=sc.nextInt();
	
	if(sum%2 == 0)
	{
		System.out.println(sum+"is a even num ");
	}
	else if(sum%2!= 0)
	{
		System.out.println(sum+"is a odd num ");
	}
	else
	{
		System.out.println( "nothing");
	}
	
	
	
}
}
