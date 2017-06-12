package virtualPetsAmok;

import  java.util.Collection ;
import  java.util.HashMap ;
import  java.util.Map ;

public class VirtualPetShelter {
	// Map of pets and attributes
	private int litterbox = 50;

	private Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	public int getLitterbox() {
		return litterbox;
	}

	public void cleanLitterbox() {
		litterbox -= 50;
	}

	public void maintainAllRoboPets() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof RoboPet) {
				((RoboPet) pet).oilPet();
				((RoboPet) pet).recharge();
			}
		}
	}

	public void cleanDogCages() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicDog) {
				((OrganicDog) pet).cleanCage();
			}
		}
	}

	public void walkDogs() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof Dog) {
				((Dog) pet).walk();
			}
		}

	}

	public void intake(VirtualPet pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public void intake(RoboPet pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public  void  intake (OrganicPet  pet) {
		shelterPets.put(pet.getName(), (VirtualPet) pet);
	}

	public void feedAllOrganic() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).feed();
			}
		}
		litterbox += 5;
	}

	public void waterAllOrganic() {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicPet) {
				((OrganicPet) pet).water();
			}
		}
		litterbox += 5;
	}

	// Tick method 
	void  tickAllPets () {
		for (VirtualPet pet : pets()) {
			if (pet instanceof OrganicCat) {
				litterbox += ((OrganicCat) pet).tick();
				
			} 
			if (!(pet instanceof OrganicCat)) 
				if (pet instanceof OrganicDog){
				((OrganicDog) pet).tick();
				}
				if (pet instanceof RoboPet){
				((RoboPet) pet).tick();
			}
		}
	}

	// Method return collection all shelter pets
	public Collection<VirtualPet> pets() {
		return shelterPets.values();
	}

	// Method return shelter pet from map by name
	public VirtualPet getPet(String name) {
		return shelterPets.get(name);

	}

	// Method play with one pet
	public void playWithOnePet(VirtualPet participant) {
		participant.play();
	}

	// Method adopt pet (out)
	public void adoptPet(VirtualPet pet) {
		shelterPets.remove(pet.getName());
	}
}