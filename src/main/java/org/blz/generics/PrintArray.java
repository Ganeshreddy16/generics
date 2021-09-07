package org.blz.generics;

public class PrintArray
{
    public static void main( String[] args )
    {
       Integer[] intArray={11,22,33,44,55};
        toPrint(intArray);
        Double[] doubArray={4.5,5.5,6.5,7.5};
        toPrint(doubArray);
        Character[] charArray = {'a','b','c','d','e'};
        toPrint(charArray);
    }


    public static void toPrint(Integer[] array){
        for (int i=0; i<array.length;i++)

            System.out.println(array[i]);
    }
    public static void toPrint(Double[] doubArray) {
        for (int i = 0; i < doubArray.length; i++)
            System.out.println(doubArray[i]);
    }
    public static void toPrint (Character[] charArray){
        for (int i = 0; i< charArray.length;i++)
            System.out.println(charArray[i]);

    }
}
