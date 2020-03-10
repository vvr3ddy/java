/*
 Copyrights ©  VVR 2020
   Learn Java by programming on the go.
   File Name    : myInstances.java
   Author       : Vishnuvardhan Reddy
   Description  : This program lets us understand the usage of
                  interfaces in Java programming Language.
                  An interface is similar to an abstract class.
                  It provides specifications that a class must follow.
                  More over there can be multiple inheritance in case of
                  interfaces.
 */


import  java.util.Scanner;

interface myInterface {
    public void getDetails(int age);

}
public class myInterfaces implements myInterface{  //implement the interface

    public void getDetails(int age) {
        System.out.println("Age entered = "+ age);
    }

}

class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        myInterfaces m1 = new myInterfaces(); //create a new object of Class
        m1.getDetails(10);
    }
}
