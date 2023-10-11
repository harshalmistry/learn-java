package algorithms;

/**
 * Program to find is string palindrome
 */
public class PalindromeString {
    public static void main(String[] args) {
        PalindromeString palindromeString = new PalindromeString();
        palindromeString.start();
    }

    private void start() {
        String sampleString = "racecar";
        boolean result = isPalindromeString(sampleString);
        if (result) {
            System.out.println(sampleString + " is palindrome");
        }
        else{
            System.out.println(sampleString + " is not palindrome");
        }
    }

    private boolean isPalindromeString(String sampleString) {
        int start = 0;
        int end = sampleString.length() - 1;
        while(start<=end){
            if(sampleString.charAt(start) != sampleString.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
