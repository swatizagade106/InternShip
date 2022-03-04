import java.util.ArrayList;
import java.util.List;

// Main class
class Remove  {
    // Main driver method
    public static void main(String[] args)
    {
        // Creating an object of List interface with
        // reference to ArrayList class
        List<Integer> al = new ArrayList<>();

        // Adding elements to our ArrayList
        // using add() method
        al.add(12);
        al.add(20);
        al.add(30);
        al.add(0);
        al.add(1);
        // Printing the current ArrayList
        System.out.println(al);

        // This makes a call to remove(int) and
        // removes element 20
        al.remove(1);

        // Now element 30 is moved one position back
        // So element 30 is removed this time
        al.remove(1);

        // Printing the updated ArrayList
        System.out.println(al);
    }
} 