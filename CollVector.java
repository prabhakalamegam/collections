import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

/**
 * @author prabha
 */
public class CollVector {
    public static void main(String[] args) {

        // maintains insertion order
        // It is similar to ArrayList, but with two differences :

        //Vector is synchronized.
        Vector<Integer> ve = new Vector<>();

        ve.add(23);
        ve.add(45);
        ve.add(65);
        ve.add(78);

        System.out.println(ve);

        //find the largeste number
        int value =   Collections.max(ve);

        System.out.println(value);

        // compare and find the largest number
        Vector<Integer> vec = new Vector<>();

        vec.add(5);
        vec.add(6);

        int maxValue = Integer.MIN_VALUE;

        Iterator ite = vec.iterator();

        while(ite.hasNext()){

            int element = (Integer) ite.next();

            if(element >maxValue){
                maxValue = element;
            }
        }

        System.out.println(
                "The largest element present in Vector is : "
                        + maxValue);
    }
}
