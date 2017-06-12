package virtualPetsAmok;

public class OrganicCat extends Cat implements OrganicPet {
	protected int hunger;
	protected int thirst;

	public OrganicCat(String nameParam, String descriptionParam) {
		super(nameParam, descriptionParam);
		hunger = 50;
		thirst = 50;
	}

	@Override
	public void feed() {
		hunger -= 25;
		happiness += 5;
	}

	@Override
	public void water() {
		thirst -= 25;
		happiness += 5;
	}

	@Override
	public void play() {
		happiness += 5;
		hunger += 5;
		thirst += 5;
	}

	@Override
	public int tick() { // increments hunger, thirst, and mood, and returns
						// integer which will be used to affect litter
		hunger += (5 + generateRandom());
		thirst += (5 + generateRandom());
		happiness -= (5 + generateRandom());
		return (1 + generateRandom());
	}

	@Override
	public int getHunger() {
		return hunger;
	}

	@Override
	public int getThirst() {
		return thirst;
	}

}
