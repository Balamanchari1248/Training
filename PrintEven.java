package tasks;

import java.util.ArrayList;

public class PrintEven {

	public static void main(String[] args) {
		
		ArrayList<Integer> Even = new ArrayList<Integer>();
		
		Even.add(1);
		Even.add(2);
		Even.add(3);
		Even.add(4);
		Even.add(5);
		Even.add(6);
		Even.add(7);
		Even.add(8);
		Even.add(9);
		Even.add(10);
		
		System.out.println(Even);
		 System.out.println("Even numbers......");
		for(int i=0;i<Even.size();i++){
			
		
			 if(Even.get(i) %2 == 0) {
				
			
				System.out.println(Even.get(i));
			}
		}

	}

}
