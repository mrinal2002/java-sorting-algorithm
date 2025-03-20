public class MergeSort {
    public static void mergeSort(int[] prices, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2; // Split the array in half
            mergeSort(prices, left, mid); // Sort the left half
            mergeSort(prices, mid + 1, right); // Sort the right half
            merge(prices, left, mid, right); // Merge the two halves
        }
    }

    public static void merge(int[] prices, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1]; // Left array
        int[] R = new int[n2]; // Right array

        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) L[i] = prices[left + i];
        for (int j = 0; j < n2; j++) R[j] = prices[mid + 1 + j];

        // Merge the temp arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                prices[k] = L[i]; // Left is smaller? Take it!
                i++;
            } else {
                prices[k] = R[j]; // Right is smaller? Take it!
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            prices[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            prices[k] = R[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] prices = {38, 27, 43, 3, 9, 82, 10};
        mergeSort(prices, 0, prices.length - 1);
        System.out.println("Sorted Book Prices: " + java.util.Arrays.toString(prices));
    }
}