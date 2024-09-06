package collections;

import java.util.Arrays;
import java.util.List;

/**
 * @author prabha
 */
public class ArrayToCollection {

    public static void main(String[] args) {
        String student[] = {"Dave","Frank","Aris"};

        System.out.println(Arrays.toString(student));
        System.out.println(Arrays.asList(student));

        List<String> students = Arrays.asList(student);
        students.forEach(s -> System.out.println(s));
    }
}
