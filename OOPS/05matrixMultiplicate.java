/*
 Copyrights ©  VVR 2020
   Learn Java by programming on the go.
   File Name    : matrixMultiplicate.java
   Author       : Vishnuvardhan Reddy
   Description  : This program lets us understand the usage of
                  interfaces in Java programming Language.
                  I demonstrate the usage of interfaces using 
                  the concept of matrix multiplication.
 */
import java.util.Scanner;

interface arrayMultiplication{
    void newArray(int[][] arr, int row, int col);
    void showArray(int[][] arr, int row, int col);
    void multArray(int[][] arr1, int[][] arr2,int r1, int r2, int c1, int c2);
}

public class arrayMult implements arrayMultiplication {
    Scanner read = new Scanner(System.in);
    int i,j;


    arrayMult(){
        System.out.println("This Class performs a list of operations on matrices");
        System.out.println("1. Read the matrix");
        System.out.println("2. Display the matrix");
        System.out.println("3. Perform matrix multiplication");
    }

    @Override
    public void newArray(int[][] arr, int row, int col){

        for(i=0;i<row;++i){
            for(j=0;j<col;++j){
                arr[i][j]=read.nextInt();
            }
        }

    }

    @Override
    public void showArray(int[][] arr, int row, int col) {
        int i,j;
        System.out.println();
        for(i=0;i<row;++i){
            for(j=0;j<col;++j){
                System.out.print(arr[i][j]+"    ");
            }
            System.out.println();
        }
    }

    @Override
    public void multArray(int[][] arr1, int[][] arr2, int r1, int r2, int c1, int c2) {
        int[][] prodArray = new int[r1][c2];

        if(r2 != c1){
            System.out.println("Cannot Perform Matrix Multiplication");
            System.out.println("Check the dimensions of matrices");
        }
        else{
            for( i=0;i<r1;i++){
                for(j=0;j<c2;j++){
                    prodArray[i][j]=0;
                    for(int k=0;k<r2;k++){
                        prodArray[i][j]+= arr1[i][k]+arr2[k][j];
                    }
                }
            }
            showArray(prodArray,r1,c2);
        }
    }


}

class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        arrayMult a1 = new arrayMult();
        int[][] arr1 = new int[100][100];
        int[][] arr2 = new int[100][100];
        int r1, c1, r2, c2;
        System.out.println("Enter the size of matrix1 -> Row and Col :");
        r1=read.nextInt(); c1=read.nextInt();
        System.out.println("Enter the elements of matrix 1:");
        a1.newArray(arr1,r1,c1);
        System.out.println("Enter the size of matrix2 -> Row and Col :");
        r2=read.nextInt(); c2=read.nextInt();
        System.out.println("Enter the elements of matrix 2:");
        a1.newArray(arr2,r2,c2);
        System.out.println("Displaying elements of matrix 1:");
        a1.showArray(arr1,r1,c1);
        System.out.println("Displaying elements of matrix 2:");
        a1.showArray(arr2,r2,c2);

        System.out.println("Performing matrix multiplication:");
        a1.multArray(arr1,arr2,r1,c1,r2,c2);


    }
}
