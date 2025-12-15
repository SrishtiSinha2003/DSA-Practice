public class findDuplicateNumber {
    public static int duplicate(int[] arr) {
        int slow = arr[0];
        int fast = arr[0];

        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast); //slow and fast meet inside the cycle

        slow = arr[0]; // reset slow to start of the array

        while(slow != fast) {  //Move both slow and fast one step at a time until they meet
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow; //The meeting point is the duplicate number
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(duplicate(arr));
    }
}
