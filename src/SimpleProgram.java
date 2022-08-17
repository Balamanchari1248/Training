
public class SimpleProgram {

	public static void main(String[] args) {
	
	System.out.println("Hello World");	
	
	//variables
	
	String name ="Balamanchari";
	System.out.println(name);
	
	int mynum =15;
	System.out.println(mynum);
	
	/* for reference 
	 * int mynum = 15
	 * String = "bala"
	 * float = 1.08f
	 * char='home'
	 *  boolean=true; */
	
	//display variables
	String n = "bala";
	System.out.println("hello " +n);
	
	int x=5, y=3, z=6;
	System.out.println(x+y+z);

	//Strings
	
	String len="name of the text";
	System.out.println("String length is: "+len.length());
	System.out.println(len.toUpperCase());
	System.out.println(len.toLowerCase());
	System.out.println(len.indexOf("the"));
	
	String s1="hello";
	String s2="bala";
	System.out.println(s1.concat(s2));
	
	//escape sequence
	String txt = "We are the so-called \"Vikings\" from the north.";	
    System.out.println(txt);
    
    String txt1 ="It\'s alright";
    System.out.println(txt1);
    //backslash(/)
    
    //math
    System.out.println(Math.max(5, 10));
    System.out.println(Math.min(5, 10));
    System.out.println(Math.sqrt(1200));
    System.out.println(Math.abs(-4.47));
    System.out.println(Math.random());
    int randomNum = (int)(Math.random()*101);
    System.out.println(randomNum);
    
    
    //boolean
    int a=20;
    int b=30;
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a==b);
    System.out.println(a!=b);
    
	}

/* single line comment*/
//multiple line comment


}