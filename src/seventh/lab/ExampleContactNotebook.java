package seventh.lab;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class ExampleContactNotebook implements Serializable {
    public static void main(String[] args) throws IOException {
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
                    compar.save();
                    break;
                case 6:
                    compar.getItems().clear();
                    compar.load();
                    compar.show();
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

    /*public static void saving(Compar compar) {
        DataOutputStream out = null;
        ObjectOutputStream out1 = null;

        try {
            out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(new File("test.txt"))));
            out1 = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(new File("test1.txt"))));

            try {
                compar.save(out);
                out1.writeObject(compar.getItems());
            } catch (IOException e) {
                System.out.println("Не удалось создать файл");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Отсутствует файл!");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

    public static Compar loading(Compar compar) {
        DataInputStream in = null;
        ObjectInputStream in1 = null;

        try {
            in = new DataInputStream(new BufferedInputStream(new FileInputStream(new File("test.txt"))));
            in1 = new ObjectInputStream(new BufferedInputStream(new FileInputStream(new File("test1.txt"))));

            try {
                compar.setItems((ArrayList<ContactNotebook>)in1.readObject());
            } catch (IOException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                System.out.println("Ошибка");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            try {
                in.close();
                in1.close();
            } catch (IOException e) {
                System.out.println("Ошибка");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Отсутсвует файл");
        } catch (IOException e1) {
            e1.printStackTrace();
        }

        return compar;
    }*/
}
