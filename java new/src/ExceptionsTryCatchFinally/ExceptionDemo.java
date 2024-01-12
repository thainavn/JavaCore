package ExceptionsTryCatchFinally;

public class ExceptionDemo {
    public void getData(){
        int b = 7;
        int c = 0;
        try {
//            int k = b / c;
            int[] arr = new int[5];
            System.out.println(arr[5]);
        }
        catch (ArithmeticException a) {
            System.out.println("I caught the Arithmetic exception");
        } catch (IndexOutOfBoundsException i) {
            System.out.println("I caught the IndexBound exception");
        } catch (Exception e) {
            System.out.println("I caught the error/exception");
        }
        finally {
            System.out.println("delete cookies");
        }
    }
    public static void main(String[] args) {
        ExceptionDemo ed = new ExceptionDemo();
        ed.getData();
//        int b = 7;
//        int c = 0;
//        try {
//            int k = b / c;
////            int arr[] = new int[5];
////            System.out.println(arr[5]);
//        } catch (ArithmeticException a) {
//            System.out.println("I caught the Arithmetic exception");
//        } catch (IndexOutOfBoundsException i) {
//            System.out.println("I caught the IndexBound exception");
//        } catch (Exception e) {
//            System.out.println("I caught the error/exception");
//        }

    }
}
