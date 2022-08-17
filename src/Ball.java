import java.util.Scanner;

public class Ball {
	String color;
	int diameter;
	int weight;
	
	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("enter color of the ball: ");
		String color=obj.nextLine();
		System.out.println("enter diameter of the ball: ");
		int d=obj.nextInt();
		System.out.println("enter weight of the ball: ");
		int w=obj.nextInt();
		
		if(color.equals("white")&& d==25 && w==1)
		{
			System.out.println("it is football");
		}if else(color.equals("red")&& d==10 && ==500g))
		{
			System.out.println("it is tennis ball");
		}
		
		
	}

}
