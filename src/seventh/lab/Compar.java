package seventh.lab;

import java.io.*;
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

    public void save() throws IOException {
        /*out.writeInt(this.items.size());
        for(ContactNotebook item : this.items)
            item.save(out);*/

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("file.txt")))
        {
            outputStream.writeObject(this);
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void load() throws IOException {
        /*int size = in.readInt();
        for (int i = 0; i < size; i++) {
            String x = in.readUTF();
            ContactNotebook contactNotebook = new ContactNotebook();
            this.items.add(contactNotebook.load(in));
        }
        return this;*/

        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("file.txt")))
        {
            Compar loadCompar = (Compar) inputStream.readObject();
            this.items = loadCompar.getItems();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
