package StreamsLambdaExpression;

import java.util.ArrayList;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Alekhya");
        names.add("Adam");
        names.add("Ram");
        Long c = names.stream().filter(s -> s.startsWith("A")).count();
        System.out.println(c);
    }
}
