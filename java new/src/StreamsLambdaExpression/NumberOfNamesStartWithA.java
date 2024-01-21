package StreamsLambdaExpression;

import java.util.ArrayList;

public class NumberOfNamesStartWithA {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Abhijeet");
        names.add("Don");
        names.add("Aleksey");
        names.add("Adam");
        names.add("Ram");
        int count = 0;
        for (int i = 0; i < names.size(); i++) {
            String actual = names.get(i);
            if (actual.startsWith("A")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
