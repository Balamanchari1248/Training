import java.util.Scanner;

public class day2 {

	public static void main(String[] args) {
		int i;
		double p =3.14,area;
		Scanner sc=new Scanner(System.in);
        System.out.println("enter a radious of circle: ");
        i=sc.nextInt();
        area=p*i*i;
        System.out.println("area of a circle: "+area);
        
        int h,r;
        double pi =3.14,vol;
        Scanner cone=new Scanner(System.in);
        System.out.println("enter height: ");
        h=cone.nextInt();
        Scanner radius=new Scanner(System.in);
        System.out.println("enter radius: ");
        r=radius.nextInt();
        vol=pi*r*r*(h/3);
        System.out.println("enter volume: "+vol);
	}

}
