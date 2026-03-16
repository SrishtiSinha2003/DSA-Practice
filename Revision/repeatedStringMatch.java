public class repeatedStringMatch {
    public static int repeat(String a, String b) {
        StringBuilder sb = new StringBuilder(a);
        int count = 1;

        while(sb.length() < b.length()) {
            count++;
            sb.append(a);
        }

        if(sb.indexOf(b) != -1)
            return count;

        sb.append(a);
        count++;

        if(sb.indexOf(b) != -1)
            return count;

        return -1;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";

        System.out.println(repeat(a,b));
    }
}