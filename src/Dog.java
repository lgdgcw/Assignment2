public class Dog extends Pet{
    public Dog(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String getType() {
        return "Dog";
    }
}
