package beginner;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q03 {
    //Write the code that shows how many different items are in a list.

    //Example: {10, 31, 15, 7, 15, 7, 7} ==> 4
    public static void main(String[] args) {
        //we create a list to add elements
        List<Integer> myList = new ArrayList<>();

        //add elements
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);

        //we create a set to retrieve non-repeating elements
        Set<Integer> mySet = new HashSet<>(myList);

        //write console how many different items are in a list
        System.out.println(mySet.size());
    }
}
