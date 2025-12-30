import java.util.Arrays;

public class reverseString {
    public static void reverse(String[] s) {
        int i=0;
        int j = s.length-1;
        while(i<=j) {
            String temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        String[] s = {"h","e","l","l","o"};
        reverse(s);
        System.out.println(Arrays.toString(s));
    }
}

/*// User function Template for Java

class Solution {
    public static String reverseString(String s) {
        // code here
        char[] arr = s.toCharArray();
        int i = 0, j = arr.length - 1;

        while (i < j) {
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return new String(arr);
    }
}

    
 */
