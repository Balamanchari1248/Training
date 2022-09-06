package program17;

public class Secondlargest {

	public static void main(String[] args) {
		int arr[]= {24,72,34,97,45},temp;
		
       for(int i=0;i<arr.length;i++)
       {
    	   for(int j=i+1;j<arr.length;j++) {
    		   if(arr[i]<arr[j]) {
    			   
    		   temp=arr[i];
    		   arr[i]=arr[j];
    		   arr[j]=temp;
    		   
    		   }
    	   }
    		   System.out.print(+arr[i]+ " ");
    		  
    		   }
       System.out.println();
       System.out.println("Second largest: "+arr[1]);
      	
       
       
	}
	
	}
	
