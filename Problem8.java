// Reverse each word in a sentence

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

      
        String[] words = sentence.split(" ");

        StringBuilder result = new StringBuilder();

        
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            result.append(sb.reverse()).append(" ");
        }


        System.out.println("Reversed words: " + result.toString().trim());

        sc.close();
    }
}
