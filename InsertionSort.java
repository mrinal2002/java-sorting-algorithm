public class InsertionSort {
    public static void insertionSort(int[] employeeIDs) {
        int n = employeeIDs.length;
        for (int i = 1; i < n; i++) {
            int key = employeeIDs[i]; // The "key" employee we're sorting
            int j = i - 1;
            // Move employees with higher IDs to the right
            while (j >= 0 && employeeIDs[j] > key) {
                employeeIDs[j + 1] = employeeIDs[j];
                j--; // Keep moving left!
            }
            employeeIDs[j + 1] = key; // Place the key in its rightful place
        }
    }

    public static void main(String[] args) {
        int[] employeeIDs = {12, 11, 13, 5, 6};
        insertionSort(employeeIDs);
        System.out.println("Sorted Employee IDs: " + java.util.Arrays.toString(employeeIDs));
    }
}