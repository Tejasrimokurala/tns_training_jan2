class A {
    void display() {
        System.out.println("Class A display method");
    }
}

class B extends A {

    @Override
    void display() {
        System.out.println("Class B display method");
    }
}

public class Anno {
    public static void main(String[] args) {
        A obj = new B();
        obj.display();
    }
}
