package work;

/**
 * Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
 * Если длина массива меньше некоторого заданного минимума,
 * метод возвращает -1, в качестве кода ошибки, иначе - длину массива.
 */
public class one {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println(checkArray(array));

    }

    public static int checkArray(int[] arr) {
        int n = 60;
        if (arr.length > n) {
            return arr.length;
        }
        return -1;
    }
}
