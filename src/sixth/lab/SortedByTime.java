package sixth.lab;

import java.util.Comparator;

class SortedByTime implements Comparator<ContactNotebook> {

    @Override
    public int compare(ContactNotebook o1, ContactNotebook o2) {
        String str1 = o1.getTime();
        String str2 = o2.getTime();
        return str1.compareTo(str2);
    }
}
