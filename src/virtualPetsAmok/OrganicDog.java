package virtualPetsAmok;

public class OrganicDog extends VirtualPet {
	public OrganicDog() {
		super("fido", "dog", "organic", 0, 0, 0);
	}
	@Override
	public String getname() {
		return "Fido";}
	
	@Override
	public String getlifeForm() {
	return "Organic";}
	
	@Override
	public String getspecies() {
	return "Dog";}
	
	@Override
	public int gethungerLevel() {
		return 30;}
	
	@Override
	public int getthirstLevel() {
	return 30;}	
	
	@Override
	public int boredomLevel(){
		return 30;}	

}
