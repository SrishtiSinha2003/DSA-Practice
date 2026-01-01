public class plusOne {
    public static int[] plus(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;        
    }
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        plus(digits);
        for(int x : digits) {
            System.out.println(x + " ");
        }
    }
}
