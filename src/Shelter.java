import java.util.ArrayList;

public class Shelter {

    private String name;
    private String address;
    private final ArrayList<Pet> pets;

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
        this.pets = new ArrayList<>();
    }

    // Getters & setters USED
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        System.out.println(pet.getName() + " added to shelter.");
    }

    public void showAllPets() {
        System.out.println("\nPets in shelter " + getName() + ":");
        for (Pet pet : pets) {
            pet.displayInfo();
        }
    }

    public Pet findPetById(int id) {
        for (Pet pet : pets) {
            if (pet.getId() == id) {
                return pet;
            }
        }
        return null;
    }
}
