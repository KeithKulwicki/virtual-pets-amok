package virtualPetsAmok;

import java.util.Random;

public class VirtualPet {

	private Random generator = new Random();

	// include appropriate instance variable(s) to store the pets who reside at
	// the shelter
	String name;
	String lifeForm;
	String species;
	int hungerLevel;
	int thirstLevel;
	int boredomLevel;

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
		return ("[" + name + "] " + lifeForm + species);
	}

}
