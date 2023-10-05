package work;

/** 
* Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
* Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения: метод может работать 
* только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. 
* Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
*/ 
public class four {
    
public static void main(String[] args) {
        int[][] array = {{1,0,1},{0,0,1},{1,0,1}};
        System.out.println(test(array));
    }

    public static int test(int[][] arr){
        int sum=0;
        int arrStr = arr.length;
        for (int i = 0; i < arrStr; i++){
            if(arrStr != arr[i].length){throw new RuntimeException();}
        }

        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr[i].length;j++){
                if(arr[i][j]>1){throw new RuntimeException();}
                sum+=arr[i][j];
            }
        }

        return sum;
    }
}
