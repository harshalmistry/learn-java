package basics;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.Arrays.sort;

public class ArraysExample {

    public static void main(String[] args) {

        int[] srcArray = {-5, -2, -3, 0, 1, 7, 4, 3, 5, 6, 2, 8, 9, 10};
        System.out.println("Source Array");
        System.out.println(Arrays.toString(srcArray));
        // copy Array - system class
        int[] destArray = new int[3];
        System.arraycopy(srcArray, 2, destArray, 0, 3);
        System.out.println(Arrays.toString(destArray));
        System.out.println("Array copied 3 elements from index 2 ");
        System.out.println(Arrays.toString(destArray));
        // copy array - arrays class
        int[] copiedArray = Arrays.copyOfRange(srcArray, 2, 5);
        System.out.println(Arrays.toString(copiedArray));
        System.out.println("Array copied 3 elements from index 2 - using Arrays");
        System.out.println(Arrays.toString(copiedArray));

        // compare two arrays
        int isSame = Arrays.compare(destArray, copiedArray);
        System.out.println("Both above copied arrays are same? - " + isSame);

        // sort array
        // it is also possible to use parallelSort for fast processing
        sort(srcArray);
        System.out.println("Sorted array");
        System.out.println(Arrays.toString(srcArray));
        // this is not possible, need to convert into wrapper class
        //sort(srcArray, Comparator<Integer>.reverseOrder());

        // binary search - array  must be sorted
        int key = 5;
        // here returned index is insertion point, the ideal place key would be inserted into array
        // it is not always -1 so keep in mind
        int index = Arrays.binarySearch(srcArray, key);
        System.out.println("Index of key " + key + " in array is -> " + index);
        // search non-existing key
        key = 11;
        index = Arrays.binarySearch(srcArray, key);
        System.out.println("Index of key " + key + " in array is -> " + index);

        // fill array
        Arrays.fill(copiedArray, 8);
        System.out.println("Override copied array to value 8");
        System.out.println(Arrays.toString(copiedArray));

        // convert array to list
        List<int[]> ints = Arrays.asList(srcArray);
        System.out.println(Arrays.toString(ints.get(0)));
        // why different above and below?
        List<Integer> integers = Arrays.asList(1, 2, 4, 5);
        System.out.println(integers);

        // stream array
        int sum = Arrays.stream(srcArray).sum();
        System.out.println("Sum of all elements in array is -> " + sum);
    }
}
