package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author prabha
 */
public class SynArrayList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Test1");
        list.add("Test2");
        list.add("Test3");

        //synchronized (thread-safe)
        list = Collections.synchronizedList(list);

        // we must use synchronize block to avoid
        // non-deterministic behavior
        synchronized (list){
            Iterator<String> iterator = list.iterator();

            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
}
