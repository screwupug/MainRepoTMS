import java.util.*;
import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {
        int a = math(1, 2, Main::sum);
    }


    public static int math(int a, int b, BiFunction<Integer, Integer, Integer> block) {
        return block.apply(a, b);
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}


