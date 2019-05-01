
public class DogDoor {

	private boolean open;
	
	public DogDoor()
	{
		this.open=false;
	}
	public void open()
	{
		System.out.println("The dog door opens\n");
		open=true;
	}
	
	public void close()
	{
		System.out.println("The dog door closes\n");
		this.open=false;
		
	}
	
	public boolean isOpen()
	{
		return open;
	}
}
