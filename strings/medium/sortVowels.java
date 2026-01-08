import java.util.ArrayList;
import java.util.Collections;
public class sortVowels {

    public static String sort(String s) {
        int n = s.length();
        ArrayList<Character> vow = new ArrayList<>();
        ArrayList<Integer> pos = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') { // condition to check for vowel
                vow.add(ch);
                pos.add(i); // storing positions of vowel
            }
        }
        
        Collections.sort(vow);
        
        char[] answer = s.toCharArray();
        for (int i = 0; i < pos.size(); i++) {
            answer[pos.get(i)] = vow.get(i);
        }
        
        return new String(answer);
    }
    public static void main(String[] args) {
        String s = "lEetcOde";
        System.out.println(sort(s));
    }
}

