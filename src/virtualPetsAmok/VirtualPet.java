package virtualPetsAmok;

import  java.util.Random ;

public abstract class VirtualPet {

	protected Random generator = new Random();
	
	//Instance variables
	protected String name;
	protected String description;
	protected int health;
	protected int happiness;
	
	//Constructor accepts VirtualPet and establishes default attributes for new pets
	public VirtualPet(String newName, String newDescription) {
		name = newName;
		description = newDescription;
		health = 50;
		happiness = 50;
	}
	
	public String getName() {
		return name;
	}
	public int getHealth() {
		return health;
	}
	
	public int getHappiness() {
		return happiness;
	}
	
	public abstract void play();
		
	public int generateRandom() {
		return generator . nextInt (5);
	}
	
	@Override
	public String toString() {
		return (name  + " [" + description + "]"); 
	}

	public void depleteHealth() {
		health -= 5;
	}





}
