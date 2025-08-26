// Check if two strings are anagrams

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().toLowerCase().replaceAll("\\s+", ""); // ignore case & spaces
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().toLowerCase().replaceAll("\\s+", "");

        if (str1.length() != str2.length()) {
            System.out.println("Not Anagrams");
        } else {

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
        sc.close();
    }
}
