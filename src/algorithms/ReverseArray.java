package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Write a program to reverse array.
 * Time complexity O(n)
 * Auxiliary space O(1)
 */
public class ReverseArray {

    public static void main(String[] args) {
        ReverseArray reverseArray = new ReverseArray();
        reverseArray.start();
    }

    private void start() {
        // initialize an array
        int[] ints = new int[]{1, 2, 3};
        System.out.println("Initial array");
        printArrayV1(ints);
        System.out.println("Reversing array");
        printArrayV1(ints);
        System.out.println("Array after reverse");
        reverseArray(ints);
        printArrayV1(ints);
    }

    private void reverseArray(int[] ints) {
        int start = 0;
        int end = ints.length - 1;

        while(start < end){
            int temp = ints[start];
            ints[start] = ints[end];
            ints[end] = temp;
            start++;
            end--;
        }
    }

    private void printArrayV1(int[] ints){
        String collect = Arrays.stream(ints).mapToObj(n -> "" + n).collect(Collectors.joining(", ", "[", "]"));
        System.out.println(collect);
    }

    private void printArray(int[] ints) {
        System.out.print("{ ");
        for(int i=0; i<ints.length; i++){
            System.out.print(ints[i] + ", ");
        }
        System.out.print("}");
    }
}
