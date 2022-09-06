package Test;

class prime {
	
      public static void main(String args[]) {
    	  int num=7,count=0;
    	  for(int i=1;i<=num;i++) {
    		  if(num%i == 0) {
    			  count ++;
    			  if(count>2)
    			  break;
    	  }
    	  if(count==2) {
    		  System.out.println("is prime");
    	  }
    	  else {
    		  
    		  System.out.println("is not a prime");
      }
      }
}
}