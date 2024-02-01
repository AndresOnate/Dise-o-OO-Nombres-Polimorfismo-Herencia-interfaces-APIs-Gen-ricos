package org.example;

import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Integer> intList = new MyLinkedList<Integer>();
        intList.add(0);
        intList.add(1);

        Integer x = intList.iterator().next();

        printCollection(intList);
        printCollectionGenerics(intList);

        String[] strArray = {"Hola", "Mundo"};
        List<String> strList = new MyLinkedList<String>();

        fromArrayToCollection(strArray, strList);
        System.out.println(strList);
    }

    static void printCollection(Collection c) {
        Iterator i = c.iterator();
        for (int k = 0; k < c.size(); k++) {
            System.out.println(i.next());
        }
    }

    static void printCollectionGenerics(Collection<?> c)
    {
        for (Object e : c) {
            System.out.println(e);
        }
    }

    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // compile-time error
        }
    }


}