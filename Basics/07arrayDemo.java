/**
 Copyrights ©  VVR 2020
 *  Learn Java by programming on the go.
 *  File Name    : arrayDemo.java
 *  Author       : Vishnuvardhan Reddy
 *  Description  : This program lets us understand the usage of
 *                 arrays in Java.
 *
 *
 */

import java.util.Scanner;


public class bubbleSort {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int size;
        int[] array;

        System.out.print("\n Enter the size of array :");
        size=read.nextInt();

        array = new int[size];

        System.out.print("\n Enter the array elements :");
        for(int i=0;i<size;i++){
            int index = i+1;
            System.out.println("\n Enter element number" + index +":");
            array[i]=read.nextInt();
        }
        System.out.println("The array has been stored..");
        System.out.println("To display Array enter y/Y");
        String ch;
        ch=read.next();
        String choice=ch.toUpperCase();
        if ("Y".equals(choice)) {
            System.out.println("\n You have decided to print the array");
            for (int i = 0; i < size; i++) {
                System.out.println(array[i]);
            }
        }
        else {
            System.out.println("You have decided to terminate the program.");
           System.exit(0); 
        }

    }

}
