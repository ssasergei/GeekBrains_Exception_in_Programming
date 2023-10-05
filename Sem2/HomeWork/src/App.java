public class App {
    public static void main(String[] args) throws Exception {

        // Задание 1.

        // System.out.println("\n Task1. \n");
        Task1 task1 = new Task1();
        System.out.println("Метод getUserNumber вернул число: " + task1.getUserNumber("Введите число типа float: "));

        // Задание 2.
        System.out.println("\n Task2. \n");
        Task2 task2 = new Task2();
        int[] intArray1 = {1,2,3,4,5,6,7,8,1};
        int[] intArray2 = {4,5,6,7,8};
        task2.run(intArray1);
        task2.run(intArray2);



        // Задание 3.
        System.out.println("\n Task3. \n");
        Task3 task3 = new Task3();
        task3.run();;

        // Задание 4.
        System.out.println("\n Task4. \n");
        Task4 ex04 = new Task4();
        System.out.println(
                "Метод getUserString вернул строку: \"" + ex04.getUserString("Введите данные типа String: ") + "\"");

    }
}
