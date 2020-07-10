import java.util.Scanner;
import java.lang.Math;
public class myPBL {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num1, num2, rem1 = 0, rem2 = 0, count = 0;
        num1 = read.nextInt();
        num2 = read.nextInt();
        while (count < 1) {
            rem1 = Math.abs(num1 % 10);
            num1 = num1 / 10;
            rem2 = Math.abs(num2 % 10);
            num2 = num2 / 10;
            count++;
        }
        System.out.println(rem1);
        System.out.println(rem2);
        System.out.println(rem1 + rem2);
    }
}
