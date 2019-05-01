
public class Outer {

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

public class Outer1
{
	public static void main(String args[])
	{
		Outer o=new Outer();
		Outer.Inner s=new Outer().new Inner();
		s.meth();
	}
}
