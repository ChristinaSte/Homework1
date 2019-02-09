package homework7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        ListIterator<String> listiterator = list.listIterator();
        while (listiterator.hasNext()) {
            if (listiterator.next().length() == 4) {
                listiterator.add("****");
            }
        }

        System.out.println(list);
    }
}

