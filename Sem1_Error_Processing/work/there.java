package work;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
 * целочисленный одномерный массив.
 * Метод должен пройтись по каждому элементу и проверить что он не равен null. А
 * теперь реализуйте следующую логику:
 * 
 * 1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
 * пользователя
 * 2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
 * “подсветить”
 */
public class there {
public static List<Integer> checkArray(Integer[] arr) {
        List<Integer> lst = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("Элемент под индексом " + i + " равен NULL");
                lst.add(i);
            }
        }
        return lst;
    }


public static void main(String[] args) {
        Integer[] array = {1, 2, 3, null, 5, 6, null, 9};
        List<Integer> errorList = checkArray(array);
        System.out.println("Элементы равные NULL находятся в списке под индексами: "+errorList);
    }


}
