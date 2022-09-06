package Task;

import java.util.*;
import java.util.stream.Collectors;

class CustomSorting1 implements Comparator<String>{

	
	@Override
	public int compare(String o1, String o2) {
		
		if(o1.length()>o2.length()) {
			return -1;
		}
		else {
			return 1;
		}	
		
	}

	

}

public class Laptop {
	
	//Maximum length in the string

	public static  void main(String[] args) {
		   
		        ArrayList<String> lap = new ArrayList<String>();
		        lap.add("HP");
		        lap.add("Lenovo");
		        lap.add("Compaqo");
		        lap.add("Zensar");
		        lap.add("Dell");
		        lap.add("Apple");
		        
		       
		  
		        Collections.sort(lap,new CustomSorting1());
		        int length = lap.get(0).length();
		        
		        System.out.println(lap);
		        
		        lap.forEach(e->{
		        	
		        	if(e.length()==length) {
		        		System.err.println(e);
		        	}
		        });
	}
}