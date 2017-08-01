package oops.inheritance.multilevelInheritance;

public class faculty2 extends faculty1{
	public void getfacultydetails2(String branch,int id ) 
	{
		super.getfacultydetails1("sanjay",22);
		System.out.println("the branch of the faculty is "+branch);
		System.out.println("the id of the faculty is "+id);
	}
	}
