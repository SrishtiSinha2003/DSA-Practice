import java.util.*;
public class groupAnagrams {
    public static List<List<String>> anagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);                 // create signature
            String key = new String(arr);

            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
         List<List<String>> result = anagrams(strs);

        // Print the result
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
