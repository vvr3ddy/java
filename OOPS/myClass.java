/**
 *   Copyrights ©  VVR 2020
 *   Learn Java by programming on the go.
 *   File Name    : myClass.java
 *   Author       : Vishnuvardhan Reddy
 *   Description  : This program starts with the discussion on OOP features of java.
 *                  Here we discuss the concept of class and object in Java.
 *
 */



class Lamp {
    boolean isOn;   // this is a data member

    void turnOn(){  // this is a member function
        isOn = true;
    }

    void turnOff(){ // this is a member function
        isOn = false;
    }
}

class ChildClass{

    public static void main(String[] args){
        myClass lamp1 =  new Lamp();  //creating the object of Lamp

        lamp1.turnOn();  //accessing the member function through the object
        System.out.println(lamp1.isOn);
    }
}
