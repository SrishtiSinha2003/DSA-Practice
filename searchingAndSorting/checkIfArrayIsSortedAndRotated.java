public class checkIfArrayIsSortedAndRotated {
    public static boolean check(int[] arr){
        int irregularities = 0;
        boolean isIrregular = false;
        int length = arr.length;
        for(int i=0; i<length; i++) {
            if(arr[i] > arr[(i+1)%length]) {
                irregularities += 1;
            }
        }
        if(irregularities > 1) {
            isIrregular = false;
        } else {
            isIrregular = true;
        }
        return isIrregular;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(check(arr));
    }
}
