package homework7;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        int length = 4;
        String addSymbol = "****";

        linkedList.add("this");
        linkedList.add("is");
        linkedList.add("lots");
        linkedList.add("of");
        linkedList.add("fun");
        linkedList.add("for");
        linkedList.add("every");
        linkedList.add("Java");
        linkedList.add("programmer");

        ListIterator<String> listiterator = linkedList.listIterator();
        while (listiterator.hasNext()) {
            if (listiterator.next().length() == length) {
                listiterator.add(addSymbol);

            }
        }

        System.out.println(linkedList);
    }
}