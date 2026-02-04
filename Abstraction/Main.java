abstract class Animal {

    // abstract method
    abstract void sound();

    // normal method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    // implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.sleep();
    }
}
