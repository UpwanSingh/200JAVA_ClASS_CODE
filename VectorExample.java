import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> stringVector = new Vector<>(4,1);

        System.out.println("Initial size: " + stringVector.size());
        System.out.println("Initial capacity: " + stringVector.capacity());

        // Add elements to the Vector
        stringVector.add("1");
        stringVector.add("2");
        stringVector.add("3");
        stringVector.add("4");  
        stringVector.add("5"); 
        stringVector.add("6");
        System.out.println("Size after additions: " + stringVector.size());
        System.out.println("Capacity after additions: " + stringVector.capacity());


        Vector <String> vc2 = new Vector<>();
        vc2.add("A");
        vc2.add("B");
        vc2.add("C");

        System.out.println("Elements in vc2: " + vc2);

        vc2.addAll(vc2);
        System.out.println(stringVector);


        System.out.println(stringVector.firstElement());
        System.out.println(stringVector.lastElement());
        System.out.println(stringVector.contains("3"));
        System.out.println(stringVector.indexOf("4"));
        System.out.println(stringVector.remove("2"));
        System.out.println("Size after removal: " + stringVector.size());
        System.out.println("Elements after removal: " + stringVector);



        
        System.out.println("--------------------------");
        System.out.println("Elements in vc2 after adding all elements of itself: " + vc2);
    }
}