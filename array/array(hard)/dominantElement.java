import java.util.*;
public class dominantElement {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in); // Create a scanner for input

        int t = sc.nextInt(); // Read the number of test cases
        while (t-- > 0) { // Loop through each test case
            int n = sc.nextInt(); // Read the number of elements in the current test case
            int[] a = new int[n]; // Array to store the elements
            Map<Integer, Integer> freq = new HashMap<>(); // Map to store frequency of each element

            // Read the elements into the array and count their frequencies
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt(); // Read the element
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1); // Increment the count for this element
            }

            int max_freq = 0; // Variable to hold the maximum frequency
            int max_freq_count = 0; // Variable to count how many elements have the maximum frequency

            // Iterate through the frequency map to find the maximum frequency and its count
            for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
                int count = entry.getValue();
                if (count > max_freq) {
                    max_freq = count; // Update max frequency if a higher frequency is found
                    max_freq_count = 1; // Reset the count since we found a new max
                } else if (count == max_freq) {
                    max_freq_count++; // Increment the count for another element with the same max frequency
                }
            }

            // Check if only one element has the maximum frequency
            System.out.println(max_freq_count == 1 ? "YES" : "NO"); // Output YES or NO

        }
        sc.close(); // Close the scanner
    }
}
