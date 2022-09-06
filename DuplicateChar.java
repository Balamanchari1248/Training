package program17;

public class DuplicateChar {

	public static void main(String[] args) {
		String str="colony";
		int i=1,j=1;
		char[] ch=str.toCharArray();
		System.out.println("duplicate char: ");
		for(i=0;i<str.length();i++)
		{
			for(j=i+1;j<str.length();j++) 
			{
				
				if(ch[i]==ch[j]) {
					
					System.out.println(ch[i]);
				}
		
		}
		}

	}

}
