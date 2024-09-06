package collections;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author prabha
 */
public class EnumerationPrc {

    public static void main(String[] args) {

        Hashtable<Integer, String> hash
                = new Hashtable<Integer, String>();

        hash.put(1,"first");
        hash.put(2,"second");
        hash.put(3,"third");

        Enumeration e = hash.elements();

        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

    }

}
