//import java.util.HashMap;
import java.util.Arrays;

public class ValidAnagram {
    public static void main(String [] args){
        System.out.println(isAnagram("rat", "car"));
    }
    // A more efficient solution
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(sArray);
        Arrays.sort(tArray);

         return Arrays.equals(sArray, tArray);
    }

    // My first solution
//    public static boolean isAnagram(String s, String t){
//        HashMap<Character, Integer> firstMap = createMap(s);
//        HashMap<Character, Integer> secondMap = createMap(t);
//        System.out.println(firstMap);
//        System.out.println(secondMap);
//        return firstMap.equals(secondMap);
//    }
//
//    private static HashMap<Character, Integer> createMap(String s){
//        HashMap <Character, Integer> map = new HashMap<>();
//        for(char c: s.toCharArray()){
//            map.put(c, map.getOrDefault(c,0) +  1);
//        }
//        return map;
//    }
}
