/*
   Copyrights ©  VVR 2020
   Learn Java by programming on the go.
   File Name    : bubbleSort.java
   Author       : Vishnuvardhan Reddy
   Description  : This program demonstrates the working of bubble Sort algorithm.
 */

import java.util.Scanner;

public class bubbleSort {
    public void bSort(int[] array){
        int i,j;
        int temp;
        boolean swapped = true;

        for(i=0;i<array.length;i++){
            for(j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    swapped =false;
                }
                if(swapped==true)  // this is used to prevent checking of a loop if elements are already sorted in the array.
                    break;
            }
        }

        System.out.println("The Sorted Array is");
        for(i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

    }

}

class Main{

    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        bubbleSort b1 = new bubbleSort();

        System.out.println("Enter the no of elements in the array :");
        int size = read.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter a total of "+ size +" integers(in a random order) :");
        for(int i=0;i<size;++i){
            System.out.println("Enter element No. "+ i + "");
            arr[i]=read.nextInt();
        }

        b1.bSort(arr);
    }

}

