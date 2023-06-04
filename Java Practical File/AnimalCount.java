public class AnimalCount {
    private static int count = 0;
    private int age;
    private String name;
    private String species;

    public AnimalCount (int age, String name, String species) {
        this.age = age;
        this.name = name;
        this.species = species;
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Species: " + species);
    }

    public static void main(String[] args) {
        AnimalCount animal1 = new AnimalCount(5, "Buddy", "Dog");
        AnimalCount animal2 = new AnimalCount(3, "Fluffy", "Cat");
        AnimalCount animal3 = new AnimalCount(2, "Rex", "Dog");

        System.out.println("Total number of Animal objects created: " + AnimalCount.getCount());

        animal1.display();
        animal2.display();
        animal3.display();
    }
}
