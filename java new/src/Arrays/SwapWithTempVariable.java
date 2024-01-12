package Arrays;

public class SwapWithTempVariable {
    public static void main(String[] args) {
//        int[] a = {2, 6, 1, 4, 9};
        int a = 4;
        int b = 5;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }
}
