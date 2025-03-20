public class BubbleSort {
    public static void bubbleSort(int[] marks) {
        int n = marks.length;
        boolean swapped; // Did we swap? Let's find out!
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (marks[j] > marks[j + 1]) {
                    // Time to swap! Marks are not in order!
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                    swapped = true; // swap
                }
            }
            if (!swapped) break; // No swaps? We're done here!
        }
    }

    public static void main(String[] args) {
        int[] marks = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(marks);
        System.out.println("Sorted Marks: " + java.util.Arrays.toString(marks));
    }
}