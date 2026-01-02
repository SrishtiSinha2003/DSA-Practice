public class shuffleString {
    public static String shuffle(String s, int[] indices) {
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        char[] c = new char[n];
        for(int i=0; i<n; i++) {
            c[indices[i]] = s.charAt(i);
        }
        sb.append(c);
        return sb.toString();
    }
    public static void main(String[] args) {
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(shuffle(s, indices));
    }
}
