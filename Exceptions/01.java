package advancedJava;

import java.util.*;

public class vectors {
    public static void main(String[] args) throws InputMismatchException {
        Scanner read = new Scanner(System.in);
        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Initial Size:" + v.size());
        System.out.println("Initial Capacity:" + v.capacity());
        v.addElement(1);
        char ch = 'y';
        try {
            while (ch == 'y') {
                System.out.println("Enter an integer:");
                v.addElement(read.nextInt());
                System.out.println("Current Capacity:" + v.capacity());
                System.out.println("Current size:" + v.size());
                System.out.println("want to enter more elements ?(y/n)");
                ch = read.next().charAt(0);
            }
        } catch (InputMismatchException e) {
            System.out.println("Entered a non integer :|");
            e.printStackTrace();
        } finally {
            Enumeration<Integer> vEnum = v.elements();
            while (vEnum.hasMoreElements()) {
                System.out.println(vEnum.nextElement());
            }
            System.out.println("Size of vector:" + v.size());
            System.out.println("Capacity of vector:" + v.capacity());
        }
    }
}

