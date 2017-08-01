package oops.polymorphism.overloading;

class Overloading
{
    public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num)  
    {
         System.out.println(c + " "+num);
    }
}
public class Sample
{
   public static void main(String args[])
   {
       Overloading obj = new Overloading();
       obj.disp('a');
       obj.disp('a',10);
   }
}