import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int rem = 0;
        int count =0; int max =0;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        while(n>0){
            rem = n % 2;
            if(rem == 1){
                count++;
                if(count > max){
                  max = count;
                }
            }
            else count =0;
            n= n / 2;
        }
        
        System.out.println(max);
        scanner.close();
    }
}
