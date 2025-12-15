import java.util.*;
public class PrintArray {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in array : ");
    int n = sc.nextInt();
    int arr[] = new int[n];

    for(int i=0; i<n; i++) {
        arr[i] = sc.nextInt();
    }

    for(int elements : arr) {
        System.out.println(elements + " ");
    }
        
    sc.close();



        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the number of elements in the array: ");
        // int n = scanner.nextInt();
        // int[] array = new int[n];

        // for (int i = 0; i < n; i++) {
        //     array[i] = scanner.nextInt();
        // }
        
        // System.out.println("The elements of the array are:");
        // for (int element : array) {
        //     System.out.print(element + " ");
        // }
        
        // scanner.close();


        // int[] a = {1,2,3,4};
        // SOP(Arrays.toString(a));
    }
}
