package StreamsLambdaExpression;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCollect {
    public static void main(String[] args) {

        List<String> ls = Stream.of("Abhijeet", "Don", "Alekhya", "Adam", "Rama")
                .filter(s -> s.endsWith("a"))
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));
        System.out.println("");

        //print unique number from this array
        //sort the array - 3rd index - 1, 2, 3, 5, 7, 9
        List<Integer> values = Arrays.asList(3, 2, 2, 7, 5, 1, 9, 7);
        values.stream().distinct().sorted().forEach(s -> System.out.println(s));
        System.out.println("");
        List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(li.get(2));

    }
}
