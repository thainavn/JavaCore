public class constructorDemo {
    public constructorDemo() {
        System.out.println("I am in the constructor");
        System.out.println("I am in the constructor lecture 1");
    }

    //Parameterized constructor
    public constructorDemo(int a, int b) {
        System.out.println("I am in the parameterized constructor with " + a + " and " + b);
        int c=a+b;
        System.out.println(c);
    }
    public constructorDemo(String str) {
        System.out.println(str);
    }

    public void getData() {
        System.out.println("I am the method");
    }

    public static void main(String[] args) {
        constructorDemo c = new constructorDemo();
        constructorDemo d = new constructorDemo(4, 5);
        constructorDemo a = new constructorDemo("hello");
    }
}
