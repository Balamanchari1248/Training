import java.util.ArrayList;
import java.util.Arrays;

public class CompareTWoArray {

	public static void main(String[] args) {

			ArrayList<String> comp1= new ArrayList<String>(Arrays.asList("Bala","manju","divya"));
			
			System.out.println(comp1);
			
			
			ArrayList<String> comp2= new ArrayList<String>(Arrays.asList("Bala","maan","divya"));
			
			System.out.println(comp2);
			
			comp2.retainAll(comp1);
			System.out.println(comp2);

	}

}
