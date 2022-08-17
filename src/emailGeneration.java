import java.util.Scanner;

public class emailGeneration {

	 static String emailextension="surgetechinc.in";
	 
		public static void main(String[] args) {
      System.out.println("employee name: ");
      Scanner sc= new Scanner(System.in);
      String empname=sc.next();
      System.out.println("Employe Email id: "+empname+"@"+emailextension);
       
	}

}
