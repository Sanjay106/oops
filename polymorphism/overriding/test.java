package oops.polymorphism.overriding;
 class animal{
	public void speed()
	{
		System.out.println("cheetahs are the fastest animal");
	}
}
 class fish extends animal{
	 public void speed(){
		 super.speed();
		 System.out.println("sailfish are the fastest fish ");
	 }
 }
public class test {
public static void main(String args[])
{
	animal a=new fish();
	a.speed();
}
}
