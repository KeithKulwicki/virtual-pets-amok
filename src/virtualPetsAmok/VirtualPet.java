package virtualPetsAmok;

import java.util.Random;

public class VirtualPet {

	private Random generator = new Random();

	// include appropriate instance variable(s) to store the pets who reside at the shelter
	String name;
	String lifeForm;
	String species;
	int hungerLevel;
	int thirstLevel;
	int boredomLevel;
	int cageCleanliness; //organic dogs
	int litterBoxCleanliness; // organic cats
	int powerLevel; // robot animals
	int oilLevel; // robot animals

	VirtualPet(String nameParam, String petLifeFormParam, String petSpeciesParam) {
		name = nameParam;
		lifeForm = petLifeFormParam;
		species = petSpeciesParam;
		
	}

	VirtualPet(String nameParam, String petLifeFormParam, String petSpeciesParam, int hungerParam, int thirstParam, int boredomParam) {
		name = nameParam;
		lifeForm = petLifeFormParam;
		species = petSpeciesParam;
		hungerLevel = hungerParam;
		thirstLevel = thirstParam;
		boredomLevel = boredomParam;
		int litterBoxParam = 0;
		litterBoxCleanliness = litterBoxParam;
		int powerParam = 0;
		powerLevel = powerParam;
		int oilParam = 0;
		oilLevel = oilParam;
	}

	void tick() {
		hungerLevel += 0 + generateRandom();
		thirstLevel += 0 + generateRandom();
		boredomLevel += 0 + generateRandom();
	}

	int generateRandom() {
		return generator.nextInt(6); // random number between 0-5
	}

	// name
	String getName() {
		return name;
	}

	void rename(String newName) {
		name = newName;
	}
// 	++ 	Introduce methods that allow for:
// 		+	robotic pets
//		+	walking dogs, decreasing the likelihood that organic dogs will soil their cages, 
//			while increasing happiness in all dogs
	
//	Walk Dog
	int walkDog() {
	hungerLevel += 5; // walk = more hungry
	thirstLevel += 5; // walk = more thirsty
	int happiness = 5; // walk = more happiness	
	cageCleanliness += 5; // walk = more cage cleanliness
	int playLevel;
	return playLevel = 0; // walk = play = 0
	}
	
	
	// Feeding
	int getHunger() {
		return hungerLevel;
	}

	int feed() {
		return hungerLevel = 0; // if fed, hunger = 0
	}

	// Watering
	int getThirst() {
		return thirstLevel;
	}

	int water() {
		return thirstLevel = 0; // if drink, thirst =0
	}

	// boredom
	int getBoredom() {
		return boredomLevel;
	}

	int play() {
		hungerLevel += 5; // play = more hungry &
		thirstLevel += 5; // play = more thirsty
		return boredomLevel = 0; // play = boredom = 0
	}

	// Tick/make time pass
	int getHungerTick() {
		int tick = generator.nextInt(5);
		hungerLevel += tick;
		return hungerLevel;
	}

	int getThirstTick() {
		int tick = generator.nextInt(5);
		thirstLevel += tick;
		return thirstLevel;
	}

	int getBoredomTick() {
		int tick = generator.nextInt(5);
		boredomLevel += tick;
		return boredomLevel;
	}

	@Override
	public String toString() {
		return ("[" + name + "] " + "[" + lifeForm + "] " + "[" + species + "] ");
	}

	public String getname() {
		return name;
	}

	public String getlifeForm() {
		return lifeForm;
	}

	public String getspecies() {
		return species;
	}

	public int gethungerLevel() {
		return hungerLevel;
	}

	public int getthirstLevel() {
		return thirstLevel;
	}

	public int boredomLevel() {
		return boredomLevel;
	}

	public int getpowerLevel() {
		int powerLevel = 0;
		return powerLevel;
	}

	public int getoilLevel() {
		int oilLevel = 0;
		return oilLevel;
	}

}
