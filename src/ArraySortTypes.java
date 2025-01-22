import java.util.Arrays;
import java.util.Random;

public class ArraySortTypes {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        selectionSort(array);
    }


    // Сложность O(n2)
    public static void bubbleSort(int[] array) {
        boolean swapped;  // Флаг для отслеживания обменов
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;  // Устанавливаем флаг, если произошел обмен
                }
            }
            if (!swapped) {
                break;  // Если ни одного обмена, массив отсортирован
            }
        }
        System.out.println("Сортировка пузырьком: " + Arrays.toString(array));
    }

    // Сложность O(n2)
    public static void selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;  // Индекс минимального элемента
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Обмен текущего элемента с минимальным
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println("Сортировка выбором: " + Arrays.toString(array));
    }

}
