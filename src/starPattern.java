
public class starPattern {

	public static void main(String[] args) {
		int i,j,row=6;
		for(i=0;i<row;i++) {
		for(j=2*(row-i);j>=0;j--) {
			System.out.print(" ");
		}for(j=0;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
		}
		int p,q;
		for(p=0;p<=5;p++) {			
			for(q=0;q<=p;q++) {
				System.out.print("* ");
			}System.out.println();
	}
	}

}
