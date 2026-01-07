public class maxValueOfStringInArray {
    public static int value(String[] strs) {
        int maxValue = 0;
        for(String s : strs) {
            boolean isNumeric = true;

            for(int i=0; i<s.length(); i++) {
                if(!Character.isDigit(s.charAt(i))) {
                    isNumeric = false;
                    break;
                }
            }
            int value;
            if(isNumeric) {
                value = Integer.parseInt(s);
            } else {
                value = s.length();
            }
            maxValue = Math.max(value, maxValue);
        }
        return maxValue;
    }
    public static void main(String[] args) {
        String[] strs = {"alic3","bob","3","4","00000"};
        System.out.println(value(strs));
    }
}
