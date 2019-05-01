public class trim
{
	int data=10;
	int n=-1;
}
public class HashC {

	public static void main(String args[])
	{
		String s=new String();
		s="HEllo";
		StringBuffer s1=new StringBuffer();
		
		byte a[]=s.getBytes();
		char c[]=s.toCharArray();
		trim i=new trim();
		System.out.println(a[1]);
		System.out.println(c[1]+String.valueOf(i));
		
	}

	
	
}
