package StreamsLambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamMap {
    public static void main(String[] args) {
        //print names which have the last letter as "a" with uppercase
        Stream.of("Abhijeet", "Don", "Alekseya", "Adam", "Rama").filter(s -> s.endsWith("a")).map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        //print names which have the first letter as "A" with uppercase and sorted
        List<String> names1 = Arrays.asList("Azbhijeet", "Don", "Alekhya", "Adam", "Rama");
        names1.stream().filter(s -> s.startsWith("A"))
                .sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

        ArrayList<String> names = new ArrayList<String>();
        names.add("man");
        names.add("Don");
        names.add("women");
        //merging 2 different lists
        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
//      newStream.sorted().forEach(s -> System.out.println(s));
        boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("A77dam"));
        System.out.println(flag);
    }
}
