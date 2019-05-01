package Collect;
import java.util.*;

public class Array1 implements Comparator<Integer>{
	
	public int compare(Integer a,Integer b)
	{
		return a>b?a:b;
	}

	
}
public class Array{
	
	
	public static void main(String ar[])
	{
	ArrayList<Integer> i=new ArrayList<Integer>();
	
	i.add(10);
	i.add(11);
	i.add(12);
	i.add(1);
	i.add(20);
	i.add(40);
	i.add(150);
	
	ListIterator<Integer> li=i.listIterator();
	
	}
	

}
