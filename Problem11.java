// Two Sum problem

import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }


        System.out.print("Enter target: ");
        int target = sc.nextInt();

      
        HashMap<Integer, Integer> map = new HashMap<>();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                System.out.println("Indices: " + map.get(complement) + " and " + i);
                found = true;
                break;
            }

            
            map.put(nums[i], i);
        }

        if (!found) {
            System.out.println("No two numbers found with the given target.");
        }

        sc.close();
    }
}
