/**
 *   Copyrights ©  VVR 2020
 *   Learn Java by programming on the go.
 *   File Name    : classConstructors.java
 *   Author       : Vishnuvardhan Reddy
 *   Description  : This program starts with the discussion on OOP features of java.
 *                  Here we discuss the concept of constructors in Java Classes.
 *
 */



class classConstructors {
    boolean isOn;

    myClass(){  //default constructor
        System.out.println("Default Constructor invoked.");
    }

    myClass(int number){  //parameterized constructor
        System.out.println("The value of number passed is "+ number);
    }

    void turnOn(){
        isOn = true;
    }

    void turnOff(){
        isOn = false;
    }
}

class ChildClass{
    public static void main(String[] args){
    
        myClass lamp1 =  new myClass();  //access default constructor.
        myClass lamp2 = new myClass(10);  // access parameterized constructor.
    
    }
}
