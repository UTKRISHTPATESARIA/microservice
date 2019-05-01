
public class Examp {

	 String s="ZZZ";
	
	public void methoda()
	{
		System.out.println(s);
	}
	
	  static class A{
		 
		public void method()
		{
			Examp n=new Examp();
			n.methoda();
			Examp.C n1=new Examp().new C();
			n1.meth();
		}
	}
	  class C{
		  public void meth()
		  {
			  A n=new A();
			  n.method();
			  
		  }
	  }
	 
	 public static void main(String args[])
	 {
		 //System.out.println(Examp.s);
		 //Examp.methoda();
		// Examp a=new Examp();
		 
		 
		 Examp.A b=new A() { };
		 //b.methoda();
		 b.method();
	 }
}
