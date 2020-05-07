import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedList01 {
    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedList<String> linkedList1 = new LinkedList<>();

        int size = 0, i = 0;

        System.out.println("Enter the number of elements to insert :");
        size = read.nextInt();

        String[] item = new String[size];
        try {
            System.out.println("\nEnter the elements :");
            for (i = 0; i < size; i++) {
                int index = i + 1;
                System.out.println("Enter element no. " + (index));
                item[i] = read.next();
                System.out.println("Adding element to Linked List...");
            }
        } catch (NullPointerException e) {
            System.out.println("You have entered nothing, NullPointerException has been triggered");
        } finally {
            // Print the stored Linked List
            for (i = 0; i < linkedList1.size(); i++) {
                System.out.println("node no. " + (i + 1) + " = " + linkedList1.get(i));
            }

            //convert Linked List to Array List

            ArrayList<String> arrayList = new ArrayList<String>(linkedList1);
            for (String str : arrayList)
                System.out.println(str);
        }

    }
}
