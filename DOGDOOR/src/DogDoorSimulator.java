
public class DogDoorSimulator {
	
	public static void main(String as[])
	{
			DogDoor door=new DogDoor();
			Remote rem=new Remote(door);
			
			System.out.println("Fido wants to go outside");
			rem.pressButton();
			System.out.println("Fido  is outside");
			//rem.pressButton();
			System.out.println("Fido is done");
			//rem.pressButton();
			//System.out.println("Fido  is inside");
			//rem.pressButton();
			
			try {
				Thread.currentThread().sleep(500);
				
			}catch(InterruptedException e) {}
			
			System.out.println("...he's stuck outside");
			System.out.println("\nhes barking");
			System.out.println("\ntine grabs remote");
			rem.pressButton();
			System.out.println("\nfidos back inside");
			
	}

}
