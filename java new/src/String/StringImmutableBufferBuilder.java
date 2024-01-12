package String;

public class StringImmutableBufferBuilder {
    public static void main(String[] args){
        String a = "hello";
        String b = "hello";
        String c = a.concat(" world");
        System.out.println(a);
//        System.out.println(c);
        String s = new String("hello");
        String s1 = new String("hello");

        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(a.equals(s));
        System.out.println(a==s);
        System.out.println(s==s1);
        System.out.println(a.equalsIgnoreCase(b));

        //StringBuffer and StringBuilder - Mutable
        StringBuffer sb = new StringBuffer("hello");
        sb.append("world");
        System.out.println(sb);
        sb.insert(2,"She");
        System.out.println(sb);
        sb.replace(5,7,"aa");
        System.out.println(sb);
        sb.deleteCharAt(12);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        //StringBuilder is not thread safe. It is Non Synchronized, so it is faster than StringBuffer
        StringBuilder sbb = new StringBuilder("hello");
    }
}
