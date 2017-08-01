package oops.inheritance.singleinheritance;
class calc {
	
	public void addition(double a, double b)
	{
		System.out.println((a+b));
	}
	public void subtraction(double a,double b)
	{
		System.out.println((a-b));
	}
}
public class calculator extends calc {

	public void multiplication(double a,double b)
	{
		System.out.println((a*b));
	}
	public void division(double a,double b)
	{
		System.out.println((a/b));
	}
	public static void main(String args[])
	{
		calculator obj=new calculator();
			obj.addition(56, 98);
			obj.subtraction(56,98 );
			obj.multiplication(56,98);
			obj.division(56, 98);
	}
}
