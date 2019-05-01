
public class BarkRecogniser {
	
	private  DogDoor door;
	
	BarkRecogniser(DogDoor door)
	{
		this.door=door;
	}
	
	public void recognise()
	{
		System.out.println("Barkrecogniser recognised a bark\n");
		door.open();
	}
}
