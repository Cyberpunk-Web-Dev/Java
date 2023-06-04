public class Overloading {

    public static void main(String[] args) {
        int result1 = add(1, 2);
        double result2 = add(1.5, 2.5);
        int result3 = add(1, 2, 3);
        
        System.out.println("Result1: " + result1);
        System.out.println("Result2: " + result2);
        System.out.println("Result3: " + result3);

        Animal animal = new Animal();
        animal.makeSound();
        
        Dog dog = new Dog();
        dog.makeSound();
    }
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static double add(double a, double b) {
        return a + b;
    }
    
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    static class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound");
        }
    }
    
    static class Dog extends Animal {
        public void makeSound() {
            System.out.println("The dog barks");
        }
    }
}
