public class Task3 {

     /**
     * Запускает код из задания 3.
     */
    public static void run() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так..."); // Это вверхний класс и он должен быть в котце
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

}
