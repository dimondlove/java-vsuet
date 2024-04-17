package seventh.lab;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Compar implements Serializable {
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

    public void save(DataOutputStream out) throws IOException {
        out.writeInt(this.items.size());
        for(ContactNotebook item : this.items)
            item.save(out);
    }

    public Compar load(DataInputStream in) throws IOException {
        int size = in.readInt();
        for (int i = 0; i < size; i++) {
            String x = in.readUTF();
            ContactNotebook contactNotebook = new ContactNotebook();
            this.items.add(contactNotebook.load(in));
        }
        return this;
    }
}
