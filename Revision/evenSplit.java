public class evenSplit {
    public static boolean even(int num) {
        if(num > 4 &&  num % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        System.out.print(even(n));
        System.out.println(even(m));
    }
}
