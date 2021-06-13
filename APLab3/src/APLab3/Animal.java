package APLab3;

public class Animal 
{
	private String name;
	private int numberoflegs;
	private int height;
	private int weight;
	
	public Animal()
	{
		name = "";
		numberoflegs = 0;
		height = 0;
		weight = 0;
	}
	
	// four-argument Employee Constructor 
	public Animal( String name, int numberoflegs, int height, int weight )
	{	
		this.name = name;
		this.numberoflegs = numberoflegs;
		this.height = height;
		this.weight = weight;
	}// end four-argument Employee constructor
	
	public Animal(Animal emp)
	{
		name = emp.name;
		numberoflegs = emp.numberoflegs;
		height = emp.height;
		weight = emp.weight;
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public double getNumberoflegs()
	{
		return numberoflegs;
	}

	public void setNumberoflegs(int numberoflegs)
	{
		this.numberoflegs = numberoflegs;
	}

	public double getHeight() 
	{
		return height;
	}

	public void setHeight(int height) 
	{
		this.height = height;
	}

	public double getWeight() 
	{
		return weight;
	}

	public void setWeight(int weight)
	{
		this.weight = weight;
	}

	@Override
	public String toString() 
	{
		return "Animal [name=" + name + ", numberoflegs=" + numberoflegs + ", height=" + height + ", weight=" + weight + "]";
	}
	
	
}
