package IntroductionToJava;

public class FirstClass {
    int a = 5;

    public FirstClass() {
    }

    public void getData() {
        System.out.println("I am in method");
    }

    public static void main(String[] args) {
        FirstClass fn = new FirstClass();
        SecondClass sn = new SecondClass();
        sn.setData();
        fn.getData();
        System.out.println(fn.a);
        System.out.println("a");
        System.out.println("hi");
        System.out.println("hello world");
    }
}

