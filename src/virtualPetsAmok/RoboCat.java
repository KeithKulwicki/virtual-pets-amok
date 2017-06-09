package virtualPetsAmok;

public class RoboCat extends VirtualPet {
	public RoboCat() {
		super("beta", "cat", "organic", 0, 0, 0);
	}
	@Override
	public String getname() {
		return "Beta";}
	
	@Override
	public String getlifeForm() {
	return "Robotic";}
	
	@Override
	public String getspecies() {
	return "Cat";}
	
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
