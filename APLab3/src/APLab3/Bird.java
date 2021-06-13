package APLab3;

public class Bird extends Animal implements AnimalBehaviour 
{
	private int numberofwings;
	

	public Bird(String name, int numberoflegs, int height, int weight, int numberofwings) 
	{
		super(name, numberoflegs, height, weight);
		this.numberofwings = numberofwings;
	}

	public int getNumberofwings() 
	{
		return numberofwings;
	}

	public void setNumberofwings(int numberofwings) 
	{
		this.numberofwings = numberofwings;
	}
	
	@Override
	public String move()
	{
		return "Fly";
	}

	@Override
	public String makeNoise() 
	{
		return "Chirp";
	}

	@Override
	public void eat(String food)
	{
		if (food == "worms" || food == "fruits")
		{  
	        System.out.println("edible");  
	    }
		else
		{  
	        System.out.println("inedible");  
	    } 
	}
}
