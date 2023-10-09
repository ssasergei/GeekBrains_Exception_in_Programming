public class App {
    public static void main(String[] args) throws Exception {

        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int n = 6;

        if (arr.length < n) {
            throw new ExceptionNew();
        } else {
            System.out.println(arr[n]);
        }
    }
}
