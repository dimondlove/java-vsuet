package seventh.lab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class ContactNotebook implements Serializable {
    private String name;

    private LocalDate date;

    private String telephone;

    private String time;

    public ContactNotebook() {
    }

    public ContactNotebook(String name, LocalDate date, String telephone, String time) {
        this.name = name;
        this.date = date;
        this.telephone = telephone;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getTelephone() {
        return telephone;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Телефон: " + telephone + " Дата: " + date + " Время: " + time;
    }

    public static ContactNotebook createNewContactNotebook(Scanner in) {
        in.skip("\n");
        System.out.println("Создание объекты класса ContactNotebook");
        System.out.println("Введите имя");
        String newName = in.nextLine();
        LocalDate newDate = LocalDate.now();
        System.out.println("Введите номер телефона");
        String newTelephone = in.nextLine();
        System.out.println("Введите время");
        String newTime = in.nextLine();

        return new ContactNotebook(newName, newDate, newTelephone, newTime);
    }

    /*public void save(DataOutputStream out) throws IOException {

    }

    public ContactNotebook load(DataInputStream in) throws IOException {
        return null;
    }*/
}

