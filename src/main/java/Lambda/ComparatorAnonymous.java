package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by kanke on 12/10/2015.
 */
public class ComparatorAnonymous {

    public static void main(String[] args) {
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        };


        List<String> list = Arrays.asList("big", "bigger", "largest", "more");
        Collections.sort(list, comparator);

        for (String l : list) {
            System.out.println(l);
        }
    }

}
