public class Tasks {

    public static void main(String[] args) {

    }

    /*
       Отсортируйте массив строк в лексикографическом порядке
    */
    public static void stringSort(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i].compareTo(array[j]) > 0) {
                    // Swap
                    String temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /*
    Реализуйте функцию, которая принимает массив и булевое значение.
    Если значение true, сортируйте массив по возрастанию, иначе по убыванию.
     */
    public static void sortArray(int[] array, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((ascending && array[i] > array[j]) || (!ascending && array[i] < array[j])) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static int[] removeDuplicates(int[] array) {
        // Сортируем массив для упрощения удаления дубликатов
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Удаляем дубликаты
        int[] temp = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                temp[index++] = array[i];
            }
        }
        // Добавляем последний элемент, если он не является дубликатом
        temp[index++] = array[array.length - 1];

        // Создаем новый массив с уникальными элементами
        int[] result = new int[index];
        System.arraycopy(temp, 0, result, 0, index);
        return result;
    }
}
