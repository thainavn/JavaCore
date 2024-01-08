public class childClassDemo extends ParentClassDemo {
    public void getData(int a) {
        System.out.println(a);
    }

    public void getData(String a) {
        System.out.println(a);
    }

    public void getData(int a, int b) {
        System.out.println(b);
    }

    public void engine() {
        System.out.println("new engine");
    }

    public void colour() {
        System.out.println(color);
    }

    public void audioSystem() {
        System.out.println("new audio child");
    }

    public static void main(String[] args) {
        childClassDemo cd = new childClassDemo();
        cd.colour();
        cd.Brakes();
        cd.getData(2);
        cd.getData("hello");
        cd.getData(2, 3);
        cd.audioSystem();
    }
}
