import java.util.Arrays;
import java.util.Random;

public class ArraySortTypes {

    public static void main(String[] args) {
        Random random = new Random();
        int[] array = {6, 1, 2, 9, 8};
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
    }


    // Сложность O(n2)
    public static void bubbleSort(int[] array) {
        boolean swapped;  // Флаг для отслеживания обменов
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            // - i чтобы не смотреть на последний элемент, который уже отсортирован
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Обмен элементов
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;  // Устанавливаем флаг, если произошел обмен
                }
                count++;
            }
            if (!swapped) {
                break;  // Если ни одного обмена, массив отсортирован
            }
        }
        System.out.println("Сортировка пузырьком: " + Arrays.toString(array));
        System.out.println("Количество перестановок: " + count);
    }

    public static void bubbleSortVariant2(int[] array) {
        boolean isSorted = false;
        int buf;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(array));
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

    // Сложность O(n2)
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) { // Проходим по массиву начиная со второго элемента
            System.out.println("--------------------------------------------------------------------");
            int key = array[i];                  // Текущий элемент, который нужно вставить
            System.out.println("I = " + i);
            System.out.println("Текущий элемент цикла key = " + key);
            int j = i - 1;                       // Начинаем с последнего элемента отсортированной части
            System.out.println("Текущее значение j " + j);
            System.out.println("Текущий элемент с индексом j " + array[j]);
            while (j >= 0 && array[j] > key) {   // Пока текущий элемент меньше элемента в отсортированной части
                System.out.println("Условие истино, текущий массив до сдвижения: " + Arrays.toString(array));
                array[j + 1] = array[j];         // Сдвигаем элемент вправо
                j--;
                System.out.println("Условие истино, текущий массив после сдвижения: " + Arrays.toString(array));
            }
            array[j + 1] = key; // Вставляем текущий элемент на нужное место
            System.out.println("текущий массив после вставки текущего элемента: " + Arrays.toString(array));
        }
        System.out.println("Сортировка вставками: " + Arrays.toString(array));
    }

    // Сложность O(n log n)
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Разделение массива на две части
            int partitionIndex = partition(array, low, high);

            // Рекурсивная сортировка левой части
            quickSort(array, low, partitionIndex - 1);

            // Рекурсивная сортировка правой части
            quickSort(array, partitionIndex, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        // Выбираем пивот из середины
        int pivot = array[low + (high - low) / 2];
        System.out.println("Середина массива: " + pivot);
        int left = low;
        int right = high;

        while (left <= right) {
            System.out.println("Начало цикла while");
            System.out.println("Левый индекс: " + left);
            System.out.println("Правый индекс: " + right);
            // Находим элемент слева, который больше или равен пивоту
            while (array[left] < pivot) {
                System.out.println("Находим элемент слева, кот больше или равен пивоту");
                System.out.println(array[left] + " < " + pivot);
                left++;
                System.out.println("Увеличиваем левый индекс " + left);
            }
            // Находим элемент справа, который меньше или равен пивоту
            while (array[right] > pivot) {
                System.out.println("Находим элемент справа, кот меньше или равен пивоту");
                System.out.println(array[right] + " > " + pivot);
                right--;
                System.out.println("Уменьшаем правый индекс " + right);
            }
            // Если левый индекс <= правого, меняем элементы местами
            if (left <= right) {
                System.out.println("Меняем " + array[left] + " и " + array[right] + " местами");
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
            System.out.println(Arrays.toString(array));
            System.out.println("---------------------------------------------------------------");
        }
        return left; // Точка разделения
    }

}
