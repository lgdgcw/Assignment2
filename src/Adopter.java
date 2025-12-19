public class Adopter {

    private String fullName;
    private int age;
    private String phone;
    private Pet adoptedPet;

    public Adopter(String fullName, int age, String phone) {
        this.fullName = fullName;
        this.age = age;
        this.phone = phone;
    }

    // Getters & Setters (now USED)
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Pet getAdoptedPet() {
        return adoptedPet;
    }

    public void adoptPet(Pet pet) {
        if (pet.isAdopted()) {
            System.out.println("Sorry, " + pet.getName() + " is already adopted.");
        } else {
            adoptedPet = pet;
            pet.setAdopted(true);
            System.out.println(fullName + " adopted " + pet.getName());
        }
    }

    public void displayInfo() {
        System.out.println(
                "Adopter: " + getFullName() +
                        ", Age: " + getAge() +
                        ", Phone: " + getPhone()
        );

        if (getAdoptedPet() != null) {
            System.out.println("Adopted pet: " + getAdoptedPet().getName());
        } else {
            System.out.println("No adopted pets.");
        }
    }
}
