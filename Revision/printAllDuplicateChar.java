import java.util.HashMap;
import java.util.Map;
public class printAllDuplicateChar {
    public static void print(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.print("['" + entry.getKey() + "', " + entry.getValue() + "], ");
            }
        }
    }
    public static void main(String[] args) {
        String s ="geeksforgeeks";
        print(s);
    }
}
