public class SelectionSort {
    public static void selectionSort(int[] scores) {
        int n = scores.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Assume the first unsorted element is the smallest
            for (int j = i + 1; j < n; j++) {
                if (scores[j] < scores[minIndex]) {
                    minIndex = j; // Found a smaller score? Update minIndex!
                }
            }
            // Swap the found minimum element with the first unsorted element
            int temp = scores[minIndex];
            scores[minIndex] = scores[i];
            scores[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] scores = {64, 25, 12, 22, 11};
        selectionSort(scores);
        System.out.println("Sorted Exam Scores: " + java.util.Arrays.toString(scores));
    }
}