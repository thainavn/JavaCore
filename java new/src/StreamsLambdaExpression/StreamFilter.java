package StreamsLambdaExpression;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");
        //there is no life for intermediate operation if there is no terminal operation
        //terminal operation will execute only if intermediate operation (filter) returns true
        //we can create stream
        //how to use filter in Stream API
        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);

        Long d = Stream.of("Abhijeet", "Don", "Aleksey", "Adam", "Ram").filter(s ->
        {
            return s.startsWith("A");
        }).count();
        System.out.println(d);
        //print all the names in ArrayList
        names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
        names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println(s));
    }
}
