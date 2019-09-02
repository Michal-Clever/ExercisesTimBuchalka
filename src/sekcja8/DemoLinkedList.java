package sekcja8;

import java.util.Iterator;
import java.util.LinkedList;

public class DemoLinkedList {
    public static void main(String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<String>();
        placeToVisit.add("Sydney");
        placeToVisit.add("Melbourne");
        placeToVisit.add("Brisbane");
        placeToVisit.add("Perth");
        placeToVisit.add("Canberra");
        placeToVisit.add("Adelaide");
        placeToVisit.add("Darwin");


        printList(placeToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting" + i.next());
        }
        System.out.println("=======================");
    }
}
