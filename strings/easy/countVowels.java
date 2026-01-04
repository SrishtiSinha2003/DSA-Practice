import java.util.ArrayList;
import java.util.List;

public class countVowels {
    public static List<Integer> count(String s) {
        List<Integer> result = new ArrayList<>();
        int countV = 0;
        int countC = 0;
        s = s.toLowerCase();
        for(char ch : s.toCharArray()) {
            // ignore non-letter characters
            if (!Character.isLetter(ch)) {
                continue;
            }
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                countV++;
            } else {
                countC++;
            }
        }
        result.add(countC);
        result.add(countV);
        return result;
    }
    public static void main(String[] args) {
        String s = "akh72hkpqiwu93bcOU";
        List<Integer> result = count(s);
        System.out.println("Vowel count : " + result.get(1));
        System.out.println("Consonant count : " + result.get(0));
    }
}
