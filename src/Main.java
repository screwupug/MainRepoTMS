import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
        int result = divideNumbers(10, 0);
        System.out.println("The end");
        System.out.println("Result " + result);
        try {
            readFile();
        } catch (Exception e) {

        }
        ArrayList<String> array = new ArrayList<>();
    }

    private static int divideNumbers(int a, int b) {
        try {
            return a / b;
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        return -1;
    }

    private static void readFile() throws FileNotFoundException {
        File file = new File("text.txt");
        FileReader fileReader = new FileReader(file);
    }
}
