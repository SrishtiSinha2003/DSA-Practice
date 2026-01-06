public class reverseOnlyStrings {
    public static String reverse(String s) {
        int left = 0;
        int right = s.length()-1;
        char[] arr = s.toCharArray();
        while(left < right) {
            if(!Character.isLetter(arr[left])) {
                left++;
            }
            else if(!Character.isLetter(arr[right])) {
                right--;
            } else {
                // swap
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverse(s));
    }
}
