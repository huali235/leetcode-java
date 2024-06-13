import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String [] args){
        System.out.println(majorityElement(new int []{1, 2, 2, 3, 2}));
    }
    public static int majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            if(map.containsKey(num)){
                int currentVal = map.get(num);
                int newVal = currentVal + 1;
                map.put(num, newVal);
            } else {
                map.put(num, 1);
            }
        }
        int maxKey = 0;
        int maxVal = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            if (value > maxVal) {
                maxKey = key;
                maxVal = value;
            }
        }
        return maxKey;
    }
}
