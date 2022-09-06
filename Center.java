package Test;

public class Center implements Inter1, Inter2 {

	public static void main(String[] args) {
	   Inter1 i=new Center();
	   System.out.println("Name is: "+i.name("bala"));
	   Inter2 i2=new Center();
	   System.out.println("number is: "+i2.number(10));
	   

	}

	@Override
	public int number(int num) {
		// TODO Auto-generated method stub
		return num;
	}

	@Override
	public String name(String name) {
		// TODO Auto-generated method stub
		return name;
	}

}
