
public class Bank {
     int accNo;
     static String IFSC;
     
     void accept(int a,String b) {
    	 accNo=a;
    	 IFSC=b;
     }
     void display() {
    	 System.out.println(accNo+" "+IFSC);
     }
   
     }

