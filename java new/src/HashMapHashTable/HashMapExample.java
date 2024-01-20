package HashMapHashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(0, "hello");
        hm.put(1, "goodbye");
        hm.put(42, "morning");
        hm.put(3, "evening");
        System.out.println(hm.get(42));
        hm.remove(42);
        System.out.println(hm.get(42));
        Set<Map.Entry<Integer, String>> sn = hm.entrySet();
        for (Map.Entry<Integer, String> integerStringEntry : sn) {
//            System.out.println(it.next());
            Map.Entry mp = integerStringEntry;
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }
    }
}
