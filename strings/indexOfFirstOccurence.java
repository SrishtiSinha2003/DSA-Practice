public class indexOfFirstOccurence {
    public static int strStr(String haystack, String needle) {
        if (needle.length() == 0) return 0;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j = 0;

            while (j < needle.length() &&
                   haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            if (j == needle.length()) {
                return i; // full match found
            }
        }

        return -1; // no match
    }


/*
for(int i=0; i<haystack.length() - needle.length() + 1; i++) 
        if(haystack.substring(i, needle.length() + i).equals(needle)) 
            return i;
    return -1; */


    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";
        System.out.println(strStr(haystack,needle));
    }
}
