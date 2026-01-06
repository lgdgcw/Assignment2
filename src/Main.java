public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter("Happy Paws", "Almaty");

        Pet dog = new Dog(1, "Buddy", 3);
        Pet cat = new Cat(2, "Milo", 2);
        Pet dog2 = new Dog(3, "Luna", 1);

        shelter.addPet(dog);
        shelter.addPet(cat);
        shelter.addPet(dog2);

        Adopter a1 = new Adopter("Railya Jan", 18, "+77001234567");
        a1.adoptPet(cat);

        System.out.println("\nAvailable pets:");
        for (Pet p : shelter.getAvailablePets()) {
            System.out.println(p);
        }

        System.out.println("\nSorted by age:");
        shelter.sortByAge();
        shelter.showAllPets();
    }
}
