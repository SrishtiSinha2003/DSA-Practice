public class bubbleSort {
    public static void sort(int[] arr) {
        int i,j, temp;
        boolean swapped;
        for(i=0; i<arr.length-1; i++) {
            swapped = false;
            for(j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
            break;
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sort(arr);
        for(int x : arr) {
            System.out.print(x+" ");
        }
    }
}
