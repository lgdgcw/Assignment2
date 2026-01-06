import java.util.Objects;

public abstract class Pet {
    protected int id;
    protected String name;
    protected int age;
    protected boolean adopted;

    public Pet(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.adopted = false;
    }

    public abstract String getType(); // POLYMORPHISM

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean isAdopted() { return adopted; }
    public void setAdopted(boolean adopted) { this.adopted = adopted; }

    @Override
    public String toString() {
        return "Pet{id=" + id +
                ", name='" + name + '\'' +
                ", type=" + getType() +
                ", age=" + age +
                ", adopted=" + adopted + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return id == pet.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
