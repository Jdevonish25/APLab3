package APLab3;

import APLab3.Animal;

public class Animal {
	private String Name;
	private int numoflegs;
	private float height;
	private float weight;
	
	
	public Animal() {
		Name=" ";
		numoflegs=0;
		height=0;
		weight=0;
	}
	
	public Animal(String Name, int numoflegs, float height, float weight) {
		this.Name=Name;
		this.numoflegs=numoflegs;
		this.height=height;
		this.weight=weight;
		
	}
	
	public Animal(Animal A) {
		Name= A.Name;
		numoflegs=A.numoflegs;
		height=A.height;
		weight=A.weight;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getNumoflegs() {
		return numoflegs;
	}

	public void setNumoflegs(int numoflegs) {
		this.numoflegs = numoflegs;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Animal [Name=" + Name + ", numoflegs=" + numoflegs + ", height=" + height + ", weight=" + weight + "]";
	}

	
}
