package sevennine;
import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {
		
		Map <Integer,String> num =new HashMap<>();
		num.put(1, "Bala");//1
		num.put(2, "manju");//2
		num.put(3, "divya");//3
		System.out.println(num);
		System.out.println(num.keySet());
		System.out.println(num.values());
		System.out.println(num.entrySet());
		
		String value=num.remove(3);
		System.out.println(value);
		
		String values=num.get(2);
		System.out.println(values);
		
		num.replace(2, "pp");
		System.out.println(num);
	}

}
