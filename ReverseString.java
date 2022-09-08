package sevennine;

public class ReverseString {
	
	public static void main(String[] args) {

		String str="Bala",revstr="";
		char ch;
		
	for(int i=0;i<str.length();i++) {
		
		ch= str.charAt(i);
        revstr = ch+revstr;
	}
	System.out.println(revstr);

	String Sentence="java is best",revsentence="";
	
	
for(int j=0;j<Sentence.length();j++) {
	
	ch= Sentence.charAt(j);
	revsentence = ch+revsentence;
}
System.out.println(revsentence);

	}
	

}
