package program17;

public class withoutString {

	public static void main(String[] args) {
         String s1="bala manchari";
         String s2="";
         for(int i=0;i<s1.length();i++)
         {
        	 char ch=s1.charAt(i);
        	 if(ch !=' ')
        	 {
        		
        		s2=s2+ch;
        	 }
         }
         System.out.println(s2);
	}

}
