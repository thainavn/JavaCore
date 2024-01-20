package HashMapHashTable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(0, "hello");
        ht.put(1, "goodbye");
        ht.put(42, "morning");
        ht.put(3, "evening");
        Set<Map.Entry<Integer, String>> hts = ht.entrySet();
        Iterator<Map.Entry<Integer, String>> htse = hts.iterator();
        while (htse.hasNext()) ;
    }
}
