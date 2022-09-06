package Task;

public class nullPointer {
	public static void main(String[] args) {
	 
		String g=null;
     
	 try {
		 
		 System.out.println(g.length());
	 }
	 catch(NullPointerException e)
	 {
		System.out.println(e);
	 }
	 finally {
	 System.out.println("Nullpointer Exception");
	 }

}
}
