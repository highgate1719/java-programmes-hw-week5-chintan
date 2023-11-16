package homework_week_09;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Write a Java program to iterate through all elements in an array list using Iterator.
 */



public class Programme_5_ArrayListWithIterator {
    public static void main(String[] args) {
        ArrayList<String>fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");
        fruitList.add("Cherry");
        fruitList.add("Strawberry");
        fruitList.add("Kiwi");
        fruitList.add("Pears");
        fruitList.add("Mango");

        ListIterator<String>iterate = fruitList.listIterator();
        while (iterate.hasNext()){
            System.out.println(iterate.next()+ " , ");
        }

    }

}
