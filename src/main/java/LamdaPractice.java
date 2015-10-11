import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by kanke on 06/10/2015.
 */
public class LamdaPractice {

    public static void main(String[] args) {

        /****** Stream API - Example *********/

        List<Integer> test = Arrays.asList(4,3,2,1).stream().filter(i -> i % 2 == 0).sorted().collect(Collectors.toList());

        System.out.println(test);
}}