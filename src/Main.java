public class Main {

    public static void main(String[] args) {

    }

    private static void stringConstructor() {
        // Создание с помощью строковых литералов
        String str = "This is text";
        // Создание с помощью конструктора
        String constructorStr = new String("This is text");
    }

    private static void stringMethods() {
        String str = "Hello world";
        // Длина строки. Пробел тоже символ и учитывается при подсчете
        System.out.println(str.length());

        // Конкатенация строк
        String concatStr = str.concat(" !");
        System.out.println(concatStr);

        String newStr = concatStr + " new text";
        System.out.println(newStr);

        newStr += " some text";
        System.out.println(newStr);

        // Concat NPE
        String nullStr = null;
//        String nullConcat = str.concat(nullStr);
//        System.out.println(nullConcat);
        String g = str + nullStr;
        System.out.println(g);
    }

    private static void numberToString() {
        int number = 10;
        double number2 = 10.0;
        String variant1 = number + "";
        System.out.println("Variant 1: " + variant1);
        String variant2 = String.valueOf(number);
        System.out.println("Variant 2: " + variant2);
        String variant3 = Integer.toString(number);
        System.out.println("Variant 3: " + variant3);
        String variant3WithDouble = Double.toString(number2);
        System.out.println("Variant 3_double: " + variant3WithDouble);
    }

    private static void stringToNumber() {
        String str = "str";
        int number = Integer.parseInt(str);
        double number2 = Double.parseDouble(str);
        float number3 = Float.parseFloat(str);
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
    }

    private static void stringFormat() {
        int a = 10;
        double b = 12.9;
        String str = "строка";
        String formatStr = String.format("Строка %s, целое число %d, число с плавающей запятой %.1f", str, a, b);
        System.out.println(formatStr);
    }

    private static void stringBuilderExample() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        System.out.println(sb);
        // offset - индекс, начиная с которого будет происходить вставка новой строки
        sb.insert(0, "world");
        System.out.println(sb);
        // start - включительно end - исключительно
        sb.replace(0, 5, "");
        System.out.println(sb);
        // start - включительно end - исключительно
        sb.delete(0, 5);
        System.out.println(sb);

        StringBuilder newSb = new StringBuilder("Hello world");
        newSb.reverse();
        System.out.println(newSb);
    }

    private static String buildString() {
        String name = "Kirill ";
        String age = "28 ";
        String city = "Tbilisi";
        StringBuilder result = new StringBuilder();
        result.append(name);
        result.append(age);
        result.append(city);
        return result.toString();
    }

    private static void ascIi() {
        char ch = 'A';
        int asciiValue = (int) ch;
        System.out.println("ASCII-код для 'A' — " + asciiValue);

        int code = 97;
        char character = (char) code;
        System.out.println("Символ для кода 97 — " + character);
    }
}
