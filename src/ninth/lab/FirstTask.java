package ninth.lab;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FirstTask {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число строк");
            try {
                n = sc1.nextInt();
                sc1.skip("\n");
                break;
            }
            catch (InputMismatchException fg) {
                System.out.println("Вы ввели не число!");
            }
        }

        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите строку №" + (i + 1));
            str[i] = sc1.nextLine();
        }

        sc1.close();

        int minLength = str[0].length();
        int minIndex = 0;

        for (int i = 0; i < str.length - 1; i++) {
            if (minLength > str[i].length()) {
                minLength = str[i].length();
                minIndex = i;
            }
        }

        System.out.println("Самая короткая строка под номером " + (minIndex + 1));
        System.out.println(str[minIndex]);
    }
}
