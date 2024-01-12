package Constructor;

public class ConstructorDemo {
    public ConstructorDemo() {
        System.out.println("I am in the constructor");
        System.out.println("I am in the constructor lecture 1");
    }

    //Parameterized constructor
    public ConstructorDemo(int a, int b) {
        System.out.println("I am in the parameterized constructor with " + a + " and " + b);
        int c=a+b;
        System.out.println(c);
    }
    public ConstructorDemo(String str) {
        System.out.println(str);
    }

    public void getData() {
        System.out.println("I am the method");
    }

    public static void main(String[] args) {
        ConstructorDemo c = new ConstructorDemo();
        ConstructorDemo d = new ConstructorDemo(4, 5);
        ConstructorDemo a = new ConstructorDemo("hello");
    }
}
