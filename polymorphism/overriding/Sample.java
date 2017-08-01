package oops.polymorphism.overriding;

class Human{
	   public void eat()
	   {
	      System.out.println("Human is eating");
	   }
	}
	public class Sample extends Human{
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	   public static void main( String args[]) {
	      Sample obj = new Sample();
	      obj.eat();
	   }
	}