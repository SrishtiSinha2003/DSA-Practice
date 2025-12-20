import java.util.Arrays;

public class assignCookies {
    public static int assign(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int j=0;
        for(int i=0; i<g.length; i++) {
            while(j<s.length && s[j] < g[i])
                j++;
            if(j==s.length) break;
            count++;
            j++;
        }
        return count++;
    }
    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};
        System.out.println(assign(g,s));
    }
}
