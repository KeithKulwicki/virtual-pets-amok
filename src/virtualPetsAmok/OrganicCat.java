package virtualPetsAmok;


public class OrganicCat extends VirtualPet {
		public OrganicCat() {
			super("tigger", "cat", "organic", 0, 0, 0);
		}
		@Override
		public String getname() {
			return "Tigger";}
		
		@Override
		public String getlifeForm() {
		return "Organic";}
		
		@Override
		public String getspecies() {
		return "Cat";}
		
		@Override
		public int gethungerLevel() {
			return 20;}
		
		@Override
		public int getthirstLevel() {
		return 20;}	
		
		@Override
		public int boredomLevel(){
			return 20;}	

}
