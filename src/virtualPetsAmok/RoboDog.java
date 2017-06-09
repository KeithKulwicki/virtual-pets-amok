package virtualPetsAmok;

public class RoboDog extends VirtualPet {
	public RoboDog() {
		super("alpha", "dog", "organic", 0, 0, 0);
	}
	@Override
	public String getname() {
		return "Alpha";}
	
	@Override
	public String getlifeForm() {
	return "Robotic";}
	
	@Override
	public String getspecies() {
	return "Dog";}
	
	@Override
	public int getpowerLevel() {
		return 0;}
	
	@Override
	public int getoilLevel() {
		return 0;}
	
	@Override
	public int gethungerLevel() {
		return 0;}
	
	@Override
	public int getthirstLevel() {
	return 0;}	
	
	@Override
	public int boredomLevel(){
		return 0;}	

}

