import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Java");   // duplicate allowed

        System.out.println(list);
    }
}

