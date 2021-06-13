package APLab3;

import animals.Animal;
import animals.AnimalBehaviour;

public class Bird extends Animal implements AnimalBehaviour {
	private String name;
	private int numberOfLegs;
	private double height;
	private double weight;
	private int numberOfWings;

	public Bird(String name, int numberOfLegs, double height, double weight, int numberOfWings) {
		super(name, numberOfLegs, height, weight);
		this.numberOfWings = numberOfWings ;
	}

	public int getNumberOfWings() {
		return numberOfWings;
	}

	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}

	@Override
	public String toString() {
		return "Bird [numberOfWings=" + numberOfWings + ", Name=" + getName() + ", NumberOfLegs="
				+ getNumberOfLegs() + ", Height=" + getHeight() + ", Weight=" + getWeight() + "]";
	}

	@Override
	public String move() {
		return "The bird flies";
	}

	@Override
	public String makeNoise() {
		return "The bird goes Tweet tweet";
	}

	@Override
	public void eat(String food) {
		if(food.equalsIgnoreCase("worm") || food.equalsIgnoreCase("berries") || food.equalsIgnoreCase("insects"))
		{
			System.out.println("Edible");	
		}
		else
		{
			System.out.println("Inedible");	
		}	
	}
	
	public String getName() {
		return name;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
