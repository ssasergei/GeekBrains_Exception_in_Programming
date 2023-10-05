import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

     /**
     * Запускает код из задания 1.
     */

Scanner scanner = new Scanner(System.in);


    /**
     * Метод запрашивает у пользователя число типа float
     * 
     * @param message Сообщение пользователю
     * @return Введенное пользователем число
     */

    public float getUserNumber(String message) {
        float userInput = 0;
        boolean flag = true;

        do {
            try {
                System.out.println(message);
                userInput = scanner.nextFloat();
                flag = false;
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("Error Вы ввели не верное значение");
            }
        } while (flag);

        return userInput;
    }

}
