public class Animal {
    private int age;
    private String name;
    private String species;

    public Animal() {
        age = 0;
        name = "";
        species = "";
    }

    public Animal(int age) {
        this.age = age;
        name = "";
        species = "";
    }

    public Animal(String name) {
        age = 0;
        this.name = name;
        species = "";
    }

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
        species = "";
    }

    public Animal(String name, String species) {
        age = 0;
        this.name = name;
        this.species = species;
    }

    public Animal(int age, String name, String species) {
        this.age = age;
        this.name = name;
        this.species = species;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
    }

    public static void main(String args[]) {
        Animal animal1 = new Animal();
        animal1.display();

        Animal animal2 = new Animal(5);
        animal2.display();

        Animal animal3 = new Animal("Fido");
        animal3.display();

        Animal animal4 = new Animal(2, "Buddy");
        animal4.display();

        Animal animal5 = new Animal("Fluffy", "Cat");
        animal5.display();

        Animal animal6 = new Animal(3, "Rex", "Dog");
        animal6.display();
    }
}
