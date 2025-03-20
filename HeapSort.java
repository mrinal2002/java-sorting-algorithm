public class HeapSort {
    public static void heapSort(int[] salaries) {
        int n = salaries.length;
        // Build a max heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(salaries, n, i);
        }
        // Extract elements from the heap one by one
        for (int i = n - 1; i > 0; i--) {
            // Move current root to the end
            int temp = salaries[0];
            salaries[0] = salaries[i];
            salaries[i] = temp;
            // Heapify the reduced heap
            heapify(salaries, i, 0);
        }
    }

    public static void heapify(int[] salaries, int n, int i) {
        int largest = i; // Initialize largest as root
        int left = 2 * i + 1; // Left child
        int right = 2 * i + 2; // Right child
        // If left child is larger than root
        if (left < n && salaries[left] > salaries[largest]) {
            largest = left;
        }
        // If right child is larger than largest so far
        if (right < n && salaries[right] > salaries[largest]) {
            largest = right;
        }
        // If largest is not root
        if (largest != i) {
            int swap = salaries[i];
            salaries[i] = salaries[largest];
            salaries[largest] = swap;
            // Recursively heapify the affected sub-tree
            heapify(salaries, n, largest);
        }
    }

    public static void main(String[] args) {
        int[] salaries = {12, 11, 13, 5, 6, 7};
        heapSort(salaries);
        System.out.println("Sorted Salaries: " + java.util.Arrays.toString(salaries));
    }
}