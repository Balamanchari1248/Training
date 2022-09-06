package tasks;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> sort =new ArrayList();
		sort.add(24);
		sort.add(56);
		sort.add(77);
		sort.add(90);
		sort.add(35);
		sort.add(67);
		
		Collections.sort(sort);
		System.out.println(sort);
	}

}
