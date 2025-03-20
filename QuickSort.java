public class QuickSort {
    public static void quickSort(int[] prices, int low, int high) {
        if (low < high) {
            int pi = partition(prices, low, high); // Partition the array
            quickSort(prices, low, pi - 1); // Sort the left part
            quickSort(prices, pi + 1, high); // Sort the right part
        }
    }

    public static int partition(int[] prices, int low, int high) {
        int pivot = prices[high]; // Pick the last element as pivot
        int i = low - 1; // Index of smaller element
        for (int j = low; j < high; j++) {
            if (prices[j] < pivot) {
                i++;
                // Swap prices[i] and prices[j]
                int temp = prices[i];
                prices[i] = prices[j];
                prices[j] = temp;
            }
        }
        // Swap prices[i+1] and pivot
        int temp = prices[i + 1];
        prices[i + 1] = prices[high];
        prices[high] = temp;
        return i + 1; // Return the partition index
    }

    public static void main(String[] args) {
        int[] prices = {10, 7, 8, 9, 1, 5};
        quickSort(prices, 0, prices.length - 1);
        System.out.println("Sorted Product Prices: " + java.util.Arrays.toString(prices));
    }
}