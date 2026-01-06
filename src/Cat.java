public class Cat extends Pet{
    public Cat(int id, String name, int age) {
        super(id, name, age);
    }

    @Override
    public String getType() {
        return "Cat";
    }
}
