package selectionSort;

import static selectionSort.SelectionSort.printArray;
import static selectionSort.SelectionSort.selectionSort;

public class SelectionSortRunner {
    public static void main(String[] args) {
        int[] numbers = {100, 3, 15, 25, 10, 1000, 256, 50, 78, 7};
        System.out.println("Unsorted array");
        printArray(numbers);

        selectionSort(numbers);
        System.out.println();

        System.out.println("Sorted array");
        printArray(numbers);
    }
}
