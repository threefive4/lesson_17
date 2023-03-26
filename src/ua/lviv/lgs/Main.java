package ua.lviv.lgs;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Number[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Collection collection = new Collection(array);

        Iterator firstIterator = collection.new FirstIterator();
        while (firstIterator.hasNext()) {
            System.out.print(firstIterator.next() + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));

        Iterator secondIterator = collection.new SecondIterator();
        while (secondIterator.hasNext()) {
            System.out.print(secondIterator.next() + " ");
        }
        System.out.println();
    }

}
