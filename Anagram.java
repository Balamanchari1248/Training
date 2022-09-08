package sevennine;

import java.util.Arrays;

public class Anagram {
	public static void main(String args[]) {
	
		String str1="bala";
		String str2="alabi";
		
		isAnagramUsingSort(str1,str2);
	}
	private static void isAnagramUsingSort(String str1,String str2) {
		
		char[] str1chars=str1.toLowerCase().toCharArray();
		char[] str2chars=str2.toLowerCase().toCharArray();
		Arrays.sort(str1chars);
		Arrays.sort(str2chars);
		if(Arrays.equals(str1chars, str2chars)) {
				System.out.println("isAnagram");
		}else {
			System.out.println("not an anagram");
		}
	}
}
