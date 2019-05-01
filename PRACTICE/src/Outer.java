
public class Outer1 {

	int a;
	public class Inner
	{
		int x;
		void meth(int k)
		{
			System.out.println("X="+x);
			System.out.println("A="+a);
		}
	}
}

public class Outer
{
	public static void main(String args[])
	{
		Outer1 o=new Outer1();
		Outer1.Inner s=new Outer1().Inner();
				 s.meth();
	}
}
