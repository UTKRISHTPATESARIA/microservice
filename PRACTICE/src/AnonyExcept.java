
public class AnonyExcept {
	
	static int k=0;
	@SuppressWarnings("serial")
	public static void main(String Args[])
	{
		Throwable t=new Throwable("hey",new NullPointerException());;
	try
	{
		if(k==0)
		{
			ArithmeticException e= new ArithmeticException();
			
			//e.initCause(new Exception("HEYYYYYYYY"));
			throw e;
		}
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
		System.out.println(t.getCause());
	}
	
	}

}
