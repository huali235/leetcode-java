import java.util.HashSet;
public class ContainsDuplicate {
    public static void main(String [] args){
        System.out.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }
    public static boolean containsDuplicate(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int n : nums){
            if(!set.add(n)){
                return true;
            }
        }
        return false;
    }
}
