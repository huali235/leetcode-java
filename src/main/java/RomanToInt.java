import java.util.HashMap;
import java.util.Map;
public class RomanToInt {
    public static void main(String[] args){
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s){
        Map<Character, Integer> map = new HashMap<>(){{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};

        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            int currentVal = map.get(s.charAt(i));
            int nextVal = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;
            if (currentVal < nextVal) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        return total;
    }
}
