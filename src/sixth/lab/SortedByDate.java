package sixth.lab;

import java.util.Comparator;

class SortedByDate implements Comparator<ContactNotebook> {

    @Override
    public int compare(ContactNotebook o1, ContactNotebook o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
