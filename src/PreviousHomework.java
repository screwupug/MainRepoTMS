import java.util.Scanner;

public class PreviousHomework {

    public static void main(String[] args) {

    }


    public static void reversalOfWords() {
        System.out.println("Enter your message: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        StringBuilder word = new StringBuilder(); // Используем StringBuilder для накопления символов в слове

        for (int i = input.length() - 1; i >= 0; i--) {
            char currentChar = input.charAt(i);
            if (currentChar == ' ') {
                if (!word.isEmpty()) {
                    result.append(word).append(" "); // Добавляем накопленное слово и пробел
                    word.setLength(0); // Очищаем слово для следующего накопления
                }
            } else {
                word.insert(0, currentChar); // Добавляем символ в начало текущего слова
            }
        }

        if (!word.isEmpty()) {
            result.append(word); // Добавляем последнее слово
        }

        System.out.println("Reversed words: " + result.toString().trim());
    }

    public static void reversalOfWordsArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        System.out.println("Результат: " + reversed.toString().trim());
    }
}
