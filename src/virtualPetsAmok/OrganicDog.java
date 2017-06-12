package virtualPetsAmok;

public class OrganicDog extends Dog implements OrganicPet {

	protected int cageDirty;
	protected int hunger;
	protected int thirst;

	public OrganicDog(String newName, String newDescription) {
		super(newName, newDescription);
		cageDirty = 50;
		hunger = 50;
		thirst = 50;
	}

	public void feed() {
		hunger -= 25;
		happiness += 10;
		cageDirty += 10;
	}

	public void water() {
		thirst -= 25;
		happiness += 10;
		cageDirty += 10;
	}

	@Override
	public void walk() {
		cageDirty -= 25;
		happiness += 25;
		health += 10;
		hunger += 5;
		thirst += 5;
	}

	@Override
	public void play() {
		happiness += 25;
		hunger += 10;
		thirst += 10;
		health += 10;
	}

	@Override // I'm only returning a value because you said to...it's never
				// used in the shelter.
	public int tick() {
		hunger += (5 + generateRandom());
		thirst += (5 + generateRandom());
		happiness -= (5 + generateRandom());
		cageDirty += (5 + generateRandom());
		return cageDirty;
	}

	@Override
	public int getHunger() {
		return hunger;
	}

	public int getCageDirty() {
		return cageDirty;
	}

	public void cleanCage() {
		cageDirty -= 25;
		happiness -= 25;
		health -= 25;
	}

	@Override
	public int getThirst() {
		return thirst;
	}
}
