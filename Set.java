package sevennine;

import java.util.*;

public class Set {

	public static void main(String[] args) {
		
		HashSet<Integer> num = new HashSet<Integer>(); 
		num.add(6);
		num.add(3);
		num.add(5);
		num.add(6);
		num.add(3);
		num.add(8);
		num.add(1);
		num.add(0);
		num.add(4);
		num.add(2);
		num.add(3);
		num.add(7);
		
		System.out.println(num);
	}

}
//{6,3,5,6,3,8,1,0,4,2,3,7}