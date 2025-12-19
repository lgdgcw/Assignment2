public class Pet {

    private int id;
    private String name;
    private String type;
    private int age;
    private boolean adopted;

    public Pet(int id, String name, String type, int age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.adopted = false;
    }

    // All getters/setters USED
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }

    public void displayInfo() {
        System.out.println(
                "ID: " + id +
                        ", Name: " + name +
                        ", Type: " + type +
                        ", Age: " + age +
                        ", Adopted: " + adopted
        );
    }
}
