package sekcja8;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class DemoLinkedList {
    public static void main(String[] args) {

        LinkedList<String> placeToVisit = new LinkedList<String>();
        addInOrder(placeToVisit, "Sydney");
        addInOrder(placeToVisit, "Melbourne");
        addInOrder(placeToVisit, "Brisbane");
        addInOrder(placeToVisit, "Perth");
        addInOrder(placeToVisit, "Canberra");
        addInOrder(placeToVisit, "Adelaide");
        addInOrder(placeToVisit, "Darwin");


        addInOrder(placeToVisit, "Alice Springs");
        addInOrder(placeToVisit, "Darwin");

        printList(placeToVisit);


//        placeToVisit.add("Sydney");
//        placeToVisit.add("Melbourne");
//        placeToVisit.add("Brisbane");
//        placeToVisit.add("Perth");
//        placeToVisit.add("Canberra");
//        placeToVisit.add("Adelaide");
//        placeToVisit.add("Darwin");
//        printList(placeToVisit);
//
//
//        placeToVisit.add(1, "Alice Springs");
//        printList(placeToVisit);
//
//
//        placeToVisit.remove(4);
//        printList(placeToVisit);


    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=======================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();
        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0) {
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                // new City should appear befor this one
                // Brisbane -> Adelaide
                stringListIterator.previous(); // returns to the record
                stringListIterator.add(newCity);
                return true;

            } else if (comparison < 0) {
                //move on next city
            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        ListIterator<String> listIterator = cities.listIterator();

        if (cities.getFirst() == "") {
            System.out.println("No cities in the itinerary");
            return;
        } else {
            System.out.println("Now visiting" + listIterator.next());
            prinMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
            }
        }

    }


}
