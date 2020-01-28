/**
 *  Copyrights ©  VVR 2020
 *  Learn Java by programming on the go.
 *  File Name    : 
 *  Author       : Vishnuvardhan Reddy
 *  Description  : This program lets us understand the if-else conditional statements.
 */

import java.util.Scanner;
public class hellWorld {
    public static void main(String[] args) {
        Scanner read  = new Scanner(System.in);
        int i, j;
        System.out.println(" Enter a value for i :");
        i = read.nextInt();
        System.out.println("\n Enter a value for j :");
        j = read.nextInt();
        if(i == j){
            System.out.println("\nboth values are same");
        }
        else
            System.out.println("\n I and J are different values");
    }
}
