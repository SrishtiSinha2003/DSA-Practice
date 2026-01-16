public class busTicketChallenge {
    public static boolean yesOrNo(int[] arr) {
        int five = 0, ten = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 5) {
                five++;
            }
            else if(arr[i] == 10) {
                if(five == 0) {
                    return false;
                } else {
                    five--;
                    ten++;
                }
            } else {
                if(ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if(five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {5,5,5,10,20};
        System.out.println(yesOrNo(arr));
    }
}
