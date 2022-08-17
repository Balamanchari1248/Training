import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		/*int x,y,sum;
		Scanner myObj = new Scanner(System.in);
		System.out.println("Type x : ");
		x=myObj.nextInt();
		System.out.println("Type y : ");
        y= myObj.nextInt();
        sum=x+y;
        System.out.println("sum is "+sum);*/
        
        //if, if else,nested if
		
		if(10<18)
			System.out.println("print");
		//if else
		int number=20;
		if (number>18)
			System.out.println("number is greater than 18");
		else
			System.out.println("number is less than 18");
		//nested if 
        if(10>10)
        	System.out.println("20 greater than 10");
        else if (10<10)
        	System.out.println("20 less than 10");
        else
        	System.out.println("20 is not equal to 10 ");
        //short hands if 
        
       String result= (10==20) ? "correct" : "false";
	   System.out.println(result);
	   
	   
	   int day=9;
	   if(day <=7) {
	   switch(day) {
	   case 1 :
		   System.out.println("monday");
		   break;
	   case 2:
		   System.out.println("tuesday");
		   break;
	   case 3 :
		   System.out.println("wedday");
		   break;
	   case 4 :
		   System.out.println("thrusday");
		   break;
	   case 5 :
		   System.out.println("friday");
		   break;
	   default:
		   System.out.println("weekend");
	   }}
	   else
		   System.out.println("A week contain only 7 days");
        
	   //looping statement
	   //for
	   for(int i=0;i<=4;i++)
		   System.out.println(i);
	   //while
	   int i=0;
	   while(i<4) {
		   System.out.println(i);
		   i++;
	   }
		//do-while
	   int j=0;
	  do {
		   System.out.println(j);
		   j++;
	   }while(j<=4);
	  //continue
	  for(int p=0;p<10;p++) {
		  if(p==4) {
			  continue;
		  }
		  System.out.println(p);
	  }
	 //array
	  String[] employee= {"bala","manju","pp","akila","divya","hr"};
	  System.out.println(employee[0]);
	  employee[0]="balamanchari";
	  System.out.println(employee[0]);
	  System.out.println(employee.length);
	  
	  
	
	
	} 
}
