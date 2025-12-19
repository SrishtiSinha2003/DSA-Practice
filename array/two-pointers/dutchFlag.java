public class dutchFlag {
    public static void sort(int[] arr) {
        int[] count = new int[3];
        for(int num : arr) {
            count[num]++;
        }
        int idx = 0;
        for(int i=0; i<count[0]; i++) {
            arr[idx++] = 0;
        }
        for(int i=0; i<count[1]; i++) {
            arr[idx++] = 1;
        }
        for(int i=0; i<count[2]; i++) {
            arr[idx++] = 2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sort(arr);
        for(int x : arr) {
            System.out.println(x+ " ");
        }
    }
}
