class Student
{
public void Student()
{
System.out.println("student");
}
}
public class School extends Student{
	
	public  void show()
	{
		System.out.println("School");
	}
public static void main(String[] args){
School ss=new School();

ss.show();
ss.Student();     
        
}
}
