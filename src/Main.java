import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        arrayMethods(array);
        matrixArray();
    }


    private static void arrayInit() {
        int[] first = new int[10];
        int[] second = new int[] {1, 2, 3, 4};
        System.out.println(second.length);
        int[] third = {1, 2, 3, 4};
        String[] array = new String[10];
        System.out.println(Arrays.toString(array));

        for (String y : array) {
            System.out.println(y);
        }
    }

    private static void arrayMethods(int[] array) {
        int[] secondArray = new int[array.length];
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println("Сортировка: " + Arrays.toString(array));
        int index = Arrays.binarySearch(array, 2);
        System.out.println("Резултат поиска: " + index);
        System.arraycopy(array, 0, secondArray, 0, secondArray.length);
        System.out.println("Результат копирования: " + Arrays.toString(secondArray));
    }

    private static void matrixArray() {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
        for (int[] array : matrix) {
            for (int i : array) {
                System.out.println(i);
            }
        }
        printArray(matrix);
    }

    private static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("]");
        }
    }

    private static void printArray(int[][][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print(array[i][j][k]);
                }
            }
            System.out.println("]");
        }
    }
}
