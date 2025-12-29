public class lengthOfTheLastWord {
    public static int length(String s) {
        s = s.trim();
        
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            }
            //space & length > 0 → break
            else if (length > 0) {
                break;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        String s = "Heellooo let us Coodeeee";
        System.out.println(length(s));
    }
}

