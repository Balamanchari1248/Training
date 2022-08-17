import java.util.Scanner;

public interface test {
	int a,b;
	 public void show() {
		 System.out.println("a value="+a+" b value="+b);
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter a value: ");
	 a=sc.nextInt();
	 System.out.println("enter b value: ");
	 b=sc.nextInt();
	 System.out.println(a+b);
	 }
  
}
