package sixth.lab;

import java.time.LocalDate;
import java.util.Comparator;

public class ContactNotebook {
    private String name;

    private String telephone;

    private LocalDate date;

    private String time;

    public ContactNotebook(String name, String telephone, LocalDate date, String time) {
        this.name = name;
        this.telephone = telephone;
        this.date = date;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Имя: " + name + " Дата: " + date + " Время: " + time;
    }
}

class SortedByDate implements Comparator<ContactNotebook> {

    @Override
    public int compare(ContactNotebook o1, ContactNotebook o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}

class SortedByTime implements Comparator<ContactNotebook> {

    @Override
    public int compare(ContactNotebook o1, ContactNotebook o2) {
        String str1 = o1.getTime();
        String str2 = o2.getTime();
        return str1.compareTo(str2);
    }
}

