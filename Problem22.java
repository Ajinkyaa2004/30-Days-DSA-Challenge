//  First and Last occurrence in a sorted array

public class FirstLastOccurrence {
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;      
                right = mid - 1;   
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

  
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;    
                left = mid + 1;   
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 4, 4, 5, 7, 7, 8, 10}; 
        int target = 4;

        int first = firstOccurrence(numbers, target);
        int last = lastOccurrence(numbers, target);

        if (first == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("First occurrence at index: " + first);
            System.out.println("Last occurrence at index: " + last);
        }
    }
}
