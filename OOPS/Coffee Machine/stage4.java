package machine;

import java.util.Scanner;

public class CoffeeMachine {

    static String action;
    static Integer buy;
    static Integer fillWater, fillMilk, fillCBean, fillcups;
    static Integer cash = 550, water = 1200, milk = 540, cbean = 120, cups = 9;


    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        action = read.nextLine();
        summary();
        switch (action) {
            case "buy": {
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                buy = read.nextInt();
                switch (buy) {
                    case 1: {
                        cash += 4;
                        water -= 250;
                        cbean -= 16;
                        cups --;
                        break;
                    }
                    case 2: {
                        cash += 7;
                        water -= 350;
                        milk -= 75;
                        cbean -= 20;
                        cups --;
                        break;
                    }
                    case 3: {
                        cash += 6;
                        water -= 200;
                        milk -= 100;
                        cbean -= 12;
                        cups --;
                        break;
                    }
                }
                break;
            }
            case "fill": {
                System.out.println("Write how many ml of water do you want to add:");
                fillWater = read.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                fillMilk = read.nextInt();
                System.out.println("Write how many grams of coffee beans do you want to add:");
                fillCBean = read.nextInt();
                System.out.println("Write how many disposable cups of coffee do you want to add:");
                fillcups = read.nextInt();
                water += fillWater;
                milk += fillMilk;
                cbean += fillCBean;
                cups += fillcups;
                break;
            }
            case "take": {
                System.out.println("I gave you $" + cash);
                cash = 0;

            }
            break;
        }
        summary();
    }

    static public void summary() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(cbean + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(cash + " of money");
        System.out.print("Write action (buy, fill, take): ");

    }
}
