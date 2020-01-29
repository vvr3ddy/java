/**
 Copyrights ©  VVR 2020
 *  Learn Java by programming on the go.
 *  File Name    : bubbleSort.java
 *  Author       : Vishnuvardhan Reddy
 *  Description  : This program lets us understand the working of
 *                 for loops in Java using the bubble sort program.
 *
 */

import java.util.Scanner;
public class bubbleSort {

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        int num, i, j;
        int temp;

        System.out.print("Enter the size of array :");
        num=read.nextInt();

        int[] arr = new int[num]; //initialize the array with num no. of elements
        System.out.print("\n Enter the" +num +" elements of array :\n");
        for(i=0; i<num;i++){
            arr[i]=read.nextInt();
        }

        System.out.print("\n Bubble Sort is starting:");
        for(i=0;i<num;i++){
            for(j=0;j<num-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        System.out.print("\n Bubble sorted array is : \n");

        for(i=0;i<num;i++){
            System.out.println(arr[i]);
        }


    }
}
