public interface largestOddNumber {
    public static String get(String s) {
        for(int i=s.length()-1; i>=0; i--) {
            if(Character.getNumericValue(s.charAt(i)) % 2 == 1) {
                return s.substring(0, i+1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        String s = "56";
        System.out.print(get(s));
    }
}
