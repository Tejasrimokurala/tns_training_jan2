class GrandParent {
    void property() {
        System.out.println("Grandparent property");
    }
}

class Parent extends GrandParent {
    void house() {
        System.out.println("Parent house");
    }
}

class Child extends Parent {
    void bike() {
        System.out.println("Child bike");
    }
}

public class multilevelinheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.property();
        c.house();
        c.bike();
    }
}
