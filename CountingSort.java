public class CountingSort {
    public static void countingSort(int[] ages) {
        int max = 18; // Maximum age is 18
        int min = 10; // Minimum age is 10
        int range = max - min + 1; // Range of ages
        int[] count = new int[range]; // Count array to store frequencies
        int[] output = new int[ages.length]; // Output array to store sorted ages

        // Count the frequency of each age
        for (int age : ages) {
            count[age - min]++;
        }

        // Compute cumulative frequencies
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in their correct positions in the output array
        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        // Copy the sorted elements back to the original array
        System.arraycopy(output, 0, ages, 0, ages.length);
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 18, 14, 11};
        countingSort(ages);
        System.out.println("Sorted Ages: " + java.util.Arrays.toString(ages));
    }
}