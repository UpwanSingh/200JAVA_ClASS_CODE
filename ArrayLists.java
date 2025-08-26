import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        
        System.out.println(list);

        // Accessing elements
        int element = list.get(0);
        System.out.println(element);

        //Adding elements at specific index
        list.add(1,1);
        System.out.println(list);


// Modifying elements
        list.set(0, 100);
        System.out.println(list);

        //Removing elements
        list.remove(2);
        System.out.println(list);

        //size of the list
        System.out.println("Size of the list: " + list.size());

        //check if the list is empty
        System.out.println("Is the list empty? " + list.isEmpty());

        //Iterating through the list
        for(int i =0;i<list.size();i++){
            System.out.println( list.get(i));
        }

        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    
    }
}
