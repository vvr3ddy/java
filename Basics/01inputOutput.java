/**
 *  Copyrights ©  VVR 2020
 *  Learn Java by programming on the go.
 *  File Name    : inputOutput.java
 *  Author       : Vishnuvardhan Reddy
 *  Description  : This program lets us understand how to read an imput from a user
 *                 and print the statement on a console window.
 */

import java.util.Scanner;
public class inputOutput {
    public static void main(String[] args) {
        // make a new method read to read input
        Scanner read  = new Scanner(System.in);
        
        System.out.println("\n Enter Some text Here");
        String s = read.next();  // this is how we read text input (String)
        int x =  read.nextInt(); // this is how we read an int input 
        floaf f = read.nextFloat(); // this is how we read a float input
        double d =  read.nextDouble(); // this is how we read a double input
        System.out.println("you have entered " +s + "as a string");
    }
}
