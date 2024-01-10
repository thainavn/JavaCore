import java.util.ArrayList;

public class arrayListExample {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Thai");
        a.add("Bob");
        System.out.println(a);
        a.add(0, "student");
        System.out.println(a);
        a.remove(1);
        System.out.println(a);
        a.remove("Bob");
        System.out.println(a);
        a.removeAll(a);
        System.out.println(a);
    }
}
