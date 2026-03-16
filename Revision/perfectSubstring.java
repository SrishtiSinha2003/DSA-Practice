public class perfectSubstring {

    public static boolean isperfect(String s) {
        for(int i=1;i<s.length();i++) {
            if(s.charAt(i)!=s.charAt(0)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

        String s="aacabbaa";
        int cuts=0;

        while(!isperfect(s)) {

            if(s.length()%2!=0) {
                cuts=-1;
                break;
            }

            String left=s.substring(0,s.length()/2);
            String right=s.substring(s.length()/2);

            cuts++;

            if(isperfect(left) || isperfect(right)) {
                break;
            }

            s=left;
        }

        System.out.println(cuts);
    }
}