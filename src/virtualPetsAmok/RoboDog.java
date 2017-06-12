package virtualPetsAmok;

public class RoboDog extends Dog implements RoboPet {
	int oilLevel;

	public RoboDog(String newName, String newDescription) {
		super(newName, newDescription);
		oilLevel =  50 ;
	}

	@Override
	public void walk() {
		happiness += 20;
		health += 10;
		oilLevel -=  5 ;
	}

	@Override
	public void play() {
		happiness += 10;
		oilLevel -=  5 ;
	}

	@Override 
	public void tick() {
		happiness -= (5 + generateRandom());
		oilLevel -= (5 + generateRandom());	
	}

	@Override
	public void oilPet() {
		oilLevel +=  50 ;
	}

	@Override
	public int getOilLevel() {
		return oilLevel;
	}

	@Override
	public void recharge() {
		happiness += 10;
		health += 10;
	}

}
