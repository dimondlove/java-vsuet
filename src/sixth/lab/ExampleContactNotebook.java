package sixth.lab;

import java.time.LocalDate;
import java.util.Scanner;

public class ExampleContactNotebook {
    public static void main(String[] args) {
        Compar compar = new Compar();

        compar.add(new ContactNotebook("Ванёк Холод", LocalDate.of(2018, 9, 1), "+79530072437", "23:45"));
        compar.add(new ContactNotebook("Вова Башня", LocalDate.of(2019, 3, 13), "+79582742148", "09:57"));
        compar.add(new ContactNotebook("Пухляш", LocalDate.of(2017, 2, 20), "+79016195419","14:39"));
        compar.add(new ContactNotebook("Петрифишер", LocalDate.of(2010, 9, 10), "+79012368188", "02:28"));

        Scanner in = new Scanner(System.in).useDelimiter("\n");
        showMenu();

        while (true) {
            int menuItem = in.nextInt();
            System.out.println(menuItem);

            switch (menuItem) {
                case 1:
                    compar.show();
                    break;
                case 2:
                    ContactNotebook contactNotebook = ContactNotebook.createNewContactNotebook(in);
                    System.out.println("Новый контакт: " + contactNotebook);
                    compar.add(contactNotebook);
                    break;
                case 3:
                    compar.getItems().sort(new SortedByDate());
                    break;
                case 4:
                    compar.getItems().sort(new SortedByTime());
                    break;
                case 5:
                    //Сохранить контакты в файл
                    break;
                case 6:
                    //Извлечь контакты из файла
                    break;
                case 7:
                    System.out.println("Программа завершается");
                    System.exit(0);
                    break;
                default:
                    break;
            }

            showMenu();
        }
    }

    public static void showMenu() {
        System.out.println("\n");
        System.out.println("1 - Вывести список контактов");
        System.out.println("2 - Добавить новый контакт");
        System.out.println("3 - Отсортировать список контактов по дате");
        System.out.println("4 - Отсортировать список контактов по времени");
        System.out.println("5 - Сохранить контакты");
        System.out.println("6 - Загрузить контакты");
        System.out.println("7 - Выйти");
    }
}
