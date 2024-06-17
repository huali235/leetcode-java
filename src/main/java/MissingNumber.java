import java.util.ArrayList;
import java.util.Arrays;

/*
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3].
2 is the missing number in the range since it does not appear in nums.
 */
public class MissingNumber {
    public static void main(String[] args) {
        System.out.println(missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
    }

    public static int missingNumber(int[] nums) {
        // Implementing Gauss' formula for space and runtime efficiency
        int sum = (nums.length * (nums.length + 1)) / 2;
        for(int n: nums){
            sum -= n;
        }
        return sum;
    }
}