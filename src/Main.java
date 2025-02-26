import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
        Map<String, Integer> map = new HashMap<>();
        map.put("Hello", 12);
        map.put("Hello1", 12);
        map.put("Hello2", 12);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        List<Integer> doubledList = list.stream()
                .map(n -> n * 2)
                .toList();

        deleteEveryTwo();

    }

    public static void deleteEveryTwo() {
        Scanner scn = new Scanner(System.in);
        LinkedList<Integer> peoples = new LinkedList<>();
        try {
            int numberOfPeople = scn.nextInt();

            for (int i = 1; i <= numberOfPeople; i++) {
                peoples.addLast(i);
            }

            int index = 1;
            System.out.println("Начальный круг людей: " + peoples);

            while (peoples.size() > 1) {
                Iterator<Integer> iterator = peoples.iterator();
                while (iterator.hasNext()) {
                    iterator.next();
                    if (index % 2 == 0) iterator.remove();
                    index++;
                }
                System.out.println("Промежуточный результат: " + peoples);
            }

            System.out.println("Оставшийся человек: " + peoples);
        } catch (Exception ex) {
            System.out.println("Произошла ошибка!");
        }
    }




    private static void iterateMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
