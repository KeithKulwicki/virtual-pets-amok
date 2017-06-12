package virtualPetsAmok;

public class RoboCat extends Cat implements RoboPet {

	int oilLevel;

	public RoboCat(String nameParam, String descriptionParam) {
		super(nameParam, descriptionParam);
		oilLevel = 50;
	}

	@Override
	public void play() {
		happiness += 5;
		oilLevel -= 5;
	}

	@Override
	public void tick() {
		happiness -= (5 + generateRandom());
		oilLevel -= (5 + generateRandom());
	}

	@Override
	public void oilPet() {
		oilLevel += 50;
	}

	@Override
	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void recharge() {
		happiness += 5;
		health += 5;
	}
}