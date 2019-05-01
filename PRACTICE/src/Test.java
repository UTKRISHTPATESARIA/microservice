
public class Test {

	int hi;
	
	private Test()
	{
		//hi=10;
		System.out.println("HELLO");
	}
	
/*	Test(int k)
	{
		this();
		hi=k;
	}
	*/
	public static void main(String args[])
	{
		Test a=new Test();
		System.out.println(a.hi);
	}
}

