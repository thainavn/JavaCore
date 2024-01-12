package String;

public class StringClassDemo {

    public static void main(String[] args) {
        // String: it is one of pre-built class in Java
        // 1. String literal
        // 2. By creating object of string
        String a = " java/training";// string literal
        System.out.println(a.charAt(2));
        System.out.println(a.indexOf("1"));
        System.out.println(a.substring(3, 6));
        System.out.println(a.substring(5));
        System.out.println(a.concat(" rahul teachers"));
        System.out.println(a.trim());
        System.out.println(a.toUpperCase());
        System.out.println(a.toLowerCase());
        String[] arr = a.split("/");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(a.replace("a", "e"));
    }


}
