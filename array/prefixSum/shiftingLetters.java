public class shiftingLetters {
    public static String shift(int[] shifts, String s) {
        int n = s.length();
        char[] arr = s.toCharArray();

        int totalShift = 0;

        for(int i=n-1; i>=0; i--) {
            totalShift = (totalShift + shifts[i]) % 26;
            int shiftedChar = (arr[i] - 'a' + (int) totalShift) % 26;
            arr[i] = (char) ('a' + shiftedChar);
        }
        return new String(arr);
    }
    public static void main(String args[]) {
        String s = "abc";
        int[] shifts = {3,5,9};
        System.out.println(shift(shifts, s));
    }
}
