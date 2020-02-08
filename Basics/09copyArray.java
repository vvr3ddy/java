/**
 *   Copyrights ©  VVR 2020
 *   Learn Java by programming on the go.
 *   File Name    : copyArray.java
 *   Author       : Vishnuvardhan Reddy
 *   Description  : This program lets us understand the usage of copy arrays.
 *                  This is a very trivial method of copying the "Original" array into a new array.
 *                  There exists a problem, if the elements of original array are disturbed, the new array also gets modified accordingly.
 *                  This phenomenon is called Shallow Copying.
 *
 */





import java.util.Scanner;


public class copyArray {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.println("Enter the size of array Rows & Cols. :");

        int size_r=read.nextInt();
        int size_c=read.nextInt();
        int[][] array = new int[size_r][size_c];

        for (int i =0; i<size_r;i++){
            for(int j=0;j<size_c;j++) {
                int ind_r = i+1;
                int ind_c = j+1;
                System.out.println("Enter the array element["+ind_r+"]["+ind_c+"] :");
                array[i][j]=read.nextInt();
            }
        }
        // we copy the array to another new array

        int[][] copyArray = array;  // <- this is a shallow copy
        System.out.println("Printing copy Array");
        for(int i=0;i<size_r;i++){
            for(int j=0;j<size_c;j++){
                System.out.print("\t" +copyArray[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Enter the element  address to be modified in original array (Row and Column):");

        int ele_r = read.nextInt();
        int ele_c = read.nextInt();
        int ind_r = ele_r+1, ind_c = ele_c+1;

        System.out.println("Enter the new value for the ["+ind_r+"]["+ind_c+"] (map value is row-1 and col-1):");
        array[ele_r][ele_c]=read.nextInt();

        System.out.println("Notice the change in copied array.");


        for(int i=0;i<size_r;i++){
            for(int j=0;j<size_c;j++){
                System.out.print("\t" +copyArray[i][j]+"\t");
            }
            System.out.println();
        }

    }
}

