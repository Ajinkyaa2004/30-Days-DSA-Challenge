// Print all subsets of a set/array
import java.util.*;

public class SubsetsRecursive {
    public static void printSubsets(int[] arr, int index, List<Integer> current) {
        // Base case: if we've considered all elements
        if (index == arr.length) {
            System.out.println(current);
            return;
        }

        // Case 1: Exclude current element
        printSubsets(arr, index + 1, current);

        // Case 2: Include current element
        current.add(arr[index]);
        printSubsets(arr, index + 1, current);

        // Backtrack (remove last added element)
        current.remove(current.size() - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        printSubsets(arr, 0, new ArrayList<>());
    }
}
