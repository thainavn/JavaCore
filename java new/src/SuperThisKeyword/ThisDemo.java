package SuperThisKeyword;

public class ThisDemo {
    int a = 2;

    public void getData() {
        int a = 3;
        System.out.println(a);
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        td.getData();


    }
}
