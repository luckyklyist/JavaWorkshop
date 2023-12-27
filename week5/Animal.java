class AnimalTest {
    private String name;
    private int age;

    public AnimalTest(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Dog dog = new Dog("Rex", 2, "Poodle");

    }
}