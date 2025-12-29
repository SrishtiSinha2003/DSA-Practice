import java.util.*;
public class wordPattern {
    public static boolean wordPattrn(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        for(int i=0; i<pattern.length(); i++) {
            char ch = pattern.charAt(i);
            String word = str[i];

        if(map1.containsKey(ch)) {
            if(!map1.get(ch).equals(word)) return false;
       }else {
        if(map2.containsKey(word)) return false;
        map1.put(ch, word);
        map2.put(word, ch);
        }
    }
    return true;
}
public static void main(String[] args) {
    String pattern = "abba", s = "dog cat cat dog";
    System.out.println(wordPattrn(pattern, s));
}
}