import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
        firthTask();
    }

    /*
    Запросите у пользователя 5 чисел, сохраните их в массив и выведите сумму всех элементов.
     */
    private static void firstTask() {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число: ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("Сумма чисел: " + sum);
    }

    /*
    Напишите программу, которая находит второй по величине элемент в массиве.
     */
    public static Integer secondTask(int[] array) {
        if (array.length < 2) {
            System.out.println("Недостаточно элементов для поиска второго по величине.");
            return null;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Все элементы одинаковы.");
            return null;
        }
        return secondLargest;
    }

    /*
    Запросите у пользователя матрицу 2x3 и найдите сумму всех элементов.
     */
    private static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        int[][] matrix = new int[2][3];
        int sum = 0;

        System.out.println("Введите элементы матрицы 2x3:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Элемент [%d][%d]: ", i + 1, j + 1);
                matrix[i][j] = scanner.nextInt();
                sum += matrix[i][j];
            }
        }

        System.out.println("Введенная матрица:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Сумма всех элементов матрицы: " + sum);
    }

    /*
    Создайте куб размером 2x2x2, заполните числами от 1 до 8 и выведите все элементы.
     */
    private static void firthTask() {
        int[][][] cube = new int[2][2][2];
        int value = 1;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    cube[i][j][k] = value++;
                }
            }
        }

        System.out.println("Элементы куба 2x2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.printf("cube[%d][%d][%d] = %d%n", i, j, k, cube[i][j][k]);
                }
            }
        }
    }
}
