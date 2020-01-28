/**
 *  Copyrights ©  VVR 2020
 *  Learn Java by programming on the go.
 *  File Name    : switchCase.java
 *  Author       : Vishnuvardhan Reddy
 *  Description  : This program lets us understand the switch case conditional statements.
 */

import java.util.Scanner;
public class hellWorld {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i;
        String day;
        System.out.println(" Enter a value for i within 1-7 :");
        i = read.nextInt();
        switch (i) {
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Earth has only 7 days a week";
                break;
        }
        System.out.println(day);

    }
}
