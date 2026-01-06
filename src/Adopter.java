import java.util.Objects;

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

    public void adoptPet(Pet pet) {
        if (pet.isAdopted()) {
            System.out.println("Pet already adopted.");
        } else {
            adoptedPet = pet;
            pet.setAdopted(true);
        }
    }

    @Override
    public String toString() {
        return "Adopter{" +
                "fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", adoptedPet=" + adoptedPet +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Adopter)) return false;
        Adopter adopter = (Adopter) o;
        return phone.equals(adopter.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone);
    }
}
