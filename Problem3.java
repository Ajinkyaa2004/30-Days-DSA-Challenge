// Find the missing number in 1…n
import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (range 1 to n): ");
        int n = sc.nextInt();
        int[] arr = new int[n - 1]; 
        System.out.println("Enter " + (n - 1) + " numbers:");
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        int totalSum = n * (n + 1) / 2;
        int missing = totalSum - sum;
        System.out.println("Missing number is: " + missing);
        sc.close();
    }
}
