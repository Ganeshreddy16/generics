package org.blz.generics;

public class PrintArray {
    public static void main(String[] args) {
        Integer[] intArray = {11, 22, 33, 44, 55};
        Double[] doubArray = {4.5, 5.5, 6.5, 7.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        toPrint(intArray);
        toPrint(doubArray);
        toPrint(charArray);
    }

    public static <E> void toPrint(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}


