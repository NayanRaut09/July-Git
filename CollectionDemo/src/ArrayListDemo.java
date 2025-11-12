import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {


    public static void main(String[] args) {


       List<Integer> list = Arrays.asList(10,40,20,50,70,80);

        System.out.println("Without sorting>>" +list);

        Collections.sort(list);

        System.out.println("After sorting>>" +list);


    }
}
