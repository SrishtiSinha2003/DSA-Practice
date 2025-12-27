public class insertElement {
    public static void main(String[] args) {
        int[] arr = {25, 16, 19, 20, 28};
        int value = 5;
        int index = 2;

        int[] newArray = new int[arr.length+1];

        // Copy elements before index
        for(int i=0; i<index; i++) {
            newArray[i] = arr[i];
        }
        //insert value
        newArray[index] = value;
        
        // Shift remaining elements
        for (int i = index; i < arr.length; i++) {
        newArray[i + 1] = arr[i];

        //print result
        for(int x : newArray) {
            System.out.print(x + " ");
        }
        }
    }
}
