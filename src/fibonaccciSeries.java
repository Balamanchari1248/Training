import java.util.Scanner;

public class fibonaccciSeries {
	
	
	public static void main(String[] args) {
		
		int i,a=0,b=1,c;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter i value: ");
		i=sc.nextInt();
		System.out.println(a+" "+b);
		for(int y=2;y<=i;y++) {
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
		

	}

}
