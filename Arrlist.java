package Task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Arrlist {

	//add element in arraylist

	public static void main(String[] args) {
		
		ArrayList<String> Values = new ArrayList<String>();
		
		Values.add("bala");
		Values.add("manju");
		Values.add("divya");
		Values.add("akila");
		Values.add("pp");
		System.out.println("arraylist:" +Values);
		
		//add element in specific place
		
		Values.add(3,"mohan");
		Values.add(5,"maanraj");
		
		System.out.println("added arraylist:" +Values);
		
		//reverse arraylist
		
		Collections.reverse(Values);
		System.out.println("reverse arraylist:" +Values);
		
		//remove elements from a spcific index
		
		Values.remove(5);
		Values.remove(0);
		
		System.out.println("after removing elements:" +Values);
        
		//clear the all elements from an arraylist
		
//		Values.clear();
//		
//		System.out.println("clear the arraylist" +Values);

		//create a sublist
		
		List<String> sublist=Values.subList(1,4);
		
		sublist.add("Rakesh");
		sublist.add("manchari");
		
		System.out.println("sublist:" +sublist);
		
		//Search element in an arraylist
		
		System.out.println(Values.contains("vijay"));
		
		System.out.println(Values.contains("bala"));
		
		System.out.println(Values);
	
// find index of an element from an ArrayList
//(if it is present,it print the index of that string or else it will print -1)
		
		System.out.println(Values.lastIndexOf("bala"));
		
		System.out.println(Values.lastIndexOf(5));
		
		Values.remove(6);
		
		//replace element within the ArrayList
		
		Values.set(5, "bala");
		
		System.out.println(Values);
		
		//extract some of the elements from given list in java
		
	    String element=Values.get(5);
	    
	    System.out.println(element);
	
		}

}
