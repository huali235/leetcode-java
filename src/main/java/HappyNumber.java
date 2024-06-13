import java.util.ArrayList;

public class HappyNumber {
    public static void main(String [] args){
        System.out.println(isHappy(2));
    }
    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = sumOfSquaresOfDigits(slow);          // Move slow pointer one step
            fast = sumOfSquaresOfDigits(sumOfSquaresOfDigits(fast));  // Move fast pointer two steps
        } while (slow != fast);  // Check for cycle

        return slow == 1;  // If we reach 1, it's a happy number
    }

    private static int sumOfSquaresOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
