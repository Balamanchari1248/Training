package tasks;

import java.util.ArrayList;

public class MultiplyArrayList {
	
	  static int multiply(ArrayList<Integer> arrList) {
			int ans = 1;
			for(int i = 0; i < arrList.size(); i++) {
				ans *= arrList.get(i);
			}
			return ans;

	 }

			public static void main(String[] args) {
				// TODO Auto-generated method stub
				ArrayList <Integer> list = new ArrayList <>();
				list.add(1);
				list.add(2);
				list.add(3);
				list.add(4);
				list.add(5);
				list.add(6);
				list.add(7);
				list.add(8);
				list.add(9);
				list.add(10);

				System.out.println(multiply(list));
			   
		}
}
