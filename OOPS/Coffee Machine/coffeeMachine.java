package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static String action;
    static String choice;
    static Integer fillWater, fillMilk, fillCBean, fillcups;
    static int cash = 550, water = 540, milk = 400, cbean = 120, cups = 9;
    static Boolean exit = false;

    static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

        do {
            System.out.print("Write action (buy, fill, take, remaining, exit): ");
            action = read.next();
            switch (action) {
                case "buy":
                    buy();
                    break;
                case "fill":
                    fill();
                    break;
                case "take":
                    take();
                    break;
                case "remaining":
                    remaining();
                    break;
                case "exit":
                    exit();
                    break;
            }
        } while (!exit);
    }


    static void buy() {
        System.out.println();
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        choice = read.next();
        switch (choice) {

            case "1": {
                if (canMakeCoffee(250, 0, 16)) {
                    water -= 250;
                    cbean -= 16;
                    cups--;
                    cash += 4;
                    break;
                }
            }

            case "2": {
                if (canMakeCoffee(350, 75, 20)) {
                    water -= 350;
                    milk -= 75;
                    cbean -= 20;
                    cups--;
                    cash += 7;
                    break;
                }
            }

            case "3": {
                if (canMakeCoffee(200, 100, 12)) {
                    water -= 200;
                    milk -= 100;
                    cbean -= 12;
                    cups--;
                    cash += 6;
                    break;

                }

            }

            case "back": {
                break;
            }

            default: {
                break;
            }


        }

    }

    static void fill() {
        System.out.println();
        System.out.println("Write how many ml of water do you want to add: ");
        fillWater = read.nextInt();
        System.out.println("Write how many ml of milk do you want to add: ");
        fillMilk = read.nextInt();
        System.out.println("Write how many g of coffee beans do you want to add: ");
        fillCBean = read.nextInt();
        System.out.println("Write how many disposable cups do you want to add: ");
        fillcups = read.nextInt();
        water += fillWater;
        cups += fillcups;
        milk += fillMilk;
        cbean += fillCBean;
    }

    static void remaining() {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(cbean + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(cash + " of money");
        System.out.println();
    }

    static void exit() {
        exit = true;
    }

    static void take() {
        System.out.println("I gave you $" + cash);
        cash = 0;
    }

    static boolean canMakeCoffee(int waterNeed, int milkNeed, int beansNeed) {
        if (water >= waterNeed) {
            if (milk >= milkNeed) {
                if (cbean >= beansNeed) {
                    System.out.println("I have enough resources, making you a coffee\n!");
                    return true;
                } else {
                    System.out.println("Sorry, not enough beans!");
                    return false;
                }

            } else {
                System.out.println("Sorry, not enough milk!");
                return false;
            }
        } else {
            System.out.println("Sorry, not enough water!");
            return false;
        }
    }

}
