package program17;

import java.util.Scanner;

public class FindLargest {

	public static void main(String[] args) {
		{  
			int a, b, c, largest;  
			 
			Scanner sc = new Scanner(System.in);  
			  
			System.out.println("Enter three number: ");  
			a = sc.nextInt();  
			b = sc.nextInt();
			c = sc.nextInt();
			 
			largest = c > (a > b ? a : b) ? c : ((a > b) ? a : b);  
			System.out.println("The largest number is: "+largest);  
			}  
			} 
	}

