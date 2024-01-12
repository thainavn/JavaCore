package ArraylistSetHashset;

import java.util.ArrayList;

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add("Thai");
        a.add("Bob");
        a.add("Bob");
        System.out.println(a);
        a.add(0, "student");
        a.add(4, "student");
        System.out.println(a);
//        a.remove(1);
//        System.out.println(a);
//        a.remove("Bob");
//        System.out.println(a);
//        a.removeAll(a);
//        System.out.println(a);
        System.out.println(a.get(2));
        System.out.println(a.contains("Thai"));
        System.out.println(a.indexOf("Bob"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
    }
}
