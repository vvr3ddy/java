package M2;

public class CyclicSum {
    int sumOfDigits(int number) {

        int dig, sum = 0;
        int length = new String(String.valueOf(number)).length();
        //debug statements start

        System.out.println("Inside sumOfDigits");
        System.out.println("Initial Number:" + number);
        System.out.println("Initial Length:" + length);
        System.out.println();

        //debug statements end
        while (length > 0) {

            int pos = (int) Math.pow(10, length - 1);
            dig = (number / pos);
            //debug statement

            System.out.println("Current Digit:" + dig);

            sum += dig;
            number = number - (dig * pos);

            length--;

            //debug statements start

            System.out.println("Current Length:" + length);
            System.out.println("Current number:" + number);
            System.out.println("Current Sum:" + sum);
            System.out.println();

            //debug statements end
        }

        System.out.println("Out of sumOfDigits");
        System.out.println("Final Sum:" + sum);

        return sum;
    }

    int cycSum(int number) {

        int cyclicSum = 0;
        int length = new String(String.valueOf(number)).length();
        int dig = 0;

        System.out.println("Inside cycSum..");

        while (length > 0) {

            int pos = (int) Math.pow(10, length - 1);
            dig = (number / pos);

            System.out.println("Current Digit in cycSum:" + dig);

            cyclicSum += sumOfDigits(number);
            number = number - (dig * pos);
            length--;

            if (number == 0) {
                break;
            }

            System.out.println("====================");
            System.out.println("Cyclic Sum Value : " + cyclicSum);
            System.out.println("====================");
            System.out.println();
        }
        System.out.println("Cyclic Sum :" + cyclicSum);
        return cyclicSum;
    }
}

class Main {
    public static void main(String[] args) {
        CyclicSum cs = new CyclicSum();
        System.out.println(cs.cycSum(58420));
    }
}
