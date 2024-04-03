package sixth.lab;

import java.time.LocalDate;
import java.util.Arrays;

public class ExampleContactNotebook {
    public static void main(String[] args) {
        ContactNotebook[] contactNotebooks = new ContactNotebook[4];
        contactNotebooks[0] = new ContactNotebook("Ванёк Холод", LocalDate.of(2018, 9, 1), "23:45");
        contactNotebooks[1] = new ContactNotebook("Вова Башня", LocalDate.of(2019, 3, 13), "09:57");
        contactNotebooks[2] = new ContactNotebook("Пухляш", LocalDate.of(2017, 2, 20), "14:39");
        contactNotebooks[3] = new ContactNotebook("Петрифишер", LocalDate.of(2010, 9, 10), "02:28");

        System.out.println("\n======== Без сортировки ========");
        for (ContactNotebook contactNotebook : contactNotebooks)
            System.out.println(contactNotebook);

        System.out.println("\n======== Сортировка по дате ========");
        Arrays.sort(contactNotebooks, new SortedByDate());
        for (ContactNotebook contactNotebook : contactNotebooks)
            System.out.println(contactNotebook);

        System.out.println("\n======== Сортировка по времени ========");
        Arrays.sort(contactNotebooks, new SortedByTime());
        for (ContactNotebook contactNotebook : contactNotebooks)
            System.out.println(contactNotebook);
    }
}
