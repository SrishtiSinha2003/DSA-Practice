public class findTheIndexOfFirstOccurence {
    public static int find(String haystack, String needle) {
        for(int i=0; i<haystack.length() - needle.length() + 1; i++) {
            if(haystack.substring(i, needle.length() + i).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.print(find(haystack, needle));
    }
}
