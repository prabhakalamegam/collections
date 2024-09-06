package collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author prabha
 */
public class CollHashTable {

    public static void main(String[] args) {


        Map<String,Product> hasProd = new HashMap<>();

        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");

        hasProd.put(eBike.getName(),eBike);
        hasProd.put(roadBike.getName(),roadBike);

        Product nextPurchase = hasProd.get("E-Bike");

        //get method
        System.out.println(nextPurchase.getDescription());

        //get method , with no value
        // Product noValuePresent = hasProd.get("Car");
       // NUll Pointer
        //System.out.println(noValuePresent.getDescription());

        HashMap<Integer,String> practHashMap = new HashMap<>();
        practHashMap.put(1,"Test");
        practHashMap.put(2,"Test2");
        practHashMap.put(2,"Test12");
        practHashMap.put(null,"Testn");
        practHashMap.put(3,null);
        practHashMap.put(4,null);

        System.out.println(practHashMap);

        practHashMap.remove(3);
        System.out.println(practHashMap);

        System.out.println( "-----");
        System.out.println( practHashMap.entrySet());
        System.out.println( practHashMap.keySet());
        System.out.println( "-----Iterate over the set of all keys: ");
        //iterate 1
        for (Integer key : practHashMap.keySet()){
            System.out.println(practHashMap.get(key));
        }

        System.out.println( "-----Iterate over the set of all entries");

        for(Map.Entry<Integer,String> entry : practHashMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        System.out.println( "-----For each");

        practHashMap.forEach( (key,valu) -> {
            System.out.println(key);
            System.out.println(valu);
        });

        System.out.println( "-----getOrDefault");

        System.out.println(practHashMap.getOrDefault(3, "default"));
    }


}
