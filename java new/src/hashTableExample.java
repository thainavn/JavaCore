import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class hashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(0,"hello");
        ht.put(1,"goodbye");
        ht.put(42,"morning");
        ht.put(3,"evening");
        Set hts = ht.entrySet();
        Iterator htse = hts.iterator();
        while (htse.hasNext());
    }
}
