/*
 Copyrights ©  VVR 2020
   Learn Java by programming on the go.
   File Name    : myInstances.java
   Author       : Vishnuvardhan Reddy
   Description  : This program lets us understand the usage of
                  instanceof operator in Java. In Java instanceof
                  is a binary keyword used to determine if an object
                  belongs to a particular class or not.


 */
import java.util.Scanner;

public class myInstances {
}



class Animal {

}

class Dog extends Animal{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        Dog d1 =new Dog();
        System.out.println(d1 instanceof Dog);
        System.out.println(d1 instanceof  Animal);
    }
}
