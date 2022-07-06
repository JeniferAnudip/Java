class exa
{
	exa()
	{
		System.out.println("Constructor.. ")

	}
	public void display()
	{
		System.out.println("Instance method.. );
	}
	public static void display1(
	{
		System.out.println("static  method.. ");
	}

}

class Student
{		static{
			System.out.println("Static Block.. ");
		}
		
	public static void main(String[] a)
	{
		System.out.println("Static -MAIN method.. ");
		exa e=new exa();
		e.display();
		exa.display1();
		
	}
}