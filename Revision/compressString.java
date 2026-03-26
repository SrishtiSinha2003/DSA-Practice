public class compressString{
    public static String compress(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=1; i<s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) {
                count++;
            } else {
                sb.append(s.charAt(i-1)).append(count);
                count = 1;
            }
        }
        sb.append(s.charAt(s.length()-1)).append(count);
        if(sb.length() < s.length()) {
            return sb.toString();
        } else {
            return s;
        }
    }
    public static void main(String[] args){
        String s = "aabcccccaaa";
        System.out.println(compress(s));
    }
}