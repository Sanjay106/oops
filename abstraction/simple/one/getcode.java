package oops.abstraction.simple.one;
import java.util.Scanner;
public class getcode extends errorcodes {
public static void main(String args[])
{
	int a;
Scanner in =new Scanner(System.in);

System.out.println("enter the error code");
a=in.nextInt();
errorcodes obj=new errorcodes();
obj.setcode(a);
}
}
