
public class Students {

	public static void main(String[] args) {
		Drivers11 s1=new Drivers11();
		s1.setno(209);
		s1.setname("bala");
		updateObject(s1);
		System.out.println(s1.getno()+" "+s1.getname());
		
	}
	static void updateObject(Drivers11 s2) {
		System.out.println(s2.getno()+" " +s2.getname());
		s2.setno(204);
		s2.setname("manju");
		System.out.println(s2.getno()+" " +s2.getname());
	}

}