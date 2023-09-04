public class Dog {
    private String name;
    private int age;
    private Size size;
    private Breed breed;

    // Constructor 1
    public Dog(String name, int age, Size size, Breed breed) {
        this.name = name;
        this.age = age;
        this.size = size;
        this.breed = breed;
    }

    // Constructor 2
    public Dog(String name, int age, Size size) {
        this(name, age, size, null);
    }

    // Constructor 3
    public Dog(String name) {
        this(name, 0, null);
    }

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    // Additional behavior
    public void bark() {
        System.out.println(name + " says Woof Woof!");
    }
}
