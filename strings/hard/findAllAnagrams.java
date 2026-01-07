import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class findAllAnagrams {
    public static List<Integer> find(String s, String p) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        List<Integer> list = new ArrayList<>();

        if(s.length() < p.length()) {
            return list;
        }
        for(int i=0; i<p.length(); i++) {
            freq1[s.charAt(i) - 'a']++;
            freq2[p.charAt(i) - 'a']++;
        }
        int start = 0, end = p.length();

        if(Arrays.equals(freq1, freq2)) {
            list.add(start);
        }
        while(end < s.length()) {
            freq1[s.charAt(start) - 'a']--;
            freq1[s.charAt(end) - 'a']++;

            start++;
            end++;

            if(Arrays.equals(freq1, freq2)) {
                list.add(start);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> result = find(s, p);
        System.out.println(result);
    }
}
