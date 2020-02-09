import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner read = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        int sum =-1000;
        for (int i = 0; i < 6; i++) {
            for(int j=0;j<6;j++){
                arr[i][j]= read.nextInt();
            }
        }

        for(int i =0 ; i<4;i++){
                for(int x =0 ; x<4; x++){
                    
                    int top = arr[i][x]+arr[i][x+1]+arr[i][x+2];
                    int middle = arr[i+1][x+1];
                    int bottom = arr[i+2][x]+arr[i+2][x+1]+arr[i+2][x+2];
                    if(top+middle+bottom>sum){sum=top+middle+bottom;}
                }
            }
            System.out.println(sum);




        read.close();
    }
}
