package sixth.lab;

import java.util.ArrayList;

public class Compar {
    private ArrayList<ContactNotebook> items = new ArrayList<>();

    public ArrayList<ContactNotebook> getItems() {
        return items;
    }

    public void setItems(ArrayList<ContactNotebook> items) {
        this.items = items;
    }

    public void add(ContactNotebook contactNotebook) {
        this.items.add(contactNotebook);
    }

    public void show() {
        for (ContactNotebook item : items)
            System.out.println(item);
    }
}
