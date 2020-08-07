package M2;

public class CyclicSum {
    int sumOfDigits(int number) {
        int rem, dig, sum = 0;
        int length = new String(String.valueOf(number)).length();
        System.out.println("Inside sumOfDigits");
        System.out.println("Initial Number:" + number);
        System.out.println("Iniial Length:" + length);
        System.out.println();
        while (length >= 0) {
            int pos = (int) Math.pow(10, length);
            dig = (number / pos);
            System.out.println("Current Digit:" + dig);
            sum += dig;
            number = number - (dig * pos);
            length--;
            System.out.println("Current Length:" + length);
            System.out.println("Current number:" + number);
            System.out.println("Current Sum:" + sum);
            System.out.println();
        }
        System.out.println("Out of sumOfDigits");
        System.out.println("Final Sum:" + sum);
        return sum;
    }

    int cycSum(int number) {
        int cyclicSum = 0;
        System.out.println("Inside cycSum..");
        while (number > 0) {
            cyclicSum += sumOfDigits(number);
            number /= 10;
            System.out.println("====================");
            System.out.println("Cyclic Sum Value : "+ cyclicSum);
            System.out.println("====================");
        }
        return cyclicSum;
    }
}

class Main {
    public static void main(String[] args) {
        CyclicSum cs = new CyclicSum();
        System.out.println(cs.cycSum(123));
    }
}
