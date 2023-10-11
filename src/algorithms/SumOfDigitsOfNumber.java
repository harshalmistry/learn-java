package algorithms;

/**
 * Program to find sum of digits of Number
 * Time complexity O(log n)
 * Auxiliary space O(1)
 */
public class SumOfDigitsOfNumber {

    public static void main(String[] args) {
        SumOfDigitsOfNumber sumOfDigitsOfNumber = new SumOfDigitsOfNumber();
        sumOfDigitsOfNumber.start();
    }

    private void start() {
        int number = 999;
        int sum = getSumOfDigits(number);
        System.out.println("Sum of digits of number " + number + " is - " + sum);
    }

    private int getSumOfDigits(int number) {
        int sum;
        for(sum=0; number>0; sum += number%10, number = number/10);
        return sum;
    }
}
