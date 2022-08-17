
public class Method {
      
    	   //method
    	   //block of code it runs when it is called
    	   static void myMethod(){
    	   System.out.println("hi there");
    	   }
    	   static void myMethod2() {
    		System.out.println("if it is called it get executed");
    	   }
    	   static void myMethod3(String fname,int age) {
    		   System.out.println(fname + " Murugadass ");
    	   System.out.println(age);
    	   }
    	   static int myMethod4(int x) {
    		   return 5+x;
    	   }
    	   static int myMethod(int x, int y) {
    		    return x + y;
    		  }
    	   static void checkAge(int age) {
    		   if(age>18) {
    			   System.out.println("you are eligble enter");
    		   }
    		   else {
    			   System.out.println("you are not eligible");
    	   }
    		   }
    	   public static void main(String[] args)  {
    		   myMethod();
    		   myMethod2();
    		  myMethod3("balamanchari",21);
    		  System.out.println(myMethod4(3));
    		  System.out.println(myMethod(5,16));
    	       checkAge(20);
    	   }
}
