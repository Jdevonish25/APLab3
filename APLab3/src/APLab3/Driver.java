package APLab3;

public class Driver 
{
	public static void main(String[] args) 
	{
		Bird b = new Bird("Pete", 2, 8, 45, 2);
		Dog d = new Dog("Ben", 4, 35,57, "Golden Retriever");
		Elephant e = new Elephant("Enzo", 4, 8, 5000, 6);
		
		b.eat("worms");
		d.eat("meat");
		e.eat("grass");
		
		b.eat("fruits");
		d.eat("bones");
		e.eat("trees");
		
		System.out.println("\n" + b.move());
		System.out.println(d.move());
		System.out.println(e.move() + "\n");
		
		System.out.println(b.makeNoise());
		System.out.println(d.makeNoise());
		System.out.println(e.makeNoise());
		
		/*For the animal instances casted to the interface, the functions 
		 *from the interface displayed as they were implemented in
		the respective animal classes*/
		Bird bi = new Bird("Paul", 2, 9, 47, 2);
		Dog dog = new Dog ("Bertha", 4, 32,55, "Golden Retriever");
		Elephant el = new Elephant("Nathan", 4, 8, 5060, 7);
		
		AnimalBehaviour ban = (AnimalBehaviour) bi;
		AnimalBehaviour dan = (AnimalBehaviour) dog;
		AnimalBehaviour ean = (AnimalBehaviour) el;
		
		ban.eat("trees");
		dan.eat("Fig");
		ean.eat("Jam");
		
		System.out.println("\n" + ban.move());
		System.out.println(dan.move());
		System.out.println(ean.move() + "\n");
		
		System.out.println(ban.makeNoise());
		System.out.println(dan.makeNoise());
		System.out.println(ean.makeNoise()); 
	
		/*An error occurs stating that we cannot cast from one child class to another
		Bird bir = new Bird("Rob", 2, 9, 47, 2);
		Dog dogg = new Dog ("Sparky", 4, 32,55, "Golden Retriever");
		Elephant ele = new Elephant("Neel", 4, 8, 5200, 7);
		
		Bird ban1 = (Bird) dogg;
		Bird ban2 = (Bird) ele;
		
		Dog dan1 = (Dog) bir;
		Dog dan2 = (Dog) ele;
		
		Elephant ean1 = (Elephant) bir;
		Elephant ean2 = (Elephant) dogg;	*/	
	}

}
