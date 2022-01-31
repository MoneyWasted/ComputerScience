package tommy.cps143.landtract;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
	public static void main(String args[])
	{
		double randWidth1 = ThreadLocalRandom.current().nextDouble(1.0, 10.0);
		double randLength1 = ThreadLocalRandom.current().nextDouble(1.0, 10.0);
		
		double randWidth2 = ThreadLocalRandom.current().nextDouble(1.0, 10.0);
		double randLength2 = ThreadLocalRandom.current().nextDouble(1.0, 10.0);
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Creating the first land object...");
		Land land = new Land();
		land.LandArea(randLength1, randWidth1);
		System.out.println(land.toString());
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Creating the second land object...");
		Land land2 = new Land();
		land2.LandArea(randLength2, randWidth2);
		System.out.println(land2.toString());
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Checking if the first and second land objects are equal...");
		System.out.println(land.equals(land2));
		
		System.out.println("----------------------------------------------------------");
		System.out.println("Disposing of both land objects...");
		land = null;
		land2 = null;
		
		System.out.println("----------------------------------------------------------");
		System.out.println("\nTests have run successfully with no errors!");
	}
}
