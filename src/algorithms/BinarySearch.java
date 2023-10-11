package algorithms;

/**
 * Program to find an element in array using binary search
 * Time complexity O(log n)
 * Auxiliary space O(1)
 */
public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        binarySearch.start();
    }

    private void start() {

        // initialize array
        int[] ints = new int[]{1, 3, 5, 6, 8, 9, 10};
        int numberToFind = 4;

        int result = findNumber(ints, numberToFind);

        if (result == -1){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found in array at " + result);
        }

    }

    private int findNumber(int[] array, int numberToFind) {
        int left = 0;
        int right = array.length -1;

        while (left<=right){
            int mid = left + (right-left)/2;

            if (array[mid] == numberToFind){
                return mid;
            }
            else if (array[mid] < numberToFind){
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
