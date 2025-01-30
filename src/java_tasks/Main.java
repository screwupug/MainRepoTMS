package java_tasks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123", 100);
        BankAccount account1 = new BankAccount("123", 100);
//        System.out.println(account.equals(account1));

//        String hello = "hello";
//        String helloNumbTwo = "hello";
//        String str = new String("hello");
//        System.out.println(hello == helloNumbTwo);
//        System.out.println(hello.equals(str));
        enterDayOfWeek();
    }

    private static void enterDayOfWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter day of week: ");
        String input = scanner.nextLine().toUpperCase();
        if (input.equals(DayOfWeek.MONDAY.name()) || input.toLowerCase().equals(DayOfWeek.MONDAY.value)) {
            System.out.println("It is Monday");
        } else {
            System.out.println("It's not Monday");
        }
    }
}
