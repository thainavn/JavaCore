package Arrays;

public class ArraysDemo {

    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        int[] b = {1, 4, 3, 5, 7};
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

}
