package program17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UniqueWords {

	public static void main(String[] args) {
		
		String str = "bala bala manchari bala murugadass";
        
        String[] words = str.split(" ");
         
        List<String> uniqueWords = new ArrayList<String>(Arrays.asList(words));
        for(int i=1; i<uniqueWords.size(); i++) {
            for(int j=0;j<i;j++) {
                if(uniqueWords.get(i).equals(uniqueWords.get(j))) {
                    uniqueWords.remove(i);
                    i--;
                    break;
 
                }
	}
        }
	}
}

