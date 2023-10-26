package selectionSort;

public class SelectionSort {
    // Implementation of selection sorting algorithm
    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int currentPos = i;
            int minElement = numbers[i];

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < minElement) {
                    currentPos = j;
                    minElement = numbers[j];
                }
            }
            numbers[currentPos] = numbers[i];
            numbers[i] = minElement;
        }
    }

    // Method for printing array
    public static void printArray(int[] numbers) {
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}
