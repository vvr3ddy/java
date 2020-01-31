/**
 Copyrights ©  VVR 2020
 *  Learn Java by programming on the go.
 *  File Name    : numReverse.java
 *  Author       : Vishnuvardhan Reddy
 *  Description  : This program lets us understand the working of
 *                 while loops in Java using the number reversal program.
 *
 */

import java.util.Scanner;
public class bubbleSort {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int num, rem=0, newNum=0;
        System.out.print("\n Enter an integer number :");
        num = read.nextInt();

        while(num!=0){
            rem = num%10;
            newNum = newNum*10 + rem;
            num=num/10;
        }

        System.out.print("\n Reversed Number :"+newNum);

    }
}
