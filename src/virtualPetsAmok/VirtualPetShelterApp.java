package virtualPetsAmok;

import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {

		System.out.println("Thank you for volunteering at SebMax Virtual Pet Shelter!");
		System.out.println("Pet Status:");

		VirtualPetShelter shelter = new VirtualPetShelter();
		Scanner input = new Scanner(System.in);

		OrganicPet alpha = new OrganicDog("Alpha", "Pit Bull");
		shelter.intake(alpha);
		RoboPet bravo = new RoboDog("Bravo", "Robo-dog");
		shelter.intake(bravo);
		OrganicPet charlie = new OrganicCat("Charlie", "Maine Coon");
		shelter.intake(charlie);
		RoboPet delta = new RoboCat("Delta", "Robo-cat");
		shelter.intake(delta);

		boolean quit = false;

		do {// test for litterbox overflow
			if (shelter.getLitterbox() >= 100) {
				System.out.println("*** Clean the organic cats' litterbox. It's having a negatively health impact ***");
				for (VirtualPet pet : shelter.pets()) {
					if (pet instanceof OrganicCat) {
						((OrganicCat) pet).depleteHealth();
					}
				}
			} // test each dog cage messiness
			for (VirtualPet pet : shelter.pets()) {
				if (pet instanceof OrganicDog) {

					if (((OrganicDog) pet).getCageDirty() >= 100) {
						System.out.println("*** Clean organic dog " + pet.getName()
								+ "'s cage. It's having a negative health impact ***");
						((OrganicDog) pet).depleteHealth();
					}
				}
			} // test robotic pets for maintenance issues
			for (VirtualPet pet : shelter.pets()) {
				if (pet instanceof RoboCat) {

					if (((RoboPet) pet).getOilLevel() <= 10) {
						System.out.println(
								"*** Oil robo-pet " + pet.getName() + ". It's having a negative health impact ***");
						pet.depleteHealth();
					}
				}
			}

			System.out.println("Name\t|Happy\t|Health\t|Hunger\t|Thirst\t|OilLvl\t|CageMess");
			System.out.println("--------|-------|-------|-------|-------|-------|-------|");

			for (VirtualPet currentPet : shelter.pets()) {
				System.out.print(currentPet.getName() + "\t|" + ((VirtualPet) currentPet).getHappiness() + "\t|"
						+ ((VirtualPet) currentPet).getHealth() + "\t|");
				if (currentPet instanceof OrganicPet) {
					System.out.print(((OrganicPet) currentPet).getHunger() + "\t|"
							+ ((OrganicPet) currentPet).getThirst() + "\t|N/A\t|");
				} else if (currentPet instanceof RoboPet) {
					System.out.print("N/A\t|N/A\t|" + ((RoboPet) currentPet).getOilLevel() + "\t|");
				}
				if (currentPet instanceof OrganicDog) {
					System.out.print("" + ((OrganicDog) currentPet).getCageDirty() + "\t|");
				} else {
					System.out.print("N/A\t|");
				}
				System.out.print("\n");

			}

			System.out.println("Shelter Litter Box Soil Level: " + shelter.getLitterbox());
			System.out.println("\nSelect what would you like to do from list below:");
			System.out.println("1. Feed all organic pets");
			System.out.println("2. Water all organic pets");
			System.out.println("3. Play with a pet");
			System.out.println("4. Adopt a pet");
			System.out.println("5. Admit a pet");
			System.out.println("6. Clean organic dog cages");
			System.out.println("7. Clean organic cat litterbox");
			System.out.println("8. Walk Dogs");
			System.out.println("9. Maintain all RoboPets");
			System.out.println("10. Ignore pets");
			System.out.println("11. Exit");
			String response = input.nextLine();

			switch (response) {
			case "1":
				shelter.feedAllOrganic();
				System.out.println("All organic pets are fed!");
				break;
			case "2":
				shelter.waterAllOrganic();
				System.out.println("All organic pets are watered!");
				break;
			case "3": // play
				System.out.println("Play with a pet.");
				displayPets(shelter);
				System.out.println("\nSelect from list of pets available for play.");
				String petName = input.nextLine();
				shelter.playWithOnePet(shelter.getPet(petName));
				System.out.println("Enjoy playing with " + shelter.getPet(petName).getName() + ". \n");
				break;
			case "4": // adopt
				System.out.println("AWESOME! Adopt a pet.");
				displayPets(shelter);
				System.out.println("Select from list of pets avaiable for adoption.");
				String nameToAdopt = input.nextLine();
				VirtualPet pet = shelter.getPet(nameToAdopt);
				shelter.adoptPet(pet);
				System.out.println("Enjoy your new Forever Home, " + pet.getName() + ". We'll miss you!\n");
				break;
			case "5":// intake
				System.out.println("We have more than enough room! Enter lifeform (organic or robotic):");
				String lifeform = input.next();
				if (lifeform.equalsIgnoreCase("organic")) {
					System.out.println("Enter organic pet's species (cat or dog):");
					String species = input.next();
					input.nextLine();
					if (species.equalsIgnoreCase("dog")) {
						System.out.println("Enter organic dog's name:");
						String name = input.nextLine();
						System.out.println("Enter organic dog's brief description:");
						String description = input.nextLine();
						OrganicPet od = new OrganicDog(name, description);
						shelter.intake(od);
						System.out.println("Welcome, " + od.getName() + "!");
					} else if (species.equalsIgnoreCase("cat")) {
						System.out.println("Enter organic cat's name:");
						String name = input.nextLine();
						System.out.println("Enter organic cat's brief description:");
						String description = input.nextLine();
						OrganicPet oc = new OrganicCat(name, description);
						shelter.intake(oc);
						System.out.println("Welcome, " + oc.getName() + "!\n");
					}

				} else if (lifeform.equalsIgnoreCase("robotic")) {
					System.out.println("Enter robo-pet's species (cat or dog):");
					String species = input.next();
					input.nextLine();

					if (species.equalsIgnoreCase("dog")) {
						System.out.println("Enter robo-dog's name:");
						String name = input.nextLine();
						System.out.println("Enter robo-dog's brief description:");
						String description = input.nextLine();
						RoboPet rd = new RoboDog(name, description);
						shelter.intake(rd);
						System.out.println("Welcome, " + rd.getName() + "!\n");

					} else if (species.equalsIgnoreCase("cat")) {
						System.out.println("Enter robo-cat's name:");
						String name = input.nextLine();
						System.out.println("Enter robo-cat's brief description:");
						String description = input.nextLine();
						RoboPet rc = new RoboCat(name, description);
						shelter.intake(rc);
						System.out.println("Welcome, " + rc.getName() + "!\n");
					}
				}
				break;
			case "6":
				shelter.cleanDogCages();
				System.out.println("All the organic dog cages are clean!\n");
				break;
			case "7":
				shelter.cleanLitterbox();
				System.out.println("The litterbox is clean!\n");
				break;
			case "8":
				shelter.walkDogs();
				System.out.println("All the dogs walked!\n");
				break;
			case "9":
				shelter.maintainAllRoboPets();
				System.out.println("All robo-pets maintained!\n");
				break;
			case "10":
				// tick
				System.out.println("Are you looking for anything in particular?\n");
				break;
			case "11":
				System.out.println("Y'all come back now, y'hear?\n");
				System.exit(0);
			default:
				System.out.println("Invalid entry. Try again.\n");
				break;
			}
			shelter.tickAllPets();

		} while (!quit);
		input.close();
	}

	private static void displayPets(VirtualPetShelter shelter) {
		for (VirtualPet currentPet : shelter.pets()) {
			System.out.println("" + currentPet);
		}
	}
}
