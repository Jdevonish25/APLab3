package APLab3;

public class Elephant extends Animal implements AnimalBehaviour
{
	private int trunklength;
	

	public Elephant(String name, int numberoflegs, int height, int weight, int trunklength)
	{
		super(name, numberoflegs, height, weight);
		this.trunklength = trunklength;
	}

	public int getTrunklength() 
	{
		return trunklength;
	}

	public void setTrunklength(int trunklength) 
	{
		this.trunklength = trunklength;
	}

	@Override
	public String move() 
	{
		return "Walk";
	}

	@Override
	public String makeNoise() 
	{
		return "Trumpeting";
	}

	@Override
	public void eat(String food) 
	{
		if (food == "grass" || food == "trees")
		{  
			System.out.println("edible");  
		}
		else
		{  
			System.out.println("inedible");  
		} 
	}
	
	
}
