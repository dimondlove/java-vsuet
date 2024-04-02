package fifth.lab;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Comparator;
import java.util.Date;

public class ContactNotebook {
    private String name;

    private LocalDate date;

    private String time;

    public ContactNotebook(String name, LocalDate date, String time) {
        this.name = name;
        this.date = date;
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
        String str1 = ((ContactNotebook) o1).getTime();
        String str2 = ((ContactNotebook) o2).getTime();
        return str1.compareTo(str2);
    }
}

