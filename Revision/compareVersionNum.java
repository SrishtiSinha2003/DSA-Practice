public class compareVersionNum {
    public static int compare(String s1, String s2) {
        String[] ss1 = s1.split("\\.");
        String[] ss2 = s2.split("\\.");

        int len = Math.max(ss1.length, ss2.length);

        for(int i=0; i<len; i++) {
            int num1 = i < ss1.length ? Integer.parseInt(ss1[i]) : 0;
            int num2 = i < ss2.length ? Integer.parseInt(ss2[i]) : 0;

            if(num1 < num2) return -1;
            if(num1 > num2) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        String s1 = "1.2";
        String s2 = "1.10";
        System.out.print(compare(s1, s2));
    }
}
