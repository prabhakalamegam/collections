package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author prabha
 */
public class ReverseArrayList {

    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        //Duplicates are allowed
        // maintains insertion order
        // Size of the Array can be dynamically increased
        // nullvalues are allowed, mutliple null can be
        myList.add("AWS");
        myList.add("Java");
        myList.add("AWS");
        myList.add(null);
        myList.add("spring");
        myList.add(null);

        //Before Reverse
        System.out.println(myList);

        //works on index based
        System.out.println(myList.get(1));

        //After Reverse
        Collections.reverse(myList);

        System.out.println(myList);

    }
}
