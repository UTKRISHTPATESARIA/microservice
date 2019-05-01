public  class Foo {
	
    public static class Foo1 {
    	
    	Foo1()
    	{}
    	
    	public void meth()
    	{
    		System.out.println("HHHH");
    	}
    }

    public class FooImpl extends Foo1 {
    	FooImpl()
    	{
    		
    		meth();
    	}
    }

    public static void main(String[] args) {
        FooImpl foo = new Foo().new FooImpl();
        Foo1 foo1 = new Foo1();
    }
}
