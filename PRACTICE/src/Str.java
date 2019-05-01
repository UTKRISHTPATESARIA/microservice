class Str{
	public static void main(String args[])
	{
		try {
			method();
		}
		catch(Exception e)
		{
			System.out.println("CAught Exception");
		}
	}
	
	static void method()
	{
		String s=null;
		s.length();
	}
}