/*
 Copyrights ©  VVR 2020
   Learn Java by programming on the go.
   File Name    : array2D.java
   Author       : Vishnuvardhan Reddy
   Description  : This program lets us understand the usage of
                  2Darrays in Java.


 */
import java.util.Scanner;


public class array2D {
    public static void main(String[] args){


        Scanner read = new Scanner(System.in);

        System.out.println("Enter the size of the array row and column:");

        int size_r = read.nextInt();
        int size_c = read.nextInt();
        int[][] array = new int[size_r][size_c];
        int total_size = size_c*size_r;

        System.out.println("Total number of elements to be entered = " + total_size);

        for(int i=0;i<size_r;i++){
            for(int j=0;j<size_c;j++){
                int r_ind = i+1;
                int c_ind =j+1;

                System.out.print("\nEnter element ["+ r_ind + "][" + c_ind+"] :");
                array[i][j]=read.nextInt();

            }
        }

        System.out.println("All array elements stored succesfully..");
        System.out.println("Displaying array elements.");

        for(int i=0;i<size_r;i++){
            for(int j=0;j<size_c;j++){
                System.out.print("\t" +array[i][j]+"\t");
            }
            System.out.println();
        }

    }

}
