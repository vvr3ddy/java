package myPractisePackage;

import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Collections.*;

public class arrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        Scanner read = new Scanner(System.in);
        int i, num, size;
        size = read.nextInt();
        for (i = 0; i < size; i++) {
            num = read.nextInt();
            myList.add(num);
        }

        //Print the list as is
        System.out.println("Printing unmodified arrayList:");
        for (Integer in : myList) {
            System.out.println(in);
        }

        //find length of array
        System.out.println("Size of array List:");
        System.out.println(myList.size());


        //sort array in ascending order
        sort(myList);
        System.out.println("Sorted arrayList :");
        for (Integer in : myList) {
            System.out.println(in);
        }

        //sort array in descending order
        myList.sort(reverseOrder());

        System.out.println("Sorted arrayList in Descending order");
        for (Integer in : myList) {
            System.out.println(in);
        }


        //TODO 
        /*
        * Add Comparision based 
	* Add functionality to add / remove from list
	* Add functionality to convert LL to AL or Array to AL
        */
    }
}
