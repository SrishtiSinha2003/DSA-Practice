public class SecondLargest {
    public static int secLarg(int[] arr) {
        int larg = -1;
        int slarg = -1;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > larg) {
                slarg = larg;
                larg = arr[i];
            }
            else if(arr[i] < larg && arr[i] > slarg)
                slarg = arr[i];
        }
        return slarg;
    }
    public static void main(String args[]) {
        int[] arr = {2,4,1,5,2,6,3};
        System.out.println(secLarg(arr));
    }
}
