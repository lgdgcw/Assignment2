public class Main {
    public static void main(String[] args) {

        // use args to remove warning
        if (args.length == 0) {
            System.out.println("Application started without arguments");
        }

        // Create shelter
        Shelter shelter = new Shelter("Happy Paws", "Almaty");

        // Use getters
        System.out.println("Shelter name: " + shelter.getName());
        System.out.println("Shelter address: " + shelter.getAddress());

        // Create pets
        Pet pet1 = new Pet(1, "Buddy", "Dog", 3);
        Pet pet2 = new Pet(2, "Milo", "Cat", 2);
        Pet pet3 = new Pet(3, "Luna", "Dog", 1);

        // Use setters
        pet3.setAge(2);
        pet3.setType("Puppy");

        // Add pets
        shelter.addPet(pet1);
        shelter.addPet(pet2);
        shelter.addPet(pet3);

        // Show pets
        shelter.showAllPets();

        // Find pet by id (removes warning)
        Pet foundPet = shelter.findPetById(2);
        if (foundPet != null) {
            System.out.println("Found pet: " + foundPet.getName());
        }

        // Create adopters
        Adopter adopter1 = new Adopter("Railya Jan", 18, "+77001234567");
        Adopter adopter2 = new Adopter("Dana Sadykova", 22, "+77007654321");

        // Use setters
        adopter1.setPhone("+77009998877");
        adopter2.setAge(23);

        // Adoption
        adopter1.adoptPet(pet2);
        adopter2.adoptPet(pet2);
        adopter2.adoptPet(pet1);

        // Display info (uses getters internally)
        adopter1.displayInfo();
        adopter2.displayInfo();

        // Compare objects
        if (pet1.getAge() > pet3.getAge()) {
            System.out.println(pet1.getName() + " is older than " + pet3.getName());
        } else {
            System.out.println(pet3.getName() + " is older than " + pet1.getName());
        }
    }
}
