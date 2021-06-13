package APLab3;

public class Dog extends Animal implements AnimalBehaviour
{
	private String breed;
	

	public Dog(String name, int numberoflegs, int height, int weight, String breed) 
	{
		super(name, numberoflegs, height, weight);
		this.breed = breed;
	}

	public String getBreed() 
	{
		return breed;
	}

	public void setBreed(String breed) 
	{
		this.breed = breed;
	}

	@Override
	public String move() 
	{
		return "Walk";
	}

	@Override
	public String makeNoise() 
	{
		return "Bark";
	}

	@Override
	public void eat(String food) 
	{
		if (food == "meat" || food == "bones")
		{  
			System.out.println("edible");  
		}
		else
		{  
			System.out.println("inedible");  
		} 
	}
	
	
		
	
}
