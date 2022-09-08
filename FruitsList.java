package sevennine;

import java.util.Arrays;
import java.util.Collections;

public class FruitsList {

	public static void main(String[] args) {
		
		String[] fruit={"apple","mango","orange","guava"};
		Arrays.sort(fruit);
		System.out.print("ascending order: " );
		System.out.println(Arrays.toString(fruit));
	
	     Arrays.sort(fruit,Collections.reverseOrder());
	     System.out.print("Descending order: ");
	     System.out.print(Arrays.toString(fruit));
	}

}


