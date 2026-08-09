import java.util.HashMap;
import java.util.Scanner;

public class JavaDeque {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input n and m
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();

        System.out.print("Enter the window size (m): ");
        int m = sc.nextInt();

        // Create array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // HashMap to store frequency of elements in current window
        HashMap<Integer, Integer> map = new HashMap<>();

        int max = 0;

        // Sliding Window
        for (int i = 0; i < n; i++) {

            // Add current element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // Remove the element that goes out of the window
            if (i >= m) {
                int oldElement = arr[i - m];
                map.put(oldElement, map.get(oldElement) - 1);

                // Remove key if frequency becomes 0
                if (map.get(oldElement) == 0) {
                    map.remove(oldElement);
                }
            }

            // Update maximum distinct elements
            if (i >= m - 1) {
                max = Math.max(max, map.size());
            }
        }

        // Output
        System.out.println("\nMaximum distinct elements in any window = " + max);

        sc.close();
    }
}