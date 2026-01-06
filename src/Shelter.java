import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Shelter {
    private String name;
    private String address;
    private List<Pet> pets = new ArrayList<>();

    public Shelter(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void addPet(Pet pet) {
        pets.add(pet);
    }

    // SEARCH
    public Pet findPetById(int id) {
        for (Pet pet : pets) {
            if (pet.getId() == id) return pet;
        }
        return null;
    }

    // FILTER
    public List<Pet> getAvailablePets() {
        List<Pet> result = new ArrayList<>();
        for (Pet pet : pets) {
            if (!pet.isAdopted()) result.add(pet);
        }
        return result;
    }

    // SORT
    public void sortByAge() {
        pets.sort(Comparator.comparingInt(Pet::getAge));
    }

    public void showAllPets() {
        for (Pet pet : pets) {
            System.out.println(pet);
        }
    }
}
