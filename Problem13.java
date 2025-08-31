// Frequency of elements in an array
import java.util.*;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 30, 40, 20};

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        System.out.println("Element frequencies:");
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
