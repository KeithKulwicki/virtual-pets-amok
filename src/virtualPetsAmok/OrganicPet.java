package virtualPetsAmok;

public interface OrganicPet {

	String getName();
	void feed();
	void water();	
	int  getHunger ();
	int  getThirst ();
	int  tick ();

}