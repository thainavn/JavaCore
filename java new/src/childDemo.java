public class childDemo extends parentDemo {
    //    String name = "QAClickAcademy";
    public childDemo() {
        System.out.println("child class constructor");
    }

    public void getString() {
        System.out.println(name);
        System.out.println(super.name);
    }

    public void getData() {
        super.getData();
        System.out.println("I am child class");
    }

    public static void main(String[] args) {
        childDemo cd = new childDemo();
        cd.getString();
        cd.getData();
    }
}
