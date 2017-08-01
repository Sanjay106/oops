package oops.inheritance.multilevelInheritance;

public class faculty3 extends faculty2{
	public void getfacultydetails3(String name,Double salary)
	{
		super.getfacultydetails2("ECE", 56);
		System.out.println("the Salary of the faculty is "+salary);
		System.out.println("the faculty works in the institute "+name);
	}
public static void main(String args[])
{
	faculty3 obj=new faculty3();
	obj.getfacultydetails3("GCET", 10600.0);
}
}
