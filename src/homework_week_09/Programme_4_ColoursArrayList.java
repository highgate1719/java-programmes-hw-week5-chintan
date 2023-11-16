package homework_week_09;

import java.util.ArrayList;

/**
 * Write a Java program to create a new array list,
 * add some colours (string)
 * and printout the collection using for each loop.
 */
public class Programme_4_ColoursArrayList {

    public static void main(String[] args) {
        ArrayList<String> colorlist = new ArrayList<>();
        colorlist.add("Yellow");
        colorlist.add("Red");
        colorlist.add("Pink");
        colorlist.add("Blue");
        colorlist.add("Black");
        colorlist.add("Cyan");
        colorlist.add("Magenta");
        colorlist.add("Purple");

        for (String colourList:colorlist){
            System.out.println(colourList + " , ");
        }
    }
}
