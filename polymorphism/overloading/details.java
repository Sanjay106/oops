package oops.polymorphism.overloading;

 class getdetails {
public void studentdetails(String a)
{
	System.out.println("the name of the student is"+a);
}
public void studentdetails(int a)
{
	System.out.println("the id of the student is"+a);
}
}
public class details{
	public static void main(String args[])
	{
		getdetails obj=new getdetails();
		obj.studentdetails("sanjay");
		obj.studentdetails(106);
	}
}
