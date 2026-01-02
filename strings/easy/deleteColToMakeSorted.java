public class deleteColToMakeSorted {
    public static int delete(String[] strs) {
        int deleteCount = 0;
        int n = strs.length;
        int m = strs[0].length();
        for(int i=0; i<m; i++) { //through each column
            for(int j=1; j<n; j++) { // through each word
                if(strs[j].charAt(i) < strs[j-1].charAt(i)) {
                    deleteCount++;
                    break;
                }
            }
        }
        return deleteCount;
    }
    public static void main(String[] args) {
        String[] strs = {"abc", "bce", "cae"};
        System.out.println(delete(strs));
    }
}
